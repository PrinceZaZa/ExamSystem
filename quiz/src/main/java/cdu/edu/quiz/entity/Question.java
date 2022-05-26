package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class Question {
    private int questionId;//问题的id
    private String questionType;//问题的类型
    private String questionCourse;//问题的课程
    private String questionName;//问题名称
    private String questionOpa;//答案a
    private String questionOpb;//答案b
    private String questionOpc;//答案c
    private String questionOpd;//答案d
    private String questionOpright;//正确答案

    public Question(int questionId, String questionType, String questionCourse, String questionName, String questionOpa, String questionOpb, String questionOpc, String questionOpd, String questionOpright) {
        this.questionId = questionId;
        this.questionType = questionType;
        this.questionCourse = questionCourse;
        this.questionName = questionName;
        this.questionOpa = questionOpa;
        this.questionOpb = questionOpb;
        this.questionOpc = questionOpc;
        this.questionOpd = questionOpd;
        this.questionOpright = questionOpright;
    }

    public Question() {
    }

    public Question(String questionType, String questionCourse) {
        this.questionType = questionType;
        this.questionCourse = questionCourse;
    }
}
