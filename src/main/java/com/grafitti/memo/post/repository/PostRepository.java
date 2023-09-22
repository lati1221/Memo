package com.grafitti.memo.post.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.grafitti.memo.post.domain.Post;

@Repository
public interface PostRepository {
	
	public int insertPost(
			@Param("userId") int userId
			, @Param("title")String title
			, @Param("content") String content);
	
	
	public List<Post> selectPostList();
	

}
