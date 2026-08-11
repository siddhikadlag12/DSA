import java.util.Scanner;
class inputOutput {
    public static void main(String[] args){
         Scanner s= new Scanner(System.in);
        //for number
         int n=s.nextInt();
         System.out.println(n);
        //for string
         String st=s.next();
         System.out.println(st);
         s.close();

    }
}