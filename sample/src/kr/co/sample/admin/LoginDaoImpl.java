package kr.co.sample.admin;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("loginDao")
public class LoginDaoImpl extends SqlMapClientDaoSupport implements LoginDao {

	@Override
	public LoginDto getAdminLoginInfo(LoginDto loginDto) throws Exception {
		return (LoginDto) getSqlMapClientTemplate().queryForObject("login.adminLoginInfo", loginDto);
	}

}
