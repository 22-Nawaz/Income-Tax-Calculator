
//Income Tax Calculator

//Income < 3 lakhs -----> No Income Tax
//Income - 3 lakhs - 7 lakhs ----> 5% Income Tax
//Income - 7 lakhs - 10 lakhs ----> 10% Income Tax
//Income - 10 lakhs - 12 lakhs ----> 15% Income Tax
//Income - 12 lakhs - 15 lakhs ----> 20% Income Tax
//Income > 15 lakhs ----> 30% Income Tax

import java.util.*;
public class IC {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Give Mention Your income --> ");
        double income = sc.nextDouble();
        double a = ( income*0.05 );
        double b = ( income*0.1 );
        double c = ( income*0.15);
        double d = ( income*0.2);
        double f = ( income*0.3);
        if ( income < 300000 ){
            System.out.println("No Income Tax");
        } else if (income > 300000 && income < 700000 ) {
            System.out.println("Income Tax ----> " + a);
        }
            else if (income > 700000 && income < 1000000 ) {
                System.out.println("Income Tax ----> " + b);
        }
            else if (income > 1000000 && income < 115200000 ) {
                System.out.println("Income Tax ---->" + c);
        }
            else if (income > 1200000 && income < 1500000 ) {
                System.out.println("Income Tax ---->" + d);
        }
            else {
                System.out.println("Income Tax ---->" + f);
            }
        
        }
    }
    
