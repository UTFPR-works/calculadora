
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joao
 */
public class calculateTest {

    public calculateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //testes verdadeiros
    @Test
    public void testSoma() {
        System.out.println("Teste da soma");
        int expResult = 8;

        Calculator instance = new Calculator();
        instance.setA(4);
        instance.setB(4);
        instance.sum();

        long result = instance.getRes();
        assertEquals(expResult, result);

        expResult = 9;
        instance.setA(4);
        instance.setB(5);
        instance.sum();

        result = instance.getRes();
        assertEquals(expResult, result);
    }

    @Test
    public void testSubtrai() {
        System.out.println("Teste de subtração");
        int expResult = 5;

        Calculator instance = new Calculator();
        instance.setA(10);
        instance.setB(5);
        instance.sub();

        long result = instance.getRes();
        assertEquals(expResult, result);

        expResult = -5;
        instance.setA(10);
        instance.setB(15);
        instance.sub();

        result = instance.getRes();
        assertEquals(expResult, result);
    }

    @Test
    public void testMultiplica() {
        System.out.println("Teste de multiplicação");
        int expResult = 12;

        Calculator instance = new Calculator();
        instance.setA(3);
        instance.setB(4);
        instance.mult();

        long result = instance.getRes();
        assertEquals(expResult, result);

        expResult = 9;
        instance.setA(3);
        instance.setB(3);
        instance.mult();

        result = instance.getRes();
        assertEquals(expResult, result);
    }

    @Test
    public void testDivide() {
        System.out.println("Teste de divisão");
        int expResult = 3;

        Calculator instance = new Calculator();
        instance.setA(12);
        instance.setB(4);
        instance.divs();

        long result = instance.getRes();
        assertEquals(expResult, result);

        expResult = 2;
        instance.setA(20);
        instance.setB(10);
        instance.divs();

        result = instance.getRes();
        assertEquals(expResult, result);
    }

    //testes com resultados não esperados
    @Test
    public void testSoma2() {
        System.out.println("Teste de soma (resultado errado)");
        int expResult = 7;

        Calculator instance = new Calculator();
        instance.setA(7);
        instance.setB(3);
        instance.sum();

        long result = instance.getRes();
        assertNotEquals(expResult, result);

        expResult = 5;
        instance.setA(2);
        instance.setB(4);
        instance.sum();

        result = instance.getRes();
        assertNotEquals(expResult, result);
    }

    @Test
    public void testSubtrai2() {
        System.out.println("Teste de subtração (resultado errado)");
        int expResult = 7;

        Calculator instance = new Calculator();
        instance.setA(7);
        instance.setB(4);
        instance.sub();

        long result = instance.getRes();
        assertNotEquals(expResult, result);

        expResult = 3;
        instance.setA(7);
        instance.setB(8);
        instance.sub();

        result = instance.getRes();
        assertNotEquals(expResult, result);
    }

    @Test
    public void testMultiplica2() {
        System.out.println("Teste de multiplicação (resultado errado)");
        int expResult = 2;

        Calculator instance = new Calculator();
        instance.setA(4);
        instance.setB(6);
        instance.mult();

        long result = instance.getRes();
        assertNotEquals(expResult, result);

        expResult = 6;
        instance.setA(3);
        instance.setB(8);
        instance.mult();

        result = instance.getRes();
        assertNotEquals(expResult, result);
    }

    @Test
    public void testDivide2() {
        System.out.println("Teste de divisão (resultado errado)");
        int expResult = 3;

        Calculator instance = new Calculator();
        instance.setA(6);
        instance.setB(9);
        instance.divs();

        long result = instance.getRes();
        assertNotEquals(expResult, result);

        expResult = 6;
        instance.setA(10);
        instance.setB(2);
        instance.divs();

        result = instance.getRes();
        assertNotEquals(expResult, result);
    }
}
