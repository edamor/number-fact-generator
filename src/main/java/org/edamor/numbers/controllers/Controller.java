package org.edamor.numbers.controllers;


import org.edamor.numbers.models.NumberResponseDto;
import org.edamor.numbers.models.NumberTrivia;
import org.edamor.numbers.services.NumberTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/numbers-trivia-service")
public class Controller {

    @Autowired
    private NumberTriviaService numberService;

    @GetMapping("/get")
    private NumberResponseDto getNumberTrivia() {
        return numberService.getNumberTrivia();
    }
}
