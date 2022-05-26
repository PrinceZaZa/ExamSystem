package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class PapIdQuesCourse {
    private Integer papid;//试卷id
    private String questionCourse;//课程的问题

    public PapIdQuesCourse(Integer papid, String questionCourse) {
    }

    public PapIdQuesCourse() {
    }

    public Integer getPapid() {
        return papid;
    }

    public void setPapid(Integer papid) {
        this.papid = papid;
    }

    public String getQuestionCourse() {
        return questionCourse;
    }

    public void setQuestionCourse(String questionCourse) {
        this.questionCourse = questionCourse;
    }
}
