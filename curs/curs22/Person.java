package curs.curs22;

import java.util.Objects;

public class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        return (name.equals(((Person) obj).name) && age == ((Person) obj).age);
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person-> Name:" + name + " Age:" + age;
    }
}
