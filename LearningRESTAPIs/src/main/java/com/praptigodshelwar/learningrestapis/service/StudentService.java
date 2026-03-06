package com.praptigodshelwar.learningrestapis.service;

import com.praptigodshelwar.learningrestapis.dto.AddStudentRequestDto;
import com.praptigodshelwar.learningrestapis.dto.GetAllNavigationItemsResponseDto;
import com.praptigodshelwar.learningrestapis.dto.StudentDto;
import com.praptigodshelwar.learningrestapis.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllStudents();
    List<GetAllNavigationItemsResponseDto> getAllNavigationItems();
    StudentDto getStudentByID(long id);
    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);
    void deleteStudentById(Long id) ;

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}
