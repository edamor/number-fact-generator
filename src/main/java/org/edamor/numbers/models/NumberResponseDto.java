package org.edamor.numbers.models;

public class NumberResponseDto {

    private String text;
    private Integer number;

    public NumberResponseDto() {
    }

    public NumberResponseDto(String text, Integer number) {
        this.text = text;
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
