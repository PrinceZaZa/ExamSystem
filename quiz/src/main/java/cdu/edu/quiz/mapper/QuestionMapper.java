package cdu.edu.quiz.mapper;

import cdu.edu.quiz.entity.PapIdQuesCourse;
import cdu.edu.quiz.entity.Question;
import cdu.edu.quiz.entity.QuestionPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface QuestionMapper {
    List<Question> queryAll(Question question);

    void addQuestion(Question question);

    Question queryQuestionById(Integer id);

    void editQuestion(Question question);

    void deleteQuestionById(Integer id);

    List<Question> queryAllType();

    List<Question> queryAllCourse();

    int queryAllQuestionNums();

    List<Map> queryNumOfQuestionType();

    List<Question> queryAllQueIdNotInPaperById(PapIdQuesCourse papid);

    int AddAllQues(List<QuestionPaper> questionPapers);

    int queryIdByPapQue(Integer[] ques);
    @Select("select count(*) from question")
    int queryCountAllQues();
}
