package com.example.blog.blog_api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

interface CategoryRepository extends JpaRepository<Category, Long>{
}

interface CommentRepository extends JpaRepository<Comment, Long> {
}