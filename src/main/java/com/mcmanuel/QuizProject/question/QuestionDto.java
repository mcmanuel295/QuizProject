package com.mcmanuel.QuizProject.question;

import com.mcmanuel.QuizProject.quiz.Quiz;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
