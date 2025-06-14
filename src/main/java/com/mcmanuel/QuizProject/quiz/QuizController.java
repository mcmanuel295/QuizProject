package com.mcmanuel.QuizProject.quiz;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestParam String category, @RequestParam int noOfQues, @RequestParam String title){
        return new ResponseEntity<>(quizService.createQuiz(category,noOfQues,title), HttpStatus.CREATED);
    }
}
