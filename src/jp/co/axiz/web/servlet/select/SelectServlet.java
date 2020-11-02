package jp.co.axiz.web.servlet.select;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.web.entity.UserEntity;
import jp.co.axiz.web.service.SelectService;
import jp.co.axiz.web.util.ParamUtil;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("SelectServlet入ったなう");
		String userName = request.getParameter("userName");
		String tel = request.getParameter("tel");
		System.out.println("userName:" + userName);
		System.out.println("tel:" + tel);

		ArrayList<UserEntity> entitys = new ArrayList<UserEntity>();
		if (ParamUtil.isNullOrEmpty(userName) && ParamUtil.isNullOrEmpty(tel)) {
			System.out.println("未入力入ったなう");
			entitys = SelectService.saearchAllService();

		} else if (ParamUtil.isNullOrEmpty(userName)) {
			System.out.println("tel入力");
			entitys = SelectService.saearchTelService(tel);

		} else if (ParamUtil.isNullOrEmpty(tel)) {
			System.out.println("name入力");
			entitys = SelectService.saearchNameService(userName);
		} else {
			System.out.println("全入力入ったなう");
			entitys = SelectService.saearchNameTelService(userName,tel);

		}

		try {
			if(entitys.size()==0) {
				System.out.println("size=0来た");
				request.setAttribute("errorMessage", "入力されたデータはありませんでした");

				request.getRequestDispatcher("/select.jsp").forward(request, response);
				return;

			}else {
				System.out.println("nullじゃない方来た");
				request.setAttribute("list", entitys);
				System.out.println("そろそ来た");
				request.getRequestDispatcher("/selectResult.jsp").forward(request, response);
				return;
			}

		} catch (Exception e) {
			System.out.println("catch来た");
			request.setAttribute("errorMessage", "入力されたデータはありませんでした");
			request.getRequestDispatcher("/select.jsp").forward(request, response);
			return;

		}

	}

}
