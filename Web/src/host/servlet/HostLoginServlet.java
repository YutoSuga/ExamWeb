package host.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import host.service.HostLoginService;
import util.HostSessionUtil;
import util.ParamUtil;

/**
 * Servlet implementation class Login
 */
@WebServlet("/host/hostLogin")
public class HostLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 文字化け対策
        request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("HostLogin.java");

		//入力値取得
		String loginId = null;
		String pass = null;
		loginId =request.getParameter("loginId");
		pass=request.getParameter("pass");

		// 入力値チェック
        boolean hasError = false;

        //ログインチェック
		if (ParamUtil.isNullOrEmpty(loginId)) {
            // 未入力エラー
			System.out.print("idはnull");
            request.setAttribute("idErrMsg", "IDは必須です");
            hasError = true;
        }

        // PASS入力値チェック
        if (ParamUtil.isNullOrEmpty(pass)) {
            // 未入力エラー
        	System.out.print("PASSはnull");
            request.setAttribute("passErrMsg", "PASSは必須です");
            hasError = true;
        }

        // 入力エラーがある場合はログイン画面に戻る
        if (hasError) {
        	System.out.print("error");
            request.getRequestDispatcher("/host/Login.jsp").forward(request, response);
            return;
        }

        // id psaaチェック
        boolean login = HostLoginService.HostLogin(loginId, pass);
        HostSessionUtil ws = new HostSessionUtil();
        ws.setId(loginId);//セッション管理用に格納
        HttpSession session = request.getSession(true);//セッションスタート
        //UserInfo userInfo = (UserInfo) session.getAttribute("USER_INFO");//セッションから取り出すためのもの、サンプルプログラムとして記載


        if(login) {
        	session.setAttribute("loginId", loginId);
        	//request.setAttribute("loginId",loginId );
    		request.getRequestDispatcher("/host/Home.jsp").forward(request, response);

        }else {
        	session.invalidate();//セッションの破棄
        	request.setAttribute("errMsg","IDかPASSが間違っています。" );
    		request.getRequestDispatcher("/host/Login.jsp").forward(request, response);

        }


	}

}
