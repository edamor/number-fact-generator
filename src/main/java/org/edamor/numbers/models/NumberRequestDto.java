package org.edamor.numbers.models;

public class NumberRequestDto {

    private String type = "trivia";
    private Integer max;
    private Boolean fragment;
    private Integer min;
    private Boolean json = true;

    public NumberRequestDto(Integer max, Boolean fragment, Integer min) {
        this.max = max;
        this.fragment = fragment;
        this.min = min;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Boolean getFragment() {
        return fragment;
    }

    public void setFragment(Boolean fragment) {
        this.fragment = fragment;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Boolean getJson() {
        return json;
    }

    public void setJson(Boolean json) {
        this.json = json;
    }
}
