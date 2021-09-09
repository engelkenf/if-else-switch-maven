import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadenAlarmTest {

    @Test
    @DisplayName("validCustomers")
    public void validCustomerSize(){

        // Given
        int case1 = 29;

        // When
        String result1 = LadenAlarm.howMuchCustomers(case1);

        // Then
        Assertions.assertEquals("Maximale Personenzahl nicht ueberschritten", result1);
    }

    @Test
    @DisplayName("tooMuchCustomers")
        public void tooMuchCustomersTest(){

        // Given
        int case2 = 31;

        // When
        String result2 = LadenAlarm.howMuchCustomers(case2);

        // Then
        Assertions.assertEquals("Zu viele Personen", result2);

    }

    @Test
    @DisplayName("EdgeCase")
    public void edgeCase(){

        // Given
        int case3 = 30;

        // When
        String result3 = LadenAlarm.howMuchCustomers(case3);

        // Then
        Assertions.assertEquals("edgeCase", result3);
    }

    @Test
    @DisplayName("validCustomersGreenSwitch")
    public void validCustomerSizeGreenSwitch(){

        // Given
        int case4 = 29;

        // When
        String result4 = LadenAlarm.howMuchCustomersSwitch("green",case4);

        // Then
        Assertions.assertEquals("Maximale Personenzahl nicht ueberschritten", result4);
    }
    @Test
    @DisplayName("invalidCustomersGreenSwitch")
    public void invalidCustomerSizeGreenSwitch(){

        // Given
        int case5 = 61;

        // When
        String result5 = LadenAlarm.howMuchCustomersSwitch("green", case5);

        // Then
        Assertions.assertEquals("Zu viele Personen", result5);

    }

    @Test
    @DisplayName("validCustomersYellowSwitch")
    public void validCustomerSizeYellowSwitch(){

        // Given
        int case6 = 29;

        // When
        String result6 = LadenAlarm.howMuchCustomersSwitch("yellow", case6);

        // Then
        Assertions.assertEquals("Maximale Personenzahl nicht ueberschritten", result6);

    }

    @Test
    @DisplayName("invalidCustomersYellowSwitch")
    public void invalidCustomerSizeYellowSwitch(){

        // Given
        int case7 = 31;

        // When
        String result7 = LadenAlarm.howMuchCustomersSwitch("yellow", case7);

        // Then
        Assertions.assertEquals("Zu viele Personen", result7);

    }

    @Test
    @DisplayName("invalidCustomersRedSwitch")
    public void invalidCustomerSizeRedSwitch(){

        // Given
        int case8 = 29;

        // When
        String result8 = LadenAlarm.howMuchCustomersSwitch("red", case8);

        // Then
        Assertions.assertEquals("Zu viele Personen", result8);

    }




}
