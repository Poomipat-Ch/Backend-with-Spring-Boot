package com.kenta.traning.blog_backend.models;

import lombok.Data;

@Data
public class BlogResponse {
    private String title;
    private String description;
    private String data;
}
