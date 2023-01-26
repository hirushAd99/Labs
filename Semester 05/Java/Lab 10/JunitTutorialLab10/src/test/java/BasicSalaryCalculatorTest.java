
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicSalaryCalculatorTest {
    private  BasicSalaryCalculator basicSalaryCalculator;
    @BeforeEach
    void init()
    {
        basicSalaryCalculator = new BasicSalaryCalculator();
    }
    @DisplayName("Test BasicSalaryCalculator with Valid Salary")
    @Test
    void testBasicSalarywithValidSalary()
    {
        double basicSalary = 4000;
        basicSalaryCalculator.setBasicSalary(basicSalary);

        double expectedSocialInsurance = basicSalary*0.25;
        assertEquals(expectedSocialInsurance,basicSalaryCalculator.getSocialInsurance());

        double expectedAdditionalBonus = basicSalary*0.1;
        assertEquals(expectedAdditionalBonus,basicSalaryCalculator.getAdditionalBonus());

        double expectedGross = basicSalary+expectedSocialInsurance+expectedAdditionalBonus;
        assertEquals(expectedGross,basicSalaryCalculator.getGrossSalary());
    }

    @DisplayName("Test BasicSalaryCalculator with invalid Salary")
    @Test
    void testBasicSalarywithInvalidSalary()
    {
        double basicSalary = -1000;
        assertThrows(IllegalArgumentException.class,()->basicSalaryCalculator.setBasicSalary(basicSalary));
    }

    @AfterEach
    void tearDown()
    {
        basicSalaryCalculator = null;
    }


}