package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class RecordExam {
    private int ReId;//考试记录id
    private Integer claId;//课程id
    private String exaName;//考试名称
    private Double toscore;//分数

    public RecordExam(Integer claId, String exaName, Double toscore) {
        this.claId = claId;
        this.exaName = exaName;
        this.toscore = toscore;
    }

    public RecordExam() {
    }

    public int getReId() {
        return ReId;
    }

    public void setReId(int reId) {
        ReId = reId;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public String getExaName() {
        return exaName;
    }

    public void setExaName(String exaName) {
        this.exaName = exaName;
    }

    public Double getToscore() {
        return toscore;
    }

    public void setToscore(Double toscore) {
        this.toscore = toscore;
    }
}
