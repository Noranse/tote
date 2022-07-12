<%@ tag language="java" pageEncoding="UTF-8"%>

<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/bootstrap_pulse.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function info(num){
        	if(num == 1 && document.getElementById("discipline").value == ''){
        		alert("Заполните все поля!!!");
        		return false;
        	}
        	else if(num == 2 
        			&& (document.getElementById("event").value == '' 
        			|| document.getElementById("date").value == '')
        			){
        		alert("Заполните все поля!!!");
        		return false;
        	}
        	else if(num == 3 
        			&& (document.getElementById("discipline").value == ''
        			|| document.getElementById("event").value == ''
        			|| document.getElementById("outcome").value == '')
        			){
        		alert("Заполните все поля!!!");
        		return false;
        	}
            alert("Операция успешно выполнена");
            $('#sbm-frm').submit();
        }
    </script>
    <title>Админка</title>
</head>