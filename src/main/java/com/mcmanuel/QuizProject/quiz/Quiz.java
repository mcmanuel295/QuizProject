package com.mcmanuel.QuizProject.quiz;

import com.mcmanuel.QuizProject.Category;
import com.mcmanuel.QuizProject.question.Question;
import com.mcmanuel.QuizProject.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quiz_id")
    private Long id;

    @OneToOne(mappedBy = "quiz")
    private User user;
    private Category category;
    private int noOfQuestion;
    @ManyToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
    private List<Question> questionList;

    private int score;
}
