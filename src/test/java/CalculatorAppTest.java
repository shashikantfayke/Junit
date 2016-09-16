import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorAppTest {

    CalculatorApp calculatorApp;

    @Before
    public void setUP(){
        calculatorApp=new CalculatorApp();
    }

    @Test
    public void should_add_positive_Numbers(){
        assertEquals(new Double(30.0),calculatorApp.add(10.0,20.0));
    }
}