<! Doctypehtml>
<body>
<%= "Hello World" %>
<%
  println ("<font color=red size=20>Student Information</font><br>")
   def stdList=request.getAttribute("stdList") 
   stdList.each{
   print " | " + it 
   }
   print  "<br>"
  def stdMap=request.getAttribute("stdMap")
   stdMap.each{map->
	 println map.key+"  "+map.value+"  <br>"
   }
 %>
 </body>
</html>