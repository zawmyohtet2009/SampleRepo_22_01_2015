<! Doctypehtml>
<head>
<style type="text/css" >
    .menu{
    background : pupple;
    -moz-border-radius: 0.6em;
	-webkit-border-radius: 0.6em;
	border-radius: 0.6em;
	box-shadow: 0px 0px 1.25em #aaf;
   }
   .content{
    padding : -500px 10px 600px 0px;
   }
</style>
</head>
<body>
  <table width =1300 height=700  align=center>
     <tr ><th width=150 height=100 colspan=2  class="menu">
     <g:img  uri="/images/empswork3 (5).jpg" /><br>	
    <blink><font size =30 >Login Web Application</font></blink></th></tr>
     <tr><td width=1000 height=500  class="menu">
     <g:if test="${session.loginUser}" >
            Welcome  <%= session.loginUser %>
            ${flash.welcome}
            <g:link action="logout">Logout</g:link>
      </g:if>
      <g:else>
      <font color=red >${flash.check}</font><br><br>
         <g:render template="login" />
      </g:else>
     </td><td width=200  class="menu">It is Menu</td></tr>
    <tr><td width=150 height=100 colspan=2  class="menu">It is Footer.</td></tr>
    </table>
  <g:include controller="render" action="show" />
 </body> 
</html>