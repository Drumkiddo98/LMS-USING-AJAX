<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form >
		<input type="text" name="studname" id="studname"placeholder="StudentName">
		<button type="button" onclick="addstudent()">add Student</button>
	
	</form>
	
	
	<script>
		function addstudent(){
			var studentname=document.getElementById("studname").value;
			var x= JSON.stringify({"studname":studentname});
			var xhr= new XMLHttpRequest();
			var url="http://localhost:8080/Hello/addstudent";
			console.log(x);
			xhr.open('POST',url,true);
			xhr.setRequestHeader("Content-Type","application/json");
			xhr.send(x);
			xhr.onreadystatechenage=function(){
				if(xhr.readyState==4  && xhr.status==200){
					var response1=JSON.parse(xhr.responseText);
					console.log(xhr.responseText);
				}
			}
		}
	
	</script>
</body>
</html>