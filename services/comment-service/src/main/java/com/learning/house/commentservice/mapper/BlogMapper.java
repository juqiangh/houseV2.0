package com.learning.house.commentservice.mapper;

import com.learning.house.commentservice.model.Blog;
import com.learning.house.commentservice.model.LimitOffset;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BlogMapper {
  
  public List<Blog> selectBlog(@Param("blog") Blog blog, @Param("pageParams") LimitOffset limitOffset);
  
  public Long selectBlogCount(Blog query);

}
