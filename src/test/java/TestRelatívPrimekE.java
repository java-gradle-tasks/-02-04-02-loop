import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRelatívPrimekE {

   @Test
   public void testEgyEgy() {
      int a= 1;
      int b= 1;
      boolean expected=true;
       boolean actual = MySolution.relativPrimekE(a,b);
      Assertions.assertEquals(expected,actual,a+" "+b+"  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }

   @Test
   public void testHaromOt() {
      int a= 3;
      int b= 5;
      boolean expected=true;
       boolean actual = MySolution.relativPrimekE(a,b);
      Assertions.assertEquals(expected,actual,a+" "+b+"  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }

   @Test
   public void test16_24() {
      int a= 16;
      int b= 24;
     boolean expected=false;
       boolean actual = MySolution.relativPrimekE(a,b);
      Assertions.assertEquals(expected,actual,a+" "+b+"  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }

   @Test
   public void test144_120() {
      int a = 144;
      int b = 120;
      boolean expected = false;
      boolean actual = MySolution.relativPrimekE(a, b);
      Assertions.assertEquals(expected, actual, a + " " + b + "  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }

   @Test
   public void test687_751() {
      int a = 687;
      int b = 751;
      boolean expected = true;
      boolean actual = MySolution.relativPrimekE(a, b);
      Assertions.assertEquals(expected, actual, a + " " + b + "  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }
   @Test
   public void test999_666() {
      int a = 999;
      int b = 666;
      boolean expected = false;
      boolean actual = MySolution.relativPrimekE(a, b);
      Assertions.assertEquals(expected, actual, a + " " + b + "  szamok eseten rosszul hatarozta meg, hogy relatiív primek-e!");
   }


}
