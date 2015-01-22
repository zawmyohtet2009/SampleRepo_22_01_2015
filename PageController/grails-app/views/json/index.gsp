<g:each in="${personInstance}" var ="person">
    Name : ${person.name}
  </g:each>
<%--<g:each in="${grails.converters.JSON.parse(personInstance)}"   var="person">
     Name : ${person.name}
</g:each>--%>