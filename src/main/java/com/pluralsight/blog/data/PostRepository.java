package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource
public interface PostRepository extends JpaRepository<Post, Long> {
    @RestResource(rel="contains-title", path="containsTitle")
    public List<Post> findByTitleContaining(String title);

    @RestResource(rel="author-lastname", path="authorLastname")
    public List<Post> findByAuthor_Lastname(String lastname);
}