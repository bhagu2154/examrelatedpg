package examrealatedProgram;

public class primenumber {
    public static void main(String[] args) {
        int num=14;
        boolean isPrime=true;
        for (int i = 2; i <=num/2 ; i++) {
        if (num%i==0){
            isPrime=false;
            break;
        }}
            System.out.println((isPrime)?"prime" :"not a prime");
    }
}
