package com.kenta.traning.blog_backend.route;

import com.kenta.traning.blog_backend.model.BlogResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogApi {

    @GetMapping
    public ResponseEntity<BlogResponse> getBlog(){
        BlogResponse response = new BlogResponse();
        response.setTitle("test");
        response.setDescription("test description");
        response.setData("test data");
        return ResponseEntity.ok(response);
    }

}
