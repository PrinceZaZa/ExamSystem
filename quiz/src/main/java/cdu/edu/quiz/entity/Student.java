package cdu.edu.quiz.entity;

import lombok.*;

@Data
public class Student {
    private int studentId;//id
    private String studentName;//姓名
    private String studentAccount;//账号
    private String studentGender;//性别
    private String studentEmail;//邮箱
    private String studentPwd;//密码
    private int classeId;//课程id
    private Classe classe;//课程

    public Student(int studentId, String studentName, String studentAccount, String studentGender, String studentEmail, String studentPwd, int classId, Classe classe) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAccount = studentAccount;
        this.studentGender = studentGender;
        this.studentEmail = studentEmail;
        this.studentPwd = studentPwd;
        this.classeId = classId;
        this.classe = classe;
    }

    public Student() {
    }

    public Student(String studentAccount, String studentPwd) {
        this.studentAccount = studentAccount;
        this.studentPwd = studentPwd;
    }
}
