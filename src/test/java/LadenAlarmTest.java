import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LadenAlarmTest {

    @Test
    public void validCustomerSize(){

        // Given
        int case1 = 29;

        // When
        String result1 = LadenAlarm.howMuchCustomers(case1);

        // Then
        Assertions.assertEquals("Maximale Personenzahl nicht ueberschritten", result1);
    }

    @Test
        public void tooMuchCustomersTest(){

        // Given
        int case2 = 31;

        // When
        String result2 = LadenAlarm.howMuchCustomers(case2);

        // Then
        Assertions.assertEquals("Zu viele Personen", result2);

    }

    @Test
    public void edgeCase(){

        // Given
        int case3 = 30;

        // When
        String result3 = LadenAlarm.howMuchCustomers(case3);

        // Then
        Assertions.assertEquals("edgeCase", result3);
    }

}
