package com.mcmanuel.QuizProject.quiz;

import com.mcmanuel.QuizProject.DifficultyLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImp implements  QuizService{
    private final QuizRepository quizRepo;

    @Override
    public Quiz createQuiz(String category, int noOfQues, DifficultyLevel difficultyLevel) {

     return null;
    }
}
