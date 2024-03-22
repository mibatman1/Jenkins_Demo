package com.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelineController 
{
    @GetMapping("/test")
    public String demoController()
    {
        return "Hello From The Demo App";
    }
}
