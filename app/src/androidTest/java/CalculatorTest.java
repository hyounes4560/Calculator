import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception{

        calculator = new Calculator();
    }


    @Test
    public void setCalculator_addition_input3_input4_result7() {

        double input1 = 3;
        double input2 = 4;

        double result = calculator.addition(input1,input2);
        assertEquals(7, result, 0);

    }


    @Test
    public void setCalculator_subtraction_input6_input6_result0() {

        double input1 = 6;
        double input2 = 6;
        double result = calculator.subtraction(input1, input2);
        assertEquals(0, result, 0);

    }

    @Test
    public void setCalculator_multiplication_input2_input4_result8() {

        double input1 = 2;
        double input2 = 4;
        double result = calculator.multiplication(input1, input2);
        assertEquals(8, result, 0);
    }

    @Test
    public void setCalculator_division_input100_input5_result20() {

        double input1 = 100;
        double input2 = 5;
        double result = calculator.division(input1, input2);
        assertEquals(20,result,  0);
    }
}