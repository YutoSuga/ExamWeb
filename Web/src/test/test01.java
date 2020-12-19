package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.util;
/**
 * Servlet implementation class test01
 */
@WebServlet("/test/test01")
public class test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public test01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("ABCD");
		String tag=request.getParameter("tag");
		String redStr=request.getParameter("red");
		String greenStr=request.getParameter("green");
		String blueStr=request.getParameter("blue");

		int red=Integer.parseInt(redStr);
		int green=Integer.parseInt(greenStr);
		int blue=Integer.parseInt(blueStr);


		String color="#"+util.change(red)+util.change(green)+util.change(blue);
		String message="<font color=\"" +color +"\"><"+tag+">こんな表示になるのだ！</"+tag+"></font>";
		request.setAttribute("message", message);
		request.getRequestDispatcher("/test/WebTest01.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("ABCD");
		String tag=request.getParameter("tag");
		String redStr=request.getParameter("red");
		String greenStr=request.getParameter("green");
		String blueStr=request.getParameter("blue");

		tag = util.HalfString(tag);
		int red=Integer.parseInt(redStr);
		int green=Integer.parseInt(greenStr);
		int blue=Integer.parseInt(blueStr);

		String colorCode = util.CreateColorCode(red,green,blue);
		String message="<font color=\"" +colorCode +"\"><"+tag+">こんな表示になるのだ！</"+tag+"></font>";
		request.setAttribute("message", message);
		request.getRequestDispatcher("/test/WebTest01.jsp").forward(request, response);

	}

}
