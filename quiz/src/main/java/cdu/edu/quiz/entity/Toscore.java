package cdu.edu.quiz.entity;


public class Toscore {
    private int toscoreId;//id
    private int paperId;//试卷id
    private int toscore;//分数

    public Toscore(int paperId, int toscore) {
        this.paperId = paperId;
        this.toscore = toscore;
    }

    public Toscore() {
    }

    public int getToscoreId() {
        return toscoreId;
    }

    public void setToscoreId(int toscoreId) {
        this.toscoreId = toscoreId;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public int getToscore() {
        return toscore;
    }

    public void setToscore(int toscore) {
        this.toscore = toscore;
    }
}
