package com.NewZoo;

public enum Dogs {
    DOG1("Шарик", 2, "Мужской"),
    DOG2("Василиса", 3, "Женский"),
    DOG3("Влад", 5, "Мужской");

    private String имя;
    private int возраст;
    private String пол;

    Dogs(String имя, int возраст, String пол) {
        this.имя = имя;
        this.возраст = возраст;
        this.пол = пол;
    }

    public String getИмя() {
        return имя;
    }

    public void setИмя(String имя) {
        this.имя = имя;
    }

    public int getВозраст() {
        return возраст;
    }

    public void setВозраст(int возраст) {
        this.возраст = возраст;
    }

    public String getПол() {
        return пол;
    }

    public void setПол(String пол) {
        this.пол = пол;
    }
}
