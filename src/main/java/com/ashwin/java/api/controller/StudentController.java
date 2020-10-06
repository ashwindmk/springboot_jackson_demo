package com.ashwin.java.api.controller;

import com.ashwin.java.domain.model.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {


    @PostMapping
    @RequestMapping("/reflect")
    public ResponseEntity<Student> reflect(@RequestBody Optional<Student> studentBody) {
        Student student = studentBody.get();
        System.out.println("Reflect Student received: " + student);

        student.setResponse("{\"status\": 200, \"message\": \"success\"}");
        student.setExtra("Extra data");
        System.out.println("Reflect Student: " + student);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println("Reflect Student sent: " + objectMapper.writeValueAsString(student));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(student);
    }
}
