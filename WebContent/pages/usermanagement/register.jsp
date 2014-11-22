<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<f:subview id="authorReg">
<t:saveState value="#{userManagementAction.userValue}" />
	<htm:table cellspacing="12">
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Account Name" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.loginValue.accountId}"
					styleClass="input_text" id="Account_Name" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="First Name" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.firstName}"
					styleClass="input_text" id="First_Name" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Last Name" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.lastName}"
					styleClass="input_text" id="Last_Name" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Email" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:inputText value="#{userManagementAction.userValue.loginValue.userEmail}"
					styleClass="input_text" id="Email" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Contact Number" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:inputText
					value="#{userManagementAction.userValue.userContactNum}"
					styleClass="input_text" id="Contact_Number" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Country" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:selectOneMenu
					value="#{userManagementAction.userValue.userCountry}"
					styleClass="input_select" id="Country">
					<f:selectItem itemLabel="--Select--" itemValue="" />
					<f:selectItems value="#{userManagementAction.countryList}" />
				</h:selectOneMenu>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right">
				<h:outputText value="Authoring Language" styleClass="label_text" />
			</htm:td>
			<htm:td>
				<h:selectOneMenu
					value="#{userManagementAction.userValue.authoringLanguage}"
					styleClass="input_select" id="Authoring_Language">
					<f:selectItem itemLabel="--Select--" itemValue="" />
					<f:selectItems value="#{userManagementAction.languageList}" />
				</h:selectOneMenu>
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td align="right" colspan="2">
				<h:commandButton value="Sign Up" action="#{userManagementAction.registerAuthor}"
					styleClass="form-submit-button"
					onclick="return validateAuthorReg();" />
			</htm:td>
		</htm:tr>
	</htm:table>
</f:subview>