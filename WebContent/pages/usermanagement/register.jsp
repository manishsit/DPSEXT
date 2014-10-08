<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<f:subview id="authorReg">
	<htm:table>
		<htm:tr>
			<htm:td></htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.accountId}" id="accountId" />
			</htm:td>
		</htm:tr>
	</htm:table>
</f:subview>