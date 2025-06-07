package com.mcmanuel.QuizProject.question;


import java.util.List;

public interface QuestionService {

    Question createQuestion(Question question);
    Question getQuestionById(long questionId) throws Exception;
    List<Question> getAllQuestions();
    Question updateQuestion(long questionId, Question question) throws Exception;
    void deleteQuestion(long id) throws Exception;

    List<Question> getQuestionsByCategory(String category);
}
