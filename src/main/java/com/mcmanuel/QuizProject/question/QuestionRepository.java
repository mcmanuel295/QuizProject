package com.mcmanuel.QuizProject.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT q FROM Question q WHERE q.category = :category ORDER BY RAND()")
    List<Question> findRandomQuestionsByCategory(String category);
}
