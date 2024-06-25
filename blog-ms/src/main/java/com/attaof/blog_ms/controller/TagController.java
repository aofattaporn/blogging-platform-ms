package com.attaof.blog_ms.controller;

import com.attaof.blog_ms.entity.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tags")
public class TagController {

    // Create a new tag
    @PostMapping
    public ResponseEntity<Tag> createTag(@RequestBody Tag tag) {
        return ResponseEntity.ok(new Tag());
    }

    // Retrieve all tags
    @GetMapping
    public ResponseEntity<List<Tag>> getAllTags() {
        return ResponseEntity.ok(Arrays.asList());
    }

    // Retrieve a specific tag by ID
    @GetMapping("/{id}")
    public ResponseEntity<Tag> getTagById(@PathVariable UUID id) {
        return ResponseEntity.ok(new Tag());
    }
}
