package com.mcmanuel.QuizProject.question;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequiredArgsConstructor
public class QuestionController {
    private final QuestionServiceImp questionService;
}
