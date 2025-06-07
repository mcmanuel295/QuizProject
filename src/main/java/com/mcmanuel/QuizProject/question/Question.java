package com.mcmanuel.QuizProject.question;

import com.mcmanuel.QuizProject.Category;
import com.mcmanuel.QuizProject.DifficultyLevel;
import com.mcmanuel.QuizProject.quiz.Quiz;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficulty;

    @Enumerated(EnumType.STRING)
    private Category category;

    private String title;

    private String question;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

    private String correctAnswer;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "questionList")
    private Quiz quiz;
}
