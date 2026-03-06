package com.praptigodshelwar.learningrestapis.service.impl;
import com.praptigodshelwar.learningrestapis.dto.AddStudentRequestDto;
import com.praptigodshelwar.learningrestapis.dto.GetAllNavigationItemsResponseDto;
import com.praptigodshelwar.learningrestapis.dto.StudentDto;
import com.praptigodshelwar.learningrestapis.entity.Student;
import com.praptigodshelwar.learningrestapis.repository.StudentRepo;
import com.praptigodshelwar.learningrestapis.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {
    private final StudentRepo studentRepo;
//    private final ModelMapper modelMapper;

    @Override
    public void deleteStudentById(Long id) {
        if(!studentRepo.existsById(id)){
            throw new IllegalArgumentException("Student with id " + id + " does not exist");
        }
        studentRepo.deleteById(id);
    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student student = studentRepo.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Student not found with ID:"+id));
        student.setName(addStudentRequestDto.getName());
        student.setEmail(addStudentRequestDto.getEmail());
        Student updatedStudent = studentRepo.save(student);
        return new StudentDto(updatedStudent.getId(),updatedStudent.getName(),updatedStudent.getEmail());
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public StudentDto getStudentByID(long id) {
        Student student = studentRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with ID:"+id));
        return new StudentDto(student.getId(),student.getName(),student.getEmail());
    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student student = new Student();
        student.setName(addStudentRequestDto.getName());
        student.setEmail(addStudentRequestDto.getEmail());
        Student savedStudent = studentRepo.save(student);
        return new StudentDto(savedStudent.getId(),savedStudent.getName(),savedStudent.getEmail());
    }

    @Override
    public List<GetAllNavigationItemsResponseDto> getAllNavigationItems() {
        var navigationItems = new ArrayList<GetAllNavigationItemsResponseDto>();


        // HardCode logic
//        GetAllNavigationItemsResponseDto item1 = new GetAllNavigationItemsResponseDto(1L,"Subscription",0L);
//        GetAllNavigationItemsResponseDto item2 = new GetAllNavigationItemsResponseDto(2L,"tall Group",1L);
//        GetAllNavigationItemsResponseDto item3 = new GetAllNavigationItemsResponseDto(3L,"Small Group",1L);
//        GetAllNavigationItemsResponseDto item4 = new GetAllNavigationItemsResponseDto(4L,"Playlist",0L);
//        GetAllNavigationItemsResponseDto item5 = new GetAllNavigationItemsResponseDto(5L,"RetroSong",4L);
//        GetAllNavigationItemsResponseDto item6 = new GetAllNavigationItemsResponseDto(6L,"PopSong",4L);
//        GetAllNavigationItemsResponseDto item7 = new GetAllNavigationItemsResponseDto(7L,"JazzSong",4L);
//        GetAllNavigationItemsResponseDto item8 = new GetAllNavigationItemsResponseDto(8L,"subTallGroup",2L);
//
//        navigationItems.add(item1);
//        navigationItems.add(item2);
//        navigationItems.add(item3);
//        navigationItems.add(item4);
//        navigationItems.add(item5);
//        navigationItems.add(item6);
//        navigationItems.add(item7);
//        navigationItems.add(item8);



        var result = new ArrayList <GetAllNavigationItemsResponseDto>();
        for(GetAllNavigationItemsResponseDto item : navigationItems){
            if(item.parent==0L){
                result.add(item);
            }else {
                Long parent = item.parent;
                for (GetAllNavigationItemsResponseDto newItem : navigationItems) {
                    if (Objects.equals(newItem.id, parent)) {
                        newItem.children.add(item);
                    }
                }
            }
        }

        return result;
    }



}
