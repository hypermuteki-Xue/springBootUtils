package com.learning.dao;

import com.learning.domain.book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface bookDao {
      @Select("select * from book where id=#{id}")
      book findBook(int id);
      @Insert("insert into book (id, bookName) values (#{id},#{bookName})")
      boolean saveBook(int id,String bookName);
}
