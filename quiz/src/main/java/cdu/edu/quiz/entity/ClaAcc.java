package cdu.edu.quiz.entity;

import lombok.Data;

/**
 * @Description:及格率展示
 */
@Data
public class ClaAcc {
    private int clasaccId;//id
    private String examName;//考试名称
    private String claName;//课程名称
    private int toscPer;
    private int acscPer;
    private double acc;//通过率

    public ClaAcc(String examName, String claName, int toscPer, int acscPer, double acc) {
        this.examName = examName;
        this.claName = claName;
        this.toscPer = toscPer;
        this.acscPer = acscPer;
        this.acc = acc;
    }

    public ClaAcc() {
    }
}
