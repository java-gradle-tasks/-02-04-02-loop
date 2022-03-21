import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestLegnagyobbOszto {

      @Test
      public void test_neg_1() {
         int a=-1;
         int expected=-1;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_1() {
         int a=1;
         int expected=-1;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_2() {
         int a=2;
         int expected=1;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_4() {
         int a=4;
         int expected=2;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_9() {
         int a=9;
         int expected=3;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_12() {
         int a=12;
         int expected=6;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_13() {
         int a=13;
         int expected=1;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_25() {
         int a=25;
         int expected=5;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_45() {
         int a=15;
         int expected=5;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }
      @Test
      public void test_99() {
         int a=99;
         int expected=33;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_100() {
         int a=100;
         int expected=50;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_1000() {
         int a=1000;
         int expected=500;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

      @Test
      public void test_9999() {
         int a=9999;
         int expected=3333;
         int actual = MySolution.legnagyobbOszto(a);
         Assertions.assertEquals(expected,actual,a+ " szamok eseten rosszul hatarozta meg legnagyobb osztot.");
      }

   }
