package com.resumeGenix.backend.controller;

import com.resumeGenix.backend.model.Template;
import com.resumeGenix.backend.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/templates")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping("/")
    public List<Template> getAllTemplates() {
        return templateService.getAllTemplates();
    }

    @PostMapping("/create")
    public Template createTemplate(@RequestBody Template template) {
        return templateService.createTemplate(template);
    }
}
