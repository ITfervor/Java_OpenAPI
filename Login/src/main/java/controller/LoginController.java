package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MemberDTO;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberService memberService;

	public LoginController() {
		super();
		memberService = MemberServiceImpl.getInstance();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그인 요청");
		// webapp의 디렉토리의 member 디렉토리의 login.jsp로 포워
		request.getRequestDispatcher("/member/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 실제 로그인 처리(난이도가 있음)

		// 파라미터 가져오기
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");

		// 서비스 메서드 호출
		MemberDTO dto = memberService.login(mid, mpw, uuid);

		// 결과를 가지고 분기
		// 세션 가져오기
		HttpSession session = request.getSession();

		if (dto == null) {
			session.invalidate();
			// 로그인 페이지로 되돌아 가기
			response.sendRedirect("login?error=error");

		}else {
			session.setAttribute("logininfo", dto);
			//메인 페이지로 리다이렉트
			response.sendRedirect("./");
		}

	}

}
