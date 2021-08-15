package com.NewZoo;

public enum Birds {
    BIRD1("Никита", 1, "Мужской"),
    BIRD2("Марсель", 1, "Мужской"),
    BIRD3("Наталья", 2, "Женский");

    private String имя;
    private int возраст;
    private String пол;

    Birds(String имя, int возраст, String пол) {
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
