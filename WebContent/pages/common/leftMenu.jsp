<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://jsftutorials.net/htmLib" prefix="htm"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<htm:div>
	<htm:table cellspacing="0" cellpadding="5">
		<htm:tr>
			<htm:td>
				<h:commandLink value="Employers Sign Up"
					action="#{registerAction.navigateToEmployerRegisterFrm}" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td>
				<h:commandLink value="Blogger Sign Up"
					action="#{bloggerAction.navigateToBloggerRegisterFrm}" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td>
				<h:commandLink value="Sign In" action="#{loginAction.loadLoginPage}" />
			</htm:td>
		</htm:tr>
		<htm:tr>
			<htm:td>
				<h:commandLink value="Display Blog List" action="#{bloggerAction.retrieveAllBlogs}" />
			</htm:td>
		</htm:tr>
	</htm:table>
</htm:div>