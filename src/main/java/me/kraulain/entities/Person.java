package me.kraulain.entities;

public class Person {
    private String uuid;
    private String name;
    private int age;

    public Person() {    }

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Person(String uuid, String name, int age) {
        this.setUuid(uuid);
        this.setName(name);
        this.setAge(age);
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge();
    }
}
