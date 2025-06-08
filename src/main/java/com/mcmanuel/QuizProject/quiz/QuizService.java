package com.mcmanuel.QuizProject.quiz;

import com.mcmanuel.QuizProject.DifficultyLevel;
import org.springframework.web.bind.annotation.RequestParam;

public interface QuizService {
    Quiz createQuiz(String category, int noOfQues, DifficultyLevel difficultyLevel);
}
