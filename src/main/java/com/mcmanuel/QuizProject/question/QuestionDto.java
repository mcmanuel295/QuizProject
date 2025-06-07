package com.mcmanuel.QuizProject.question;

import com.mcmanuel.QuizProject.Category;
import com.mcmanuel.QuizProject.DifficultyLevel;
import com.mcmanuel.QuizProject.quiz.Quiz;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionDto {
    private Long id;
    private DifficultyLevel difficulty;
    private Category category;
    private String title;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private Quiz quiz;

}
