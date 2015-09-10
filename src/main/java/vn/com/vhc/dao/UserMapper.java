package vn.com.vhc.dao;

import java.util.List;

import vn.com.vhc.domain.User;

public interface UserMapper {
	
	List<User> getAll();
	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Tue Sep 08 17:18:09 ICT 2015
     */
    int updateByPrimaryKey(User record);
}