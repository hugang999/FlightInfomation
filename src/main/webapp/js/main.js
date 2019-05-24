$(function() {

});

function queryTickets(id) {
	var tr = $("#"+id);
	$.ajax({
		type : "get",
		url : basePath + '/flights/queryTicketByFlightId.do?flightId=' + id,
		data : null,
		success : function(result){
			var insHtml = "";
			$("#" + id + "noDataId").remove();
			if(result.data.length > 0){
				$(result.data).each(function(n,d) {
					//拼接表格
					insHtml +='<tr style="background:#CDB38B" id=' + d.id + '><td colspan=\"2\">'+ d.sell_company +'</td><td colspan=\"2\">￥'+ d.ticket_price +'</td></tr>';
					$("#"+d.id).remove();
				});
			} else {
				insHtml = '<tr id="'+id+'noDataId"><td colspan=\"6\">未查询到机票信息</td></tr>'
			}
			tr.after(insHtml);
		}
	});
}

//表单验证
function checkDate(){
	var regex = new RegExp("^(?:(?:([0-9]{4}(-|\/)(?:(?:0?[1,3-9]|1[0-2])(-|\/)(?:29|30)|((?:0?[13578]|1[02])(-|\/)31)))|([0-9]{4}(-|\/)(?:0?[1-9]|1[0-2])(-|\/)(?:0?[1-9]|1\\d|2[0-8]))|(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))(-|\/)0?2(-|\/)29))))$"); 
	var date = $("#flight_date").val();
	var tak_city = $("#tak_airport_name").val();
	var lan_city = $("#landing_airport_name").val();
	if (date.trim() == "" || null == date){
		alert("日期不能为空");
		return false;
	}
	if (tak_city.trim() == "" || null == date){
		alert("起始地不能为空");
		return false;
	}
	if (lan_city.trim() == "" || null == date){
		alert("到达地不能为空");
		return false;
	}
	//验证日期格式
	if (!regex.test(date)){
		alert("输入的日期格式不正确，应为：2018-08-08或2018/08/08");
		return false;
	}
	return true;
}