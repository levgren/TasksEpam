package comparatorTaskBiloleg;

import lombok.Getter;

public class Persons {

    @Getter private String name;
    @Getter private int age;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age;
    }
}
