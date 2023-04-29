package examrealatedProgram;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        if (num%4==0){
            System.out.println("given number is leap year");
        }else {
            System.out.println("given number is not leap year");
        }

    }
}
