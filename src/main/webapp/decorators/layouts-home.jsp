<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">

<head>
	<title><decorator:title /></title>
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/style.css" />
</head>

<body>
	<div class="header">
		[HEADER]
	</div>
	<div class="container">
		<h3>
			<decorator:getProperty property="page.header" />
		</h3>
		
		<decorator:body />
	</div>
	<div class="footer">
		[FOOTER]
	</div>
</body>

</html>