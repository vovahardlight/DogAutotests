import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    Dog dog =new Dog("dog",5,9,5,10,"street","brown",10,
            400,20,100,200,200);
    @Test
    public void addition() {

        String actual = dog.addition(400);
        String expected = "Eat per two days "+800+"gm";
        assertEquals(expected,actual);
    }

    @Test
    public void subtraction() {
        String actual = dog.subtraction(9,5);
        String expected = "Difference at weight gain per year is " +4+ "kg";
        assertEquals(expected,actual);
    }

    @Test
    public void multiplication() {
        String actual = dog.multiplication(9,5);
        String expected = "Approximate weight after two years the dog is " +17+ "kg";
assertEquals(expected,actual);
    }

    @Test
    public void division() {
        String actual = dog.division(10,5);
        String expected = "The dog grows " +2+ "cm per year";
        assertEquals(expected,actual);
    }

    @Test
    public void testAddition() {
        String actual = dog.addition(100,200,200);
        String expected = "Ate all the food " +500+ "gm";
        assertEquals(actual,expected);
    }

    @Test
    public void testSubtraction() {
String actual= dog.subtraction(400,100,200);
        String expected = "Ate carbohydrates per day " +100+
                "gm";
        assertEquals(actual,expected);
    }

    @Test
    public void testMultiplication() {
        String actual = dog.multiplication(20,100,200);
                String expected = "Ate all proteins per month " +6000+ "gm";
                assertEquals(actual,expected);

    }
    
    @Test
    public void testDivision() {
        String actual = dog.division(100,20,9,5);
        String expected = "Need to ate per year protein to gain a kg of weight " +24000+ "gm";
        assertEquals(actual,expected);

    }

    @Test
    public void sayGaf() {
        assertEquals("ggg","ggg");
    }

    @Test
    public void testSayGaf() {
assertEquals("gaaaaaf","gaaaaaf");
    }
}