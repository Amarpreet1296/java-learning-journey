package Projects.MiniCricketProject;

import java.util.ArrayList;
import java.util.List;

public class Cricketer {
    private String name;
    private int age;
    private String role;
    private int runs;

    Cricketer(String name, int age, String role, int runs) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.runs = runs;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRole() {
        return role;
    }
    public int getRuns() {
        return runs;
    }

    @Override
    public String toString (){

        return name + " | Age: " + age + " | Role: " + role + " | Runs: " + runs;

    }

}
