package com.learning.dao;

import com.learning.domain.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface studentDao {
    @Select("select * from student where id=#{id}")
    student findStudent(@Param("id") Integer id);
}
