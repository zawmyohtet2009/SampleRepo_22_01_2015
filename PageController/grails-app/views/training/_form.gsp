<%@ page import="com.internship.Training" %>



<div class="fieldcontain ${hasErrors(bean: trainingInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="training.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${trainingInstance?.name}"/>
</div>

