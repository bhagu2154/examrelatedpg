package examrealatedProgram;

public class arrayCreation {
    public static void main(String[] args) {
        int [] array={10,20,30,40,50};
        for (int index = 0; index < array.length; index++) {
            if(array[index]%2==0){
            System.out.println(array[index]);
            //System.out.println(array[3]);
            //System.out.println(array.length);
        }
    }
}}
