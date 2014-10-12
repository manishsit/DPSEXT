<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<f:subview id="authorReg">
	<htm:table cellspacing="10">
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Account Name" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.accountId}" styleClass="input_text"/>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="First Name" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.firstName}" styleClass="input_text"/>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Last Name" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.lastName}" styleClass="input_text"/>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Email" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.userEmail}" styleClass="input_text"/>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Country" />
			</htm:td>
			<htm:td>
				<h:selectOneMenu
					value="#{userManagementAction.userValue.userCountry}">
					<f:selectItem itemLabel="--Select--" itemValue=""/>
					<f:selectItems value="#{userManagementAction.countryList}" />
				</h:selectOneMenu>
			</htm:td>
		</htm:tr>
	</htm:table>
</f:subview>