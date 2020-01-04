<%@page import="com.del.test.entity.Courses,com.del.test.dao.CoursesDAO"%>
<%
   Courses c=(Courses)request.getAttribute("cos");
   if(c==null) c=new Courses();
%>
<html>
<body>
<form action="CoursesCrudServlet">
    <table align=center width=50% bgcolor=pink>
    <tr>
    <th>Course ID</th>
    <td><input type=text name=cid value=<%=c.getCid()%>></td>
    </tr>
    <tr>
    <th>Course Name</th>
    <td><input type=text name=cname value=<%=c.getCname()%>></td>
    </tr>
    <tr>
    <th>Course Duration</th>
    <td><input type=text name=cd value=<%=c.getCd()%>></td>
    </tr>
    <tr>
    <th>Course Fees</th>
    <td><input type=text name=cfee value=<%=c.getCfee()%>></td>
    </tr>
    <tr>
    <td><input type=submit value=Add_Courses name="sub"></td>
    <td><input type=submit value=Show_Courses name="sub"></td>
    </tr>
    <tr>
    <td><input type=submit value=Modify_Courses name="sub"></td>
    <td><input type=submit value=Delete_Courses name="sub"></td>
    </tr>
   </table>
 </form>
</body>
</html>