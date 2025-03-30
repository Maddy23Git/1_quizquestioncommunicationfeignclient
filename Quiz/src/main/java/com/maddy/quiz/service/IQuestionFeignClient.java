package com.maddy.quiz.service;

import com.maddy.quiz.model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "Question-Client")
public interface IQuestionFeignClient {

    @GetMapping("/question/quiz/{quizId}")
    public List<Question> getQuestionsByQuiz(@PathVariable Long quizId);
}
