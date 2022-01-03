package com.kenta.traning.blog_backend.routes;

import com.kenta.traning.blog_backend.models.BlogResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogRoute {

    @GetMapping
    public ResponseEntity<BlogResponse> getBlog(){
        BlogResponse response = new BlogResponse();
        response.setTitle("test");
        response.setDescription("test description");
        response.setData("test data");
        return ResponseEntity.ok(response);
    }

}
