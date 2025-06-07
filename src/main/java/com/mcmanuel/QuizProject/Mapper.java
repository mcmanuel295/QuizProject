package com.mcmanuel.QuizProject;

import com.mcmanuel.QuizProject.question.Question;
import com.mcmanuel.QuizProject.question.QuestionDto;

public class Mapper {

    public static QuestionDto toQuestionDto(Question question){
       return QuestionDto.builder()
                .title(question.getTitle())
                .category(question.getCategory())
                .difficulty(question.getDifficulty())
                .question(question.getQuestion())
                .option1(question.getOption1())
                .option2(question.getOption2())
                .option3(question.getOption3())
                .option4(question.getOption4())

               .build();
    }

    public static Question toQuestion(QuestionDto dto){

    }
}
