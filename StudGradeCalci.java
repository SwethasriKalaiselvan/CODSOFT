import java.io.*;
import java.util.Scanner;
public class StudGradeCalci{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    //integer array for storing marks
    int[] mark=new int[6];
    System.out.println("\n\t\tSTUDENT GRADE CALCULATOR");
    
    //user input marks using for loop
    System.out.println("\n\t Enter the marks of each subject\n");
    for(int i=0;i<6;i++){
        System.out.print(" Subject "+(i+1)+" : ");
        mark[i]=sc.nextInt();
    }
    
    //total of marks
    int sum=0;
    for(int i=0;i<6;i++){
        sum=sum+mark[i];
    }
    System.out.println("\n TOTAL MARKS : "+sum);
    
    //average percentage of marks
    int avg=sum/6;
    System.out.println("\n AVERAGE PERCENTAGE : "+avg+"%");
    
    //grade calculation
    if(avg>=90){
        System.out.println("\n\t\tEXCELLENT!! GRADE A");
    }
    else if(90<avg && avg>=70){
        System.out.println("\n\t\tVERY GOOD!! GRADE B");
    }
    else if(70<avg && avg>=50){
        System.out.println("\n\t\tGOOD!! GRADE C");
    }
    else{
        System.out.println("\n\t\tGRADE D");
    }
}
}