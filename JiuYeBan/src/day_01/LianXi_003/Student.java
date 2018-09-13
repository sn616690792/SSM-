package day_01.LianXi_003;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String eat;

    public Student() {
    }

    public Student(String name, int age, String eat) {
        this.name = name;
        this.age = age;
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eat='" + eat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(eat, student.eat);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, eat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}