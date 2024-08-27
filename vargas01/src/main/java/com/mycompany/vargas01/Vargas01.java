/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vargas01;
import java.util.Scanner;
/**
 *
 * @author CL3-PC28
 */
public class Vargas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int c1;
        System.out.println("**********  MENU  **********");
        System.out.println();
        System.out.println("[1] = Snacks");
        System.out.println("[2] = Drinks");
        System.out.println();
        System.out.print("Enter Your Choice: ");
        c1 = input.nextInt();
        if(c1==1)
        {
            System.out.println();
            System.out.println("Choose Your Snacks");
            System.out.println("[1] Piattos - 18");
            System.out.println("[2] Nova - 17");
            System.out.println();
            System.out.println("Enter Your Choice: ");
            int c2 = input.nextInt();
            
            if(c2==1)
            {
                System.out.println();
                System.out.println("Piattos is 18 pesos");
                System.out.println();
                
                int piattos, nova;
                
                piattos = 18;
                nova = 17;
                
                System.out.println("Would you like to order drinks?");
                System.out.println("[1] - Yes or [2] - No");
  
                System.out.println();
                System.out.println("Enter Your Choice: ");
                int c3 = input.nextInt();
                        
            if (c3==1)
            {
                System.out.println();
                System.out.println("Choose Your Drinks");
                System.out.println("[1] Water - 15");
                System.out.println("[1] Coke - 20");
                
                System.out.println();
                System.out.println("Enter Your Choice: ");
                int c4 = input.nextInt();
                
                int water, coke;
                
                water = 15;
                coke = 20;
                
            
            if(c4==1)
            {
                System.out.println("Water is 15 pesos");
                
                int total;
                total = piattos + water;
                System.out.println();
                System.out.println("The total of Your Order is " + total);
                System.out.println();
                System.out.println("Enter Your Cash: ");
                int cash = input.nextInt();
                
                while(cash<total)
                {
                     System.out.println("Please Enter Enough Cash");
                     System.out.println();
                     System.out.println("Enter Your Cash: ");
                     cash = input.nextInt();
                }
                
                if(cash>=total)
                {
                    int change;
                    change = cash - total;
                    System.out.println("Your Change is: " +change );
                }
            }
            
            
}
            
           
            
}
       else if(c2==2)
            {
                System.out.println("Nova is 17 pesos");
                int piattos, nova;
                
                piattos = 18;
                nova = 17;
                
                System.out.println("Would you like to order drinks?");
                System.out.println("[1] - Yes or [2] - No");
  
                System.out.println();
                System.out.println("Enter Your Choice: ");
                int c3 = input.nextInt();
                
            }  
    }
        //CHOOSING DRINKS
        if(c1==2)
        {
            System.out.println();
            System.out.println("Choose Your Drinks");
            System.out.println("[1] Water - 15");
            System.out.println("[2] Coke - 20");
            System.out.println();
            System.out.println("Enter Your Choice: ");
            int c2 = input.nextInt();
            
            if(c2==2)
            {
                System.out.println();
                System.out.println("Coke is 20 pesos");
                System.out.println();
                
                int water, coke;
                
                water = 15;
                coke = 20;
                
                System.out.println("Would you like to order snacks?");
                System.out.println("[1] - Yes or [2] - No");
  
                System.out.println();
                System.out.println("Enter Your Choice: ");
                int c3 = input.nextInt();
                        
            if (c3==1)
            {
                System.out.println();
                System.out.println("Choose Your Snacks");
                System.out.println("[1] Piattos - 18");
                System.out.println("[2] Nova - 17");
                
                System.out.println();
                System.out.println("Enter Your Choice: ");
                int c4 = input.nextInt();
                
                int piattos, nova;
                
                piattos = 18;
                nova = 17;
                
            
            if(c4==2)
            {
                System.out.println("Nova is 17 pesos");
                
                int total;
                total = nova + coke;
                System.out.println();
                System.out.println("The total of Your Order is " + total);
                System.out.println();
                System.out.println("Enter Your Cash: ");
                int cash = input.nextInt();
                
                while(cash<total)
                {
                     System.out.println("Please Enter Enough Cash");
                     System.out.println();
                     System.out.println("Enter Your Cash: ");
                     cash = input.nextInt();
                }
                
                if(cash>=total)
                {
                    int change;
                    change = cash - total;
                    System.out.println("Your Change is: " +change );
                }
            }
            
            
}
}
        
    }
        
        
    
}
    }
