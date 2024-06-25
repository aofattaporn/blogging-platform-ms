package com.attaof.blog_ms.repository;

import com.attaof.blog_ms.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogRepository extends JpaRepository<Blog, UUID> {
}
