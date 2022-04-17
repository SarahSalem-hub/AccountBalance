import org.jetbrains.annotations.Contract;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ArithmeticTest {

    private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmetic arithmetic;

    public ArithmeticTest(int firstNumber, int secondNumber, int expectedResult) {
        super();
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        arithmetic = new Arithmetic();
    }

    @Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {1,2,3},{11,11,22},{1,1,2}
        });
    }

    @Test
    public void arithmeticTestUsingParameterized() {
        System.out.println("sum of numbers : "+expectedResult);
        assertEquals(expectedResult,arithmetic.sum(firstNumber,secondNumber));
    }
}