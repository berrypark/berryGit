package kr.co.sample.bbs;

import java.util.List;

public interface TestService {

	public abstract List<TestDto> getProductList(TestDto testDto) throws Exception;

}
