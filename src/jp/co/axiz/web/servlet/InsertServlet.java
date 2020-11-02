package jp.co.axiz.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.service.InsertService;
import jp.co.axiz.web.util.ParamUtil;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
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
		HttpSession session=request.getSession();

		System.out.println("insertServlet入ったなう");
		String loginId = request.getParameter("loginId");
		String userName = request.getParameter("userName");
		String tel = request.getParameter("tel");
		String roleId = request.getParameter("roleId");
		String password = request.getParameter("pass");

		if (ParamUtil.isNullOrEmpty(loginId) || ParamUtil.isNullOrEmpty(userName) ||
				ParamUtil.isNullOrEmpty(tel) || ParamUtil.isNullOrEmpty(password)) {
			if (ParamUtil.isNullOrEmpty(loginId)) {
				request.setAttribute("idMessage", "IDは必須です");
			}
			if (ParamUtil.isNullOrEmpty(userName)) {
				request.setAttribute("userMessage", "名前は必須です");
			}
			if (ParamUtil.isNullOrEmpty(tel)) {
				request.setAttribute("telMessage", "TELは必須です");
			}
			if (ParamUtil.isNullOrEmpty(password)) {
				request.setAttribute("passMessage", "PASSは必須です");
			}
		} else {
			System.out.println("全入力したとき");

			UserEntity entity= InsertService.searchLogin(loginId);

			if(entity==null) {
				request.setAttribute("loginId", loginId);
				request.setAttribute("userName", userName);
				request.setAttribute("tel", tel);
				request.setAttribute("roleId", roleId);
				session.setAttribute("pass", password);

				request.getRequestDispatcher("/insertConfirm.jsp").forward(request, response);
				return;
			}else {
				request.setAttribute("errorMessage", "IDが重複しています");
			}

		}

		request.getRequestDispatcher("/insert.jsp").forward(request, response);
		return;
	}

}
