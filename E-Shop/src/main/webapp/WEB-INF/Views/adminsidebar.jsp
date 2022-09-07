<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
 <!-- Layouts -->
 
 <%
 	String x = (String)session.getAttribute("name");
 	if(x==null)
 	{
 		request.getRequestDispatcher("adminlogin").forward(request, response);
 	}
 %>
 
 <ul class="menu-inner py-1">
            <!-- Dashboard -->
            <li class="menu-item active">
              <a href="adminindex" class="menu-link">
                <i class="menu-icon tf-icons bx bx-home-circle"></i>
                <div data-i18n="Analytics">Dashboard</div>
              </a>
            </li>
 
           
            <!-- Forms & Tables -->
            <li class="menu-header small text-uppercase"><span class="menu-header-text">Forms &amp; Tables</span></li>
            <!-- Forms -->
            <li class="menu-item">
              <a href="javascript:void(0);" class="menu-link menu-toggle">
                <i class="menu-icon tf-icons bx bx-detail"></i>
                <div data-i18n="Form Elements">Form Elements</div>
              </a>
              <ul class="menu-sub">
                <li class="menu-item">
                  <a href="forms-basic-inputs.html" class="menu-link">
                    <div data-i18n="Basic Inputs">Basic Inputs</div>
                  </a>
                </li>
                <li class="menu-item">
                  <a href="forms-input-groups.html" class="menu-link">
                    <div data-i18n="Input groups">Input groups</div>
                  </a>
                </li>
              </ul>
            </li>
            <li class="menu-item">
              <a href="javascript:void(0);" class="menu-link menu-toggle">
                <i class="menu-icon tf-icons bx bx-detail"></i>
                <div data-i18n="Form Layouts">Form Layouts</div>
              </a>
              <ul class="menu-sub">
                <li class="menu-item">
                  <a href="form-layouts-vertical.html" class="menu-link">
                    <div data-i18n="Vertical Form">Vertical Form</div>
                  </a>
                </li>
                <li class="menu-item">
                  <a href="form-layouts-horizontal.html" class="menu-link">
                    <div data-i18n="Horizontal Form">Horizontal Form</div>
                  </a>
                </li>
              </ul>
            </li>
            <!-- Tables -->
            <li class="menu-item">
              <a href="tables-basic" class="menu-link">
                <i class="menu-icon tf-icons bx bx-table"></i>
                <div data-i18n="Tables">Users</div>
              </a>
            </li>
            
            <li class="menu-item">
              <a href="admincategory" class="menu-link">
                <i class="menu-icon tf-icons bx bx-table"></i>
                <div data-i18n="Tables">Category</div>
              </a>
            </li>
           
            <li class="menu-item">
              <a href="adminproduct" class="menu-link">
                <i class="menu-icon tf-icons bx bx-table"></i>
                <div data-i18n="Tables">Product</div>
              </a>
            </li>
            
          </ul>
          
          </body>
          </html>

</body>
</html>