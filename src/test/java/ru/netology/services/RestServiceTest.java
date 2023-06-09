package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void shouldCalcMonthRestVar1() {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calcRest(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthRestVar2() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calcRest(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
