package at.htlleonding.tdd.feature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    Person person;



    @BeforeEach
    void setUp() {
        person = Person.builder().build();
    }

    @Test
    void givenPerson_when_thenLastnameIsNull() {
        assertThat(person).isNotNull();
        assertThat(person.lastName).isNull();
    }

    @Test
    void givenPerson_whenNamedDoe_thenItHasLastNameDoe() {
        person.lastName="doe";
        assertThat(person.lastName).isEqualTo("doe");
    }

    @Test
    void givenPerson_whenNamedDoe_thenItHasNameDoe() {
        final var expected = "doe";
        var johnWithActualLastname = Person.builder().lastName("doe").build();
        assertThat(expected).isEqualTo(johnWithActualLastname.lastName);
    }
}