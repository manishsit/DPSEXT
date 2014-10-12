<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/script.js"></script>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/css/dps_style.css" />
<title><tiles:getAsString name="title" ignore="true" /></title>
</head>
<body>
	<f:view>
		<h:form id="pageFrm">
			<htm:div styleClass="blended_grid">
				<htm:div styleClass="pageHeader">
					<tiles:insert attribute="header" flush="false" />
				</htm:div>
				<htm:div styleClass="pageLeftMenu">
					<tiles:insert attribute="leftMenu" flush="false" />
				</htm:div>
				<htm:div styleClass="pageContent">
					<tiles:insert attribute="body" flush="false" />
				</htm:div>
				<htm:div styleClass="pageFooter">
					<tiles:insert attribute="footer" flush="false" />
				</htm:div>
			</htm:div>
		</h:form>
	</f:view>
</body>
</html>
