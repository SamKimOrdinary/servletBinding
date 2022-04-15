package config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvltConfig
 */
public class SvltConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvltConfig() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = getInitParameter("name");
		
		PrintWriter out = response.getWriter();
		
		
		 RequestDispatcher dis = request.getRequestDispatcher("/inc/menu.jsp"); // web.xml에 등록된 이름으로
		  dis.include(request, response);
		
		
		out.print("name=" + name);
		
		ServletContext context = getServletContext();
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		
		out.print("driver:" + driver + "<br>");
		out.print("url : " + url + "<br>");
		out.print("user : " + user + "<br>");
		out.print("pass : " + pass + "<br>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
