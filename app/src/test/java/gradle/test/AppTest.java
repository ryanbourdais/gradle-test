/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test 
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    
    @Test
    public void shouldEqualFive()
    {
        float correctAnswer = 5;
        assertEquals(correctAnswer, Calculator.Addition(2,3), 0.000001);
    }

    @Test
    public void shouldEqualThree()
    {
        float correctAnswer = 3;
        assertEquals(correctAnswer, Calculator.Subtraction(5, 2), 0.000001);
    }

    @Test
    public void shouldEqualTwentyOne()
    {
        float correctAnswer = 21;
        assertEquals(correctAnswer, Calculator.Multiplication(7, 3), 0.000001);
    }

    @Test
    public void DivisionTest()
    {
        float correctAnswer = 0.41666f;
        assertEquals(correctAnswer, Calculator.Division(5, 12), 0.00001);
    }
}
