package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class QuestionPaper {
    private int id;//id
    private int questionId;//试题id
    private int paperId;//试卷id
    private Question question;//问题
    private Paper paper;//试卷

    public QuestionPaper(int id, int questionId, int paperId, Question question, Paper paper) {
        this.id = id;
        this.questionId = questionId;
        this.paperId = paperId;
        this.question = question;
        this.paper = paper;
    }

    public QuestionPaper() {
    }

    public QuestionPaper(int questionId, int paperId) {
        this.questionId = questionId;
        this.paperId = paperId;
    }
}
