package com.attaof.blog_ms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @PostMapping
    public ResponseEntity<String> createBlog() {
        return ResponseEntity.ok("Create Blog");
    }

    @GetMapping
    public ResponseEntity<String> getBlogById() {
        return ResponseEntity.ok("d");
    }

    @GetMapping
    public ResponseEntity<List<String>> getAllBlogs() {
        return ResponseEntity.ok(Arrays.asList(""));
    }

    @PutMapping
    public ResponseEntity<String> updateBlog(@PathVariable UUID id, @RequestBody String blog){
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable UUID id) {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/tags")
    public ResponseEntity<String> addTagToBlog(@PathVariable UUID id, @RequestBody String tag) {
        return ResponseEntity.ok("");
    }

}
