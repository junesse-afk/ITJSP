/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-11-20 07:19:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp02_005frequest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.Arrays;

public final class request1_005fpro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("java.util.Arrays");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>request1_pro.jsp - 요청 파라미터 처리</h1>\r\n");
      out.write("	");

	/*
	request1_form.jsp 페이지에서 submit 버튼 클릭 시
	form 태그 내의 데이터(= 폼 파라미터)가 HTTP 요청 메세지에 포함되고
	action 속성에 지정된 페이지로 이동(= 페이지를 요청)하면서 HTTP 요청 메세지 전달함
	=> 요청 관련 모든 정보는 request 객체가 관리(= JSP가 자동으로 생성하는 객체 = 내장 객체)
	   따라서, request.메서드명() 형태로 request 객체의 메서드 호출하여 객체 다루기 가능
	=> 요청받은 request 객체에 저장된 폼 파라미터 데이터를 가져오는 방법
	   1) request.getParameter("파라미터명"); // 단일 파라미터 데이터 가져오기 = String 리턴
	   2) request.getParameterValues("파라미터명"); //복수 항목 파라미터 가져오기
	      = String[] 리턴 (주로, checkbox 처럼 하나의 이름으로 복수개의 파라미터 전달할 경우 사용)
	   => *** "파라미터명" 부분에는 폼 태그에서 입력 항목의 name 속성에 지정된 속성값 사용 ***   
	
	*/
	
	// 1. 폼 파라미터 중 파라미터명(name 속성값)이 "name"인 파라미터 값을 가져와서
	//    String 타입 변수 strName에 저장 후 웹브라우저에 출력
	String strName = request.getParameter("name");
	out.print("이름: " + strName + "<br>");
	
	String strAge = request.getParameter("age");
	out.print("나이: " + strAge + "<br>");
	
	String strGender = request.getParameter("gender");
	out.print("성별: " + strGender + "<br>");
	
	// 2. 폼 파라미터 중 파라미터명(name 속성값)이 "hobby" 인 파라미터 값을 가져와서 출력
// 	String strHobby = request.getParameter("hobby");
// 	out.print("취미: " + strHobby + "<br>"); // 첫번째 선택한 취미만 출력됨
	// => 주의! 복수개의 데이터가 동일한 파라미터명으로 전달되는 경우 (ex. 체크박스)
	//    getParameter() 메서드 사용 시 하나의 데이터만 가져올 수 있다!
	String[] arrHobby = request.getParameterValues("hobby");
// 	out.print("취미: " + arrHobby + "<br>");
	// Arrays 클래스의 static 메서드 toString() 메서드 호출하여 파라미터로 배열 전달 시
	// 배열 내의 요소들을 한꺼번에 문자열로 결합하여 리턴 => 한꺼번에 출력가능
// 	out.print("취미: " + Arrays.toString(arrHobby) + "<br>");
	
	// arrHobby 배열을 반복문을 통해 차례대로 접근하면서 저장된 파라미터 데이터 출력
// 	for (int i = 0; i < arrHobby.length; i++) {
// 		out.print("취미: " + arrHobby[i] + "<br>");
// 	}
	
	// 향상된 for문
// 	for (String hobby : arrHobby) {
// 		out.print("취미: " + hobby + "<br>");
// 	}
	
	// null 값에 대한 NullPointerException 오류까지 방지하는 반복문 작성 방법
	// => 객체(배열)이 null이 아닐 경우에만 반복문으로 접근하도록 if문 추가
	if (arrHobby != null) {
		for (String hobby : arrHobby) {
	 		out.print("취미: " + hobby + "<br>");
	 	}
	} else {
		out.print("취미없음<br>");
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
