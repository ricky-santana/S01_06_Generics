package generics.level1and2;
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
            GenericMethods.printElements(person, name, age);
            GenericMethods.printElements(age, person, surname);
        });
    }

}
