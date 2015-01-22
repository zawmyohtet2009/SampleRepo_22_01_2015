<%@ page import="com.internship.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="person.name.label" default="Name" />
		
	</label>
	<g:textField name="name" maxlength="20" value="${personInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="person.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="age" from="${20..50}" class="range" required="" value="${fieldValue(bean: personInstance, field: 'age')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="person.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${personInstance?.address}"/>
</div>

