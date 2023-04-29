package examrealatedProgram;

public class palindromeNumber {
    public static void main(String[] args) {
        int  digit=407;int num;
      int sum=0;
      int r=0;
      boolean ispali=true;
      while (digit>0) {
          num = digit % 10;
          sum = (sum * 10) + r;
          digit = digit / 10;
          ispali=false;
      break;
      }
        System.out.println(ispali?"palindrome":"not palindrome");
    }
}
//******************************************************************************************************************************