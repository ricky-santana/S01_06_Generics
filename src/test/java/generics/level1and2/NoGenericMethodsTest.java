package generics.level1and2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NoGenericMethodsTest {

    @Test
    void shouldStoreAndShowElementRegardlessOrder(){
        int numA = 10;
        int numB = 55;
        int numC = 99;

        NoGenericMethods order1 = new NoGenericMethods(numA, numB, numC);
        NoGenericMethods order2 = new NoGenericMethods(numB, numC, numA);

        assertThat(order1.getElement1()).isEqualTo(numA);
        assertThat(order1.getElement2()).isEqualTo(numB);
        assertThat(order1.getElement3()).isEqualTo(numC);

        assertThat(order2.getElement1()).isEqualTo(numB);
        assertThat(order2.getElement2()).isEqualTo(numC);
        assertThat(order2.getElement3()).isEqualTo(numA);

    }
}
