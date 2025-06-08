package com.mcmanuel.QuizProject.quiz;

import com.mcmanuel.QuizProject.question.QuestionDto;
import com.mcmanuel.QuizProject.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizServiceImp implements  QuizService{
    private final QuestionRepository questionRepo;

    @Override
    public Quiz createQuiz(String category, int noOfQues, String title) {
        List<QuestionDto> questionDtoList = questionRepo.findRandomQuestionsByCategory(category,noOfQues).;
      return Quiz.builder()
              .title(title)
              .build();
    }
}
