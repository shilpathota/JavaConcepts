package Basics;

public final class ImmutableClassPerson {
    private final String name;
    private final int age;

    public ImmutableClassPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}