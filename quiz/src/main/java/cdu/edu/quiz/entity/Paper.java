package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class Paper {
    private int paperId;//试卷id
    private String paperName;//试卷名称
    private int scoreSin;//单选题
    private int scoreChe;//多选题
    private int scoreJug;//判断题
}
