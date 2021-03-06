package com.tamatech.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.tamatech.demo.model.Teacher;

@Mapper
public interface TeacherMapper {
	
	Long count();
	
//	@Select("SELECT * FROM teacher")
	List<Teacher> selectAll(RowBounds rowBouns);
	
	List<Teacher> selectAll();
	
//	@Select({
//		"SELECT * FROM teacher",
//		"WHERE id = #{id}"
//	})
	Teacher selectByPrimaryKey(Long id);
	
//	@Insert({
//		"INSERT INTO teacher(user_name, email)",
//		"VALUES(#{userName}, #{email})"
//	})
	int insert(Teacher record);
	
//	@Update({
//		"UPDATE teacher",
//		"SET user_name = #{userName}, email = #{email}",
//		"WHERE id = #{id}"
//	})
	int updateByPrimaryKey(Teacher record);
	
//	@Delete({
//		"DELETE FROM teacher",
//		"WHERE id = #{id}"
//	})
	int deleteByPrimaryKey(Long id);
}
