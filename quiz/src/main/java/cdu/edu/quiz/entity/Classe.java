package cdu.edu.quiz.entity;

import lombok.*;

@Data
public class Classe {
    private int classeId;//课程id
    private String classeName;//名称
    private int teacherId;//教师id
    //声明类，用于关联
    private Teacher teacher;
}
