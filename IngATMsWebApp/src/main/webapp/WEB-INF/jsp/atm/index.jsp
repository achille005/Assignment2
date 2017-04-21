<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<table border="1">
	<tr>
		<th>street</th>
		<th>housenumber</th>
		<th>postalcode</th>
		<th>city</th>
		<th>geoLocation</th>
		<th>distance</th>
		<th>type</th>
	</tr>
	<c:forEach var="atm" items="${atms }">
		<tr>
			<td>${atm.address.street }</td>
			<td>${atm.address.housenumber }</td>
			<td>${atm.address.postalcode }</td>
			<td>${atm.address.city }</td>
			<td>lat: ${atm.address.geoLocation.lat }, lng: ${atm.address.geoLocation.lng }</td>
			<td>${atm.address.distance }</td>
			<td>${atm.address.type }</td>
		</tr>
	</c:forEach>
</table>	
	
</body>
</html>