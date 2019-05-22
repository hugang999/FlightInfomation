<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html>
<head>
<title>航班查询</title>
<script type="text/javascript">
	var basePath = "<%=basePath%>";
</script>
<script src="<%=basePath%>/js/jquery-3.3.1.min.js"></script>
<script src="<%=basePath%>/js/main.js"></script>
<link rel="stylesheet" href="<%=basePath%>/css/main.css" type="text/css">


</head>
<body>
	<div align="center">
		<h2>航班查询</h2>
		<form action="<%=basePath%>/flights/queryByCondition.do" onsubmit="return checkDate()">
			<table style="width: 60%">
				<tr>
					<td><label>日期:</label> <input id="flight_date"
						name="flight_date" type="text" value=${flight_date }> <label>&nbsp;&nbsp;起始地点：</label><input
						id="tak_airport_name" name="tak_airport_name" type="text" value=${tak_airport_name }><label>&nbsp;&nbsp;到达地点：</label><input
						id="landing_airport_name" name="landing_airport_name" type="text" value=${landing_airport_name }>&nbsp;&nbsp;
						<input class="btn" type="submit" value="搜索">
					</td>
				</tr>
			</table>
		</form>

		<table style="width: 60%">
			<tr style="background: #87CEFF; font-weight: bold; height: 60px;">
				<td width="25%">航空公司/航班机型</td>
				<td width="10%">起降时间</td>
				<td width="20%">机场</td>
				<td width="10%">飞行时长</td>
				<td width="10%">经停</td>
				<td width="10%">参考报价</td>
			</tr>
			<c:choose>
				<c:when test="${not empty flightDatas}">
					<c:forEach var="flightData" items="${flightDatas}"
						varStatus="status">
						<tr
							<c:if test="${not empty flightData.flights}"> id=${flightData.flights.id}</c:if>
							<c:if test="${status.count % 2 == 1 }"> style="background-color:#90EE90";</c:if>
							<c:if test="${status.count % 2 == 0 }"> style="background-color:#E0FFFF";</c:if>>
							<td>${flightData.flights.airline}<br>${flightData.flights.type}</td>
							<td>${flightData.flights.take_time}<br>${flightData.flights.landing_time}</td>
							<td>${flightData.tak_airport_name}<br>${flightData.landing_airport_name}</td>
							<td>${flightData.flights.flight_time}</td>
							<c:choose>
								<c:when test="${not empty flightData.flights.stop_airport}">
									<td>${flightData.flights.stop_airport}</td>
								</c:when>
								<c:when test="${empty flightData.flights.stop_airport}">
									<td>无经停</td>
								</c:when>
							</c:choose>
							<td>￥${flightData.flights.reference_pric}<br><input onclick="queryTickets(${flightData.flights.id})" type="button" value="查询机票"></td>
						</tr>
						<tr id=${flightData.flights.id} style="display: none">
						</tr>
						<tr id=${flightData.flights.id }${"_1"} style="display: none">
						</tr>
					</c:forEach>
				</c:when>
				<c:when test="${empty flightDatas}">
					<c:if test="${not empty flight_date}">
						<tr>
							<td colspan="6">未查询到航班信息</td>
						</tr>
					</c:if>
				</c:when>
			</c:choose>

		</table>
	</div>
</body>
</html>
