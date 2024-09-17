package es.ulpgc;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final String gender;
    private final LocalDate birthday;
    public Person(String name, String gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        Period age = Period.between(birthday, LocalDate.now());
        return age.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }
}
