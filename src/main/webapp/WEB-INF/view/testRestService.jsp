<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Rest Data</h1>
<p id="demo" > </p>
<script type="text/javascript">
  var xhttp = new XMLHttpRequest();
  //document.write("Calling TestHello request");
  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	       // Typical action to be performed when the document is ready:
	       document.getElementById("demo").innerHTML = xhttp.responseText;
	    }
	};
	
	xhttp.open("GET", "http://localhost:8080/FirtMaven/test/SendLoginDetails", true);
	document.write("Reached to HTTP calling is done");
	xhttp.send();
  
</script>

</body>
</html>