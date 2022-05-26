package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class Record {
    private int recordId;//记录id
    private String recordName;//记录的名称
    private int studentId;//学生id
    private int paperId;//试卷id
    private String recordAnswer;//记录的答案
    private Double recordAcc;//通过率
    private int recordScore;//分数
    private Student student;//学生
}
