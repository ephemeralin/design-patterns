package gof.creational.buider;

public class Person {

    private String lastName;
    private String firstName;
    private String city;
    private boolean isFemale;
    private boolean isEmployed;

    private Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCity() {
        return city;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public static class PersonBuilder {

        private String lastName;
        private String firstName;
        private String city;
        private boolean isFemale;
        private boolean isEmployed;

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setFemale(boolean female) {
            this.isFemale = female;
            return this;
        }

        public PersonBuilder setEmployed(boolean employed) {
            this.isEmployed = employed;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.city = this.city;
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.city = this.city;
            person.isEmployed = this.isEmployed;
            person.isFemale = this.isFemale;
            return person;
        }
    }
}
