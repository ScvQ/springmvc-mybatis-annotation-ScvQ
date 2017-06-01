package com.grace.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.grace.user.entity.User;

@Repository("userDao")
public interface UserDao {
	
	@Select(" SELECT u.c_id AS id,u.c_username AS username,u.c_password AS password,u.c_nickname AS nickname,u.c_realname AS realname,u.c_sex AS sex,u.c_age AS age,u.c_phoneno AS phoneno,u.c_address AS address,u.c_cardid AS cardid,u.c_email AS email FROM t_user u ")
	public List<User> allUser();
	
	@Update(" UPDATE t_user u SET u.c_username=#{username},u.c_password=#{password},u.c_nickname=#{nickname},u.c_realname=#{realname},u.c_sex=#{sex},u.c_age=#{age},u.c_phoneno=#{phoneno},u.c_address=#{address},u.c_cardid=#{cardid},u.c_email=#{email} WHERE u.c_id=#{id} ")
	public int update(@Param("id") String id,@Param("username") String username,@Param("password") String password,@Param("nickname") String nickname,@Param("realname") String realname,@Param("sex") int sex,@Param("age") int age,@Param("phoneno") String phoneno,@Param("address") String address,@Param("cardid") String cardid,@Param("email") String email);
	
	@Select(" SELECT u.c_id AS id,u.c_username AS username,u.c_password AS password,u.c_nickname AS nickname,u.c_realname AS realname,u.c_sex AS sex,u.c_age AS age,u.c_phoneno AS phoneno,u.c_address AS address,u.c_cardid AS cardid,u.c_email AS email FROM t_user u WHERE c_id= #{id} ")
	public User userById(@Param("id") String id);
	
	@Delete(" DELETE FROM t_user WHERE c_id= #{id} ")
	public int delete(@Param("id") String id);
	
	@Insert(" INSERT INTO t_user VALUES (#{id},#{username},#{password},#{nickname},#{realname},#{sex},#{age},#{phoneno},#{address},#{cardid},#{email}) ")
	public int insert(@Param("id") String id,@Param("username") String username,@Param("password") String password,@Param("nickname") String nickname,@Param("realname") String realname,@Param("sex") int sex,@Param("age") int age,@Param("phoneno") String phoneno,@Param("address") String address,@Param("cardid") String cardid,@Param("email") String email);

}
