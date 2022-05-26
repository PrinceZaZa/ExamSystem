package cdu.edu.quiz.entity;

import lombok.*;

@Data
public class Teacher {
    private int teacherId;//教师id
    private String teacherName;//教师姓名
    private String teacherAccount;//教师账号
    private String teacherEmail;//邮箱
    private String teacherPwd;//密码
    private int power;//权限
}
