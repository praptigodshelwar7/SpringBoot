package com.praptigodshelwar.learningrestapis.controller;
import com.praptigodshelwar.learningrestapis.dto.AddStudentRequestDto;
import com.praptigodshelwar.learningrestapis.dto.GetAllNavigationItemsResponseDto;
import com.praptigodshelwar.learningrestapis.dto.StudentDto;
import com.praptigodshelwar.learningrestapis.entity.Student;
import com.praptigodshelwar.learningrestapis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getStudents(){
        var results = new ArrayList<StudentDto>();
        var students = studentService.getAllStudents();

        students.forEach(student -> {
            results.add(
                    new StudentDto(student.getId(),student.getName(),student.getEmail())
            );
        });
        return results;
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentByID(id));
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentRequestDto  addStudentRequestDto){
        StudentDto createdStudent=studentService.createNewStudent(addStudentRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }
    @DeleteMapping("/students/{id}")
    public ResponseEntity<Void> deleteAStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/getAllNavigationItems")
    public ResponseEntity<List<GetAllNavigationItemsResponseDto>> getAllNavigationItems(){
        return ResponseEntity.ok(studentService.getAllNavigationItems());
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudent(id,addStudentRequestDto));
    }



}
