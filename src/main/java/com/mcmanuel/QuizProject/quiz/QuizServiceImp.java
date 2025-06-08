package com.mcmanuel.QuizProject.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuizServiceImp implements  QuizService{
    private final QuizRepository quizRepo;

    @Override
    public Quiz createQuiz(String category, int noOfQues, String title) {
     return null;
    }
}
