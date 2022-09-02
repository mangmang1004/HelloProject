package org.example;

public class Word {
    private String name; //private 하면 get, set을 만들어야 함 왜인지 공부하기
    private String meaning;

    public Word() {
    } // gernrater? 여기서 만들면 바로 만들면 됨 !

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
