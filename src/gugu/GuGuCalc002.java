package gugu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGuCalc002
 */
public class GuGuCalc002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGuCalc002() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String strDan = request.getParameter("dan");
		
		PrintWriter out = response.getWriter();
		String strResult = "";
		
		int nDan = Integer.parseInt(strDan);
		for(int i=1;i<10;i++) {
			strResult += nDan + " X " + i + " = " + (nDan * i) + "<br>";
		}
		
		out.print("<html>");
		out.print("<body>");

		RequestDispatcher dis = request.getRequestDispatcher("/inc/menu.jsp"); // web.xml에 등록된 이름으로
		dis.include(request, response);
		
		out.print(strResult);
		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
