package comparatorTaskBiloleg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Persons {

    @Getter @Setter private String name;
    @Getter private int age;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
