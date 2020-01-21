<%@ tag language="java" pageEncoding="UTF-8"%>

<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap_pulse.min.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    function isCheck() {
		if(jQuery('#bets-form input[type=checkbox]:checked').length) {
			var a = confirm("Нажимая 'OK' вы подтверждаете ставку");
    		if (a == true){
    			$('#bets-form').attr('action', "addbet.html");
    			alert("Ставка успешно сделана");
    		} else {
    			return false;
    		}
		}
		else {
			alert("Вы не выбрали исход");
			return false;
		}
	}
	
	
	function startTime() {
		var tm = new Date();
		var h = tm.getHours();
		var m = tm.getMinutes();
		var s = tm.getSeconds();
		m = checkTime(m);
		s = checkTime(s);
		document.getElementById('timer').innerHTML = h + ":" + m + ":" + s;
		t = setTimeout('startTime()', 500);
		}
		function checkTime(i) {
			if (i < 10) {
				i = "0" + i;
			}
		return i;
	}
		
		
	function getDate() {
		var date = new Date();
		var day = date.getDate();
		var month = date.getMonth() + 1;
		var year = date.getFullYear();
		if (day < 10) {
			day = '0' + day;
		}
		if (month < 10) {
			month = '0' + month;
		}
		document.getElementById('date').innerHTML = day + '.' + month + '.' + year;
	}
    </script>
    <title>2XБЭТЪ</title>
</head>