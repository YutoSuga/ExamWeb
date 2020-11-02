package jp.co.axiz.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.service.RoginService;
import jp.co.axiz.web.util.ParamUtil;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
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
		System.out.println("loginServlet入ったなう");
		String loginId = request.getParameter("loginId");
		String pass = request.getParameter("pass");
		System.out.println("loginId:"+loginId);
		System.out.println("pass:"+pass);

		if (ParamUtil.isNullOrEmpty(loginId) || ParamUtil.isNullOrEmpty(pass)) {
			System.out.println("未入力入ったなう");
			if (ParamUtil.isNullOrEmpty(loginId)) {
				request.setAttribute("idMessage", "Idは必須です");

			}
			if (ParamUtil.isNullOrEmpty(pass)) {
				request.setAttribute("passMessage", "Passは必須です");
			}
			System.out.println("login.jspに戻るなう");
			System.out.println((String) request.getAttribute("idMessage") + request.getAttribute("passMessage"));

			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}

		UserEntity entity = RoginService.RoginService(loginId, pass);

		try {
			entity.equals(null);

			System.out.println("loginServlet最後まで来た");
			request.setAttribute("userName", entity.getUserName());
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
			return;

		}catch(Exception e){
			System.out.println("null来た");
			request.setAttribute("errorMessage", "IdかPassが間違っています");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;

		}


	}

}
