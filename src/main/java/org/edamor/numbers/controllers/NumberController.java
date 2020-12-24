package org.edamor.numbers.controllers;


import org.edamor.numbers.models.NumberResponseDto;
import org.edamor.numbers.services.NumberTriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/numbers")
public class NumberController {

    @Autowired
    private NumberTriviaService numberService;

    @GetMapping("/fact")
    private NumberResponseDto getNumberFact() {
        return numberService.getNumberTrivia();
    }

}
