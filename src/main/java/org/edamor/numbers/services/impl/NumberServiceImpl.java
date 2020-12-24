package org.edamor.numbers.services.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.edamor.numbers.models.NumberResponseDto;
import org.edamor.numbers.models.NumberTrivia;
import org.edamor.numbers.services.NumberTriviaService;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;


@Service
public class NumberServiceImpl implements NumberTriviaService {

    private static final String numberTriviaUri = "https://numbersapi.p.rapidapi.com/random/trivia?";
    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpHeaders headers = new HttpHeaders();

    @Override
    public NumberResponseDto getNumberTrivia() throws NullPointerException {
        String uri = numberTriviaUri + "max=6022&min=0&json=true";
        headers.set("x-rapidapi-key", "a13a14aa2amshd027467d9d9f720p188376jsn09af7071b9e1");
        headers.set("x-rapidapi-host", "numbersapi.p.rapidapi.com");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        NumberTrivia numberTrivia = null;
        try {
            numberTrivia = objectMapper.readValue(Objects.requireNonNull(response.getBody()), NumberTrivia.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        assert numberTrivia != null;

        return new NumberResponseDto(numberTrivia.getText(), numberTrivia.getNumber());
    }

    @Override
    public NumberResponseDto getNumberTriviaByNumber(Integer triviaNumber) {
        String uri = numberTriviaUri + "max=" + triviaNumber + "&min=" + triviaNumber + "&json=true";
        headers.set("x-rapidapi-key", "a13a14aa2amshd027467d9d9f720p188376jsn09af7071b9e1");
        headers.set("x-rapidapi-host", "numbersapi.p.rapidapi.com");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
        NumberTrivia numberTrivia = null;
        try {
            numberTrivia = objectMapper.readValue(Objects.requireNonNull(response.getBody()), NumberTrivia.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        assert numberTrivia != null;

        return new NumberResponseDto(numberTrivia.getText(), numberTrivia.getNumber());
    }
}
