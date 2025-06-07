package com.mcmanuel.QuizProject.question;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/questions")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping
    ResponseEntity<Question> createQuestion(@RequestBody Question question){
        return new ResponseEntity<>(questionService.createQuestion(question), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<Question> getQuestion(@PathVariable long id) throws Exception {
        return new ResponseEntity<>( questionService.getQuestionById(id),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<List<Question>> getAllQuestions(){
        return new ResponseEntity<>( questionService.getAllQuestions(),HttpStatus.OK);
    }

    @GetMapping("/{category}")
    ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return new ResponseEntity<>( questionService.getQuestionsByCategory(category),HttpStatus.OK);
    }


    @PutMapping("/{id}")
    ResponseEntity<Question> updateQuestion(@PathVariable long id,@RequestBody Question question) throws Exception {
        return new ResponseEntity<>( questionService.updateQuestion(id,question),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteQuestion(@PathVariable long id) throws Exception {
        questionService.deleteQuestion(id);
        return new ResponseEntity<>( "Question with id "+id+ " deleted",HttpStatus.OK);
    }

}
