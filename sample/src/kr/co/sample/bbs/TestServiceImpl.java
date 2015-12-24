package kr.co.sample.bbs;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Resource(name="testDao")
	private TestDao testDao;
	
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public List<TestDto> getProductList(TestDto testDto) throws Exception {
		return testDao.getProductList(testDto);
	}

}
