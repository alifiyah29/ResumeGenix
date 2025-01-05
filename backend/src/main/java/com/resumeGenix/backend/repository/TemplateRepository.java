package com.resumeGenix.backend.repository;

import com.resumeGenix.backend.model.Template;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateRepository extends JpaRepository<Template, Long> {
}
