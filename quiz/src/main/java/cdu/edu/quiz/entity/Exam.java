package cdu.edu.quiz.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Exam {
    private int examId;//考试id
    private int paperId;//试卷id
    private Date examBegin;//考试开始时间
    private Date examEnd;//考试结束时间
    private Paper paper;//试卷类型
}
