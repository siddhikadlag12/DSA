//                     ***LeetCode Problem: Two Sum II - Input Array Is Sorted*** 

import java.util.Scanner;
import java.util.Arrays;
public class twosum2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); //size of array
        int[] numbers=new int[n]; 
        for(int k=0;k<n;k++){    //enter elements
            numbers[k]=sc.nextInt();
        }
        Arrays.sort(numbers);
        
        int i=0;
        int j=numbers.length-1;
        int target=sc.nextInt();
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                int[] result={i+1,j+1};
                System.out.println("["+result[0]+","+result[1]+"]");
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        sc.close();
    }
}

/*Output:
$javac twosum2.java
$ java twosum2
4
2 7 11 15
9
->[1,2] */