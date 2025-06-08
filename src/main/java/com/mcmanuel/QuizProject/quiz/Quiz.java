package com.mcmanuel.QuizProject.quiz;

import com.mcmanuel.QuizProject.Category;
import com.mcmanuel.QuizProject.DifficultyLevel;
import com.mcmanuel.QuizProject.question.Question;
import com.mcmanuel.QuizProject.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Integer id;

    private String title;

    @ManyToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
    private List<Question> questionList;

    private int score;

    @OneToOne(mappedBy = "quiz")
    private User user;

}
