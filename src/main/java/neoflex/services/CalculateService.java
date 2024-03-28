package neoflex.services;

import neoflex.exceptions.WrongParametersException;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface CalculateService {

    BigDecimal calculate(LocalDate begin, int countOfDays, double averageSalary) throws WrongParametersException;

}
