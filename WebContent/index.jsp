
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<f:view>
	<h:form id="pageFrm">
		<h:commandLink
			action="#{userManagementAction.loadAuthorRegistrationScreen}"
			value="Register Me" />
	</h:form>
</f:view>