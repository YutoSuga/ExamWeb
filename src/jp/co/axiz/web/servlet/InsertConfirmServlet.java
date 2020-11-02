package jp.co.axiz.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.web.service.InsertService;

/**
 * Servlet implementation class InsertConfirmServlet
 */
@WebServlet("/insertConfirm")
public class InsertConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertConfirmServlet() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("insertConfirmServlet入ったなう");
		String loginId = request.getParameter("loginId");
		String userName = request.getParameter("userName");
		String tel = request.getParameter("tel");
		String roleName = request.getParameter("roleName");
		String rePass = request.getParameter("rePass");

		HttpSession session = request.getSession();
		String pass = (String) session.getAttribute("pass");
		System.out.println("pass;" + pass);
		System.out.println("rePass;" + rePass);

		if (rePass.equals(pass)) {
			System.out.println("パスワード一致");
			InsertService.insert(loginId,userName,tel,roleName,pass);

			session.setAttribute("userName", userName);
			request.getRequestDispatcher("/insertResult.jsp").forward(request, response);
			return;

		} else {
			System.out.println("パスワードが違うの");
			request.setAttribute("loginId", loginId);
			request.setAttribute("userName", userName);
			request.setAttribute("tel", tel);
			request.setAttribute("roleId", roleName);
			request.setAttribute("pass", pass);
			request.setAttribute("errorMessage", "前画面で入力したパスワードと一致しません");
			request.getRequestDispatcher("/insertConfirm.jsp").forward(request, response);
			return;

		}

	}

}
