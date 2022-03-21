import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPrimszamE {

   @Test
   public void test_0() {
      int a=0;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_1() {
      int a=1;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_2() {
      int a=2;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_3() {
      int a=3;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_4() {
      int a=4;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_5() {
      int a=5;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_6() {
      int a=5;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_11() {
      int a=5;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_15() {
      int a=5;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_999() {
      int a=999;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_1187() {
      int a=1187;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_4483() {
      int a=999;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_9999() {
      int a=9999;
      boolean expected=false;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

   @Test
   public void test_6676013() {
      int a=6676013;
      boolean expected=true;
      boolean actual = MySolution.primszamE(a);
      Assertions.assertEquals(expected,actual,a+ " szam eseten rosszul hatarozta meg, hogy primszam-e!.");
   }

}
