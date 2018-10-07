package com.learning.house.commentservice.mapper;

import com.learning.house.commentservice.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

  int insert(Comment comment);
  
  List<Comment> selectComments(@Param("houseId") long houseId, @Param("size") int size);
  
  List<Comment> selectBlogComments(@Param("blogId") long blogId, @Param("size") int size);
  
}

