package com.pipeline.controllertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;

import com.pipeline.controller.PipelineController;

@WebMvcTest(PipelineController.class)
public class ControllerTest 
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_controller() throws Exception
    {
        mockMvc.perform(get("/test"))
            .andExpect(status().isOk());
    }
}
