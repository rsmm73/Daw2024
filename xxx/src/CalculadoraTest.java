import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

    @Test
    public void testSuma() {
        System.out.println("suma");
        double a = 7.0;
        double b = 4.0;
        Calculadora instance = new Calculadora();
        double expResult = 12.0;
        double result = instance.suma(a, b);
        assertEquals (expResult, result, 0.0);
    
    }

}
