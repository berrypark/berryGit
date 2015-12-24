package kr.co.sample.bbs;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl extends SqlMapClientDaoSupport implements TestDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<TestDto> getProductList(TestDto testDto) throws Exception {
		return getSqlMapClientTemplate().queryForList("test.getProductList", testDto);
	}

}
