package com.mcmanuel.QuizProject.question;

import com.mcmanuel.QuizProject.Category;
import com.mcmanuel.QuizProject.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class QuestionServiceImp implements QuestionService{
    private final QuestionRepository questionRepo;

    @Override
    public Question createQuestion(Question question) {
        return questionRepo.save(question);
    }


    @Override
    public Question getQuestionById(long questionId) throws Exception {
        Optional<Question> question = questionRepo.findById(questionId);
        if (question.isPresent()) {
            return question.get();
        }
        throw new Exception("Question with id " + questionId + " not found");
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }


    @Override
    public List<QuestionDto> getQuestionsByCategory(String category) {
        Category.valueOf(category);
        return questionRepo.findRandomQuestionsByCategory(category).stream()
                .map(Mapper::toQuestionDto)
                .toList();

    }

    @Override
    public Question updateQuestion(long questionId,Question updateQuestion) throws Exception {
        Optional<Question> question = questionRepo.findById(questionId);

        if (question.isEmpty()) {
            throw new Exception("Question with id " + questionId + " not found");
        }

        updateQuestion.setId(questionId);
        return questionRepo.save(updateQuestion);
    }

    @Override
    public void deleteQuestion(long questionId) throws Exception {
        Optional<Question> question = questionRepo.findById(questionId);

        if (question.isEmpty()) {
            throw new Exception("Question with id " + questionId + " not found");
        }

        questionRepo.deleteById(questionId);
    }

}
