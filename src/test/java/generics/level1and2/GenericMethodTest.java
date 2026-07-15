package generics.level1and2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class GenericMethodTest {

    @ParameterizedTest
    @CsvSource({
            "Juan Carlos, Valerón, 50",
            "Pedri, González, 24",
            "David, Silva, 43"
    })
    void shouldAcceptAnyCombinationOfTypes(String name, String surname, int age) {

        Person person = new Person(name, surname, age);

        assertDoesNotThrow(() -> {
            GenericMethods.printElements(person, age, name);
            GenericMethods.printElements(age, person, surname);
        });
    }

    @Test
    void shouldAcceptVariableArgumentsAndTypes() {

        Person persona = new Person("David", "Silva", 41);

        assertDoesNotThrow(() -> {
            GenericMethods.printAll("Un String");
            GenericMethods.printAll(1, 2, 3, 4, 5);
            GenericMethods.printAll("Barça Campeón", persona, 99.9, true, 'X');
        });
    }
}
