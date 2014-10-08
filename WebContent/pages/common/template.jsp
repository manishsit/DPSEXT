
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/script.js"></script>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css" />
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
<f:view>
	<h:form id="pageFrm">
		<htm:table cellpadding="0" cellspacing="0" style="width:100%;">
			<htm:tr>
				<htm:td colspan="2">
					<tiles:insert attribute="header" flush="false" />
				</htm:td>
			</htm:tr>
			<htm:tr>
				<htm:td style="width:20%">
					<tiles:insert attribute="leftMenu" flush="false" />
				</htm:td>
				<htm:td>
					<tiles:insert attribute="body" flush="false" />
				</htm:td>
			</htm:tr>
			<htm:tr>
				<htm:td colspan="2">
					<tiles:insert attribute="footer" flush="false" />
				</htm:td>
			</htm:tr>
		</htm:table>
	</h:form>
</f:view>
</body>
</html>