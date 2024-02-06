package com.collins.backend.resources;

import com.collins.backend.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentResource {

    private StudentService service;

    @PostMapping(value = "/uploads", consumes = {"multipart/form-data"})
    public ResponseEntity<Integer> uploadStudents(@RequestPart("file") MultipartFile file) throws IOException {
        return ResponseEntity.ok(service.uploadFile(file));
    }
}
