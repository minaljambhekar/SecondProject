package com.niit.secondprojectbackend.dao;



import java.util.List;

import com.niit.secondprojectbackend.model.Blog;


public interface BlogDAO {
	public void addBlog(Blog blog);
	public void updateBlog(Blog blog);
	public void deleteBlog(Blog blog);
	public List<Blog> listBlogs();
	public Blog getBlogByBlogId(long blogId);
}

