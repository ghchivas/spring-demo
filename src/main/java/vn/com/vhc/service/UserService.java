package vn.com.vhc.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vn.com.vhc.dao.UserMapper;
import vn.com.vhc.domain.User;

public class UserService implements UserServiceLocal {

	public User getByUserId(Integer id) {
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		User user = mapper.selectByPrimaryKey(id);

		sqlSession.close();

		return user;
	}
	
	public List<User> getAll() {
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		return mapper.getAll();
	}

}