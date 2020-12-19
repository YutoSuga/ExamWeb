package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.util;

/**
 * Servlet implementation class test02
 */
@WebServlet("/test/test02")
public class test02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public test02() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/test/WebTest02.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("test02サーブレットなう");

		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");
		String calc = request.getParameter("calc");
		System.out.println("calc=" + calc);
		//		System.out.println("test02サーブレットなう");

		num1Str = util.HalfString(num1Str);
		num2Str = util.HalfString(num2Str);

		int[] nums;
		nums = new int[2];
		try {
			nums[0] = Integer.parseInt(num1Str);
			nums[1] = Integer.parseInt(num2Str);
			int resultNum = util.calc(nums, calc);
			//String result = resultNum;
			request.setAttribute("result", resultNum);

		} catch (Exception e) {
			String msg = "入力は半角の数字だけにしてよね！";
			request.setAttribute("msg", msg);
		}

		request.getRequestDispatcher("/test/WebTest02.jsp").forward(request, response);

	}

}
