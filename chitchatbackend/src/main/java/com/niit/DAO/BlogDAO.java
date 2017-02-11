package com.niit.DAO;

import java.util.List;

import com.niit.model.Blog;
import com.niit.model.BlogComment;


public interface BlogDAO {
	public void addBlog(Blog blog);
	public void updateBlog(Blog blog);
	public void deleteBlog(Blog blog);
	public List<Blog> listBlogs();
	public List<Blog> listNewBlogs();
	public Blog getBlogByBlogId(long blogId);
	public void deleteBlogByUserId(long userId);
	public List<BlogComment> commentListByBlogId(long BlogId);
	public void addBlogComment(BlogComment comment);
	
}
