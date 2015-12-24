package kr.co.sample.admin;

public interface LoginDao {

	public abstract LoginDto getAdminLoginInfo(LoginDto loginDto) throws Exception;

}
