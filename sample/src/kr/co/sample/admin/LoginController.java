package kr.co.sample.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("loginController")
public class LoginController {
	
	private final String PATH = "/admin/login/";
	
	@Resource(name="loginService")
	private LoginService loginService;

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping("/loginPage")
	public String admLoginPage(HttpServletRequest request,
			HttpServletResponse response, Model model) throws Exception {
		
		String result = "login";
		
		String error = request.getParameter("error");
		String status = request.getParameter("status");
		
		if(status == null) {
			status = "";
		}
		
		if(error != null && !"".equals(error)) {
			model.addAttribute("error", error);
			model.addAttribute("status", status);
			
			return PATH + result;
		}
		
		return PATH + result;
	}
	
	@RequestMapping("/login")
	public String admLogin(@ModelAttribute("logDto") LoginDto loginDto,
			HttpServletRequest request) throws Exception {
		
	    if(loginDto == null || loginDto.getId() == null || "".equals(loginDto.getId().trim())) {
	    	// 아이디를 입력해 주세요
	    } else if(loginDto.getPassword() == null || "".equals(loginDto.getPassword().trim())) {
	    	// 비밀번호를 입력해 주세요
	    }
	    
	    LoginDto adminDto = loginService.getAdminLoginInfo(loginDto);
	    
	    if(adminDto == null) {
	    	// 유저가 없습니다
	    } else if(adminDto.getPassword() != null /*&& loginDto.getPassword()를 SHA512로 인코딩후 비교*/) {
	    	// secpswd(SHA512로 인코딩된 패쓰워드)가 다릅니다
	    } else if(!"Y".equals(adminDto.getUseFl())) {
	    	// 사용하지 않는 사용자입니다.
	    } else {
	    	// 로그인 성공
	    	// 이니스프리 정책.. 이전 로그인 데이터 남기기?? 
	    	 HttpSession session = request.getSession(true);
	    	 session.setAttribute("ADMIN_INFO", adminDto);
	    	 session.setMaxInactiveInterval(60*30);
	    	 
	    	 return PATH + "admMain";
	    }
	    
	    return PATH + "login";
	}
	
	@RequestMapping("/logout")
	public String admLoginout(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		if(session!= null) {
			session.invalidate();
		}
		
		return PATH + "login";
	}
}
