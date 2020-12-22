package org.edamor.numbers.models;

public class NumberTrivia {

    private String text;
    private Integer number;
    private Boolean found;
    private String type;

    public NumberTrivia(String text, Integer number, Boolean found, String type) {
        this.text = text;
        this.number = number;
        this.found = found;
        this.type = type;
    }

    public NumberTrivia() {

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

    public Boolean getFound() {
        return found;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
