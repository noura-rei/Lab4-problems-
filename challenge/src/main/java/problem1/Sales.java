package problem1;
import java.util.Scanner;
public class Sales {
    public static void main(String[] args)
    {
        //final int SALESPEOPLE = 5;

        int sum;
        Scanner scan = new Scanner(System.in);
        // Read the number of sales person
        System.out.println("Enter the number of size people:");
        int size = scan.nextInt();
        int[] sales = new int[size];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        // Finding maximum and minimum sales
        int maxSale = sales[0] ;
        int minSale = sales[0] ;
        int maxId = 0;
        int minId = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(maxSale<sales[i]) {
                maxSale = sales[i] ;
                maxId = i;
            }
            if(minSale>sales[i]) {
                minSale = sales[i] ;
                minId = i;
            }

        }
        // computing the average :
        double avg = (double) sum /sales.length ;
        System.out.println("\nTotal sales: " + sum+"$");
        System.out.print("\nThe average of sales is :"+avg);
        // Printing Maximum sale :
        System.out.print("\nSalesperson "+maxId+" has the highest sale with "+maxSale+"$");
        // Printing Minimum sale :
        System.out.print("\nSalesperson "+minId+" has the lowest sale with "+minSale+"$");
        // Printing people that exceed a certain threshold
        System.out.println("\nEnter a value :");
        int value = scan.nextInt();
        System.out.println("\nThe salesperson who exceeded "+value+" are:");
        int total = 0;
        for (int i=0; i<sales.length; i++){
            if(sales[i]>=value){
                total+=sales[i];
                System.out.println("The salesperson with id "+(i+1)+" and sale:"+sales[i]+"$");
            }
        }
        System.out.println("The total sale is :"+total+"$");


    }
}