package edu.JavaLessons.l1;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public void sayMeow() {
        System.out.println(name + ": Мяу...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
