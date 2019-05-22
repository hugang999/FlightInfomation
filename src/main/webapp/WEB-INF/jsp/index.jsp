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
<script src="<%=basePath%>/js/jquery-3.3.1.min.js"></script>
<link rel="stylesheet" href="<%=basePath%>/css/main.css" type="text/css">
<link rel="stylesheet" href="<%=basePath%>/css/bootstrap.css"
	type="text/css">

</head>
<body>
	<div align="center">
		<h2>航班查询</h2>
		<form action="<%=basePath%>/flights/queryByCondition.do">
			<table style="width: 60%">
				<tr>
					<td><label>日期:</label> <input id="flight_date"
						name="flight_date" type="text"> <label>&nbsp;&nbsp;起始地点：</label><input
						id="tak_airport_name" name="tak_airport_name" type="text"><label>&nbsp;&nbsp;到达地点：</label><input
						id="landing_airport_name" name="landing_airport_name" type="text">&nbsp;&nbsp;
						<input class="btn btn-primary btn-sm" type="submit" value="搜索">
					</td>
				</tr>
			</table>
		</form>

		<table class="table table-bordered" style="width: 60%">
			<tr style="background: #87CEFF; font-weight: bold; height: 60px;">
				<td>航空公司/航班机型</td>
				<td>起降时间</td>
				<td>机场</td>
				<td>飞行时长</td>
				<td>经停</td>
				<td>参考报价</td>
			</tr>
			<c:choose>
				<c:when test="${not empty flightDatas}">
					<c:forEach var="flightData" items="${flightDatas}"
						varStatus="status">

						<tr
							<c:if test="${status.count % 2 == 0 }"> style="background-color:#F0F8FF";</c:if>>
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
							<td>${flightData.flights.reference_pric}</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:when test="${empty flightData}">
					<tr>
						<td colspan="6">没有数据</td>
					</tr>
				</c:when>
			</c:choose>

		</table>
	</div>
</body>
</html>
