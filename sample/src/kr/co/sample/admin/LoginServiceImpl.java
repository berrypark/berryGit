package kr.co.sample.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Resource(name="loginDao")
	private LoginDao loginDao;
	
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public LoginDto getAdminLoginInfo(LoginDto loginDto) throws Exception {
		return loginDao.getAdminLoginInfo(loginDto);
	}

}
