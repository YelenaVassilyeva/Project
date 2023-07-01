import lesson8.Assignment7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static lesson8.Assignment7.getDay;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayTest {


    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceParamsTest(int dayNumber,String expectedResult) {
        String actualResult = Assignment7.getDay(dayNumber);

        assertEquals(expectedResult, actualResult);

    }

    static Stream <Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(1,"Sunday"),
                Arguments.of(2,"Monday"),
                Arguments.of(3,"Tuesday"),
                Arguments.of(4,"Wednesday"),
                Arguments.of(5,"Thursday"),
                Arguments.of(6,"Friday"),
                Arguments.of(7,"Saturday"));}
    @Test
    @DisplayName("Nullpointer error test")
    public void errorTest() {
        assertThrows(NullPointerException.class, () -> Assignment7.getDay(null));
    }

    @ParameterizedTest
    @ValueSource(ints ={-12,0,-5})
    public void negativeTest(int dayNumber) {
         String expectedResult="The number should be equal or larger than 1";
         assertEquals(expectedResult,Assignment7.getDay(dayNumber));
    }@ParameterizedTest
    @ValueSource(ints ={34,8,637644})
    public void negativeTest1(int dayNumber) {
         String expectedResult= "The number should be equal or smaller than 7";
         assertEquals(expectedResult,Assignment7.getDay(dayNumber));
    }

    }


