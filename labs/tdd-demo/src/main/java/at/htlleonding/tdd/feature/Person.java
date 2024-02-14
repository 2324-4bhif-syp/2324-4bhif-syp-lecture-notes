package at.htlleonding.tdd.feature;


public class Person {

    String lastName;

    Person() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        Person person = new Person();

        public Person build() {
            return person;
        }

        public Builder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }
    }
}
