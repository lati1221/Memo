package com.grafitti.memo.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grafitti.memo.post.domain.Post;
import com.grafitti.memo.post.service.PostService;

@RequestMapping("/post")
@Controller
public class PostController {
	
	@Autowired
	private PostService postService;
	
	
	@GetMapping("/list-view")
	public String postList(Model model) {
		
		
		
		List<Post> postList = postService.getPostList();
		
		model.addAttribute("postList", postList);
		
		return "post/list";
	}
	
	@GetMapping("/create-view")
	public String postInput() {
		return "post/input";
	}

}
