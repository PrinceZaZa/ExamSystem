package cdu.edu.quiz.service.impl;

import cdu.edu.quiz.entity.Student;
import cdu.edu.quiz.service.StudentService;
import cdu.edu.quiz.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.queryAll();
    }

    @Override
    public Student check(Student student) {
        return studentMapper.check(student);
    }

    @Override
    public int queryCOuntALlstu() {
        return studentMapper.queryCOuntALlstu();
    }

    @Override
    public void AddStudent(Student student) {
        studentMapper.AddStudent(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public void EditStudent(Student student) {
        studentMapper.EditStudent(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMapper.deleteById(id);
    }
}
