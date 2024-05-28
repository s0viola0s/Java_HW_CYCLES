package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void testCalculateVacation(int income, int expenses, int threshold, int expectedMonth) {
        VacationService service = new VacationService();

        int actualMonth = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
