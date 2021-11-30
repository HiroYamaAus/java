/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**@author: Yasuhiro Yamaguchi
 *student ID:0221573
 * Date: 14/4/2021
 * File name: YeppoonCaravanPark.java
 * 
 * 
 */
import java.util.Scanner;//program uses class Scanner
//Class that represent a Yeppoonn caravan park booking system 
public class YeppoonCaravanPark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    
       
        
        String name;//declare booking name
        int numberNight;// diclare number of nights to stay
        int numberGuest;//diclare number of guests
        double charge;// diclare charge
        int maxNight=Integer.MIN_VALUE; //declare and initialize maximum number of night to maximum number of variable
        int minNight=Integer.MAX_VALUE;// declare and initialize minimum number of night to minimum number of variable
        double total=0; // declare and initialize sum of charge collected
        int customerCounter=0;//declare and initialize customer counter to 0
        double totalNight=0;//declare and initialize sum of number of nights to 0
        String minName=null; //declare and initialize name who stay minimum number of nights
        String maxName=null; //declare and initialize name who stay maximum number of nights
        double average=0;//declare and initialize average number of nights  to 0
      
        // TODO code applicaion logic here
        System.out.println("Welcome to the Yeppoon Caravan Park Managment System");
        
        System.out.println("");
        System.out.println("");
        
         for(int N=1; N<=3; N++){
        
              Scanner input =new Scanner(System.in);
              //create Scannaer  to obtain input from command window
       
        //prompt for input and read booking name
        System.out.print("Please enter booking name "+N+" ==> ");
        name=input.nextLine();
        //loop until user enters the name
        while(name.equals("")){
            
           //no booking name were enterd, so outout appropriate messeage
           System.out.println("ERROR booking name cannot be blank");  
           //prompt for input and read booking name
           System.out.print("Please enter booking name "+N+ " ==> ");
            
           name =input.nextLine(); 
           
        }
                  // end while loop     
        
       
        System.out.printf("Enter the number of nights stay for %s ==> ", name);
        //prompt for input and read number of night to stay
       
        numberNight=input.nextInt();
        //loop until user enters postiive number
        while(numberNight <=0){
          //loop until user enters the positive number of nights to stay 
          //negative number or 0 were enterd, so outout appropriate messeage
           System.out.println("ERROR number of nights must be greater than or equal to 1");  
           //prompt for input and read number of night to stay
           System.out.printf("Enter the number of nights stay for %s ==> ",name);
            
           numberNight =input.nextInt();
            
         }// end while loop  
        
           System.out.printf("Enter the number of guests for %s ==> ", name);
            //prompt for input and read number of guests to stay
            numberGuest=input.nextInt();
        //loop until user enters the number of guests
        while(numberGuest <=0){
           //loop until user enters the positive number of guests to stay 
            //negative number or 0 were enterd, so outout appropriate messeage
           System.out.println("ERROR number of guests must be greater than or equal to 1");  
        
           //prompt for input and read number of guests to stay
           System.out.print("Enter the number guests for %s ==> ", name);
            
           numberGuest =input.nextInt(); 
         }// end while loop  
        
        
        // determine the discout pricing
        if(numberNight<=5){
             charge=14.5*numberNight+4.95*numberNight*numberGuest;
        } else if(numberNight>5 && numberNight<10){
             charge=72.5+24.75+12.5*(numberNight-5)+3.95*numberGuest*(numberNight-5);
        }else{
             charge=135+24.75*numberGuest+19.75*numberGuest+10.5*(numberNight-10)+2.95*(numberNight-10)*numberGuest;
        }              
        
        // display result of booking per each customer       
        System.out.printf("The charge for %s for %d night(s) and %d guest(s) is %.2f%n",name,numberNight,numberGuest,charge);
        
        
        
        total=total+charge;//add charge to toatal charge
        totalNight=totalNight+numberNight;//add number of nights per booking to total
        customerCounter=customerCounter+1;// incremetn customer counter
        
     
        System.out.println("");//display line spacing
        System.out.println("");//display line spacing
         
         //determine minimum number of nights and customer name who stay minimum number of nights
        if(numberNight<=minNight){
             minNight=numberNight;
             minName=name;
        }    
        //determine maximum number of nights and customer name who stay maximum number of nights
        if(numberNight>=maxNight){
             maxNight=numberNight;
             maxName=name;
        }
         

       }//end of for loop   
    
      // display header message for statistical information
       System.out.println("Statistical informaiton for Yeppoon Caravan Park");  
      
       System.out.println("");//display line spacing
             
       System.out.printf("%s has minimum number of %d nights.%n",minName,minNight);// display minimum number of nights and customer name who stay minimum number of nights
       System.out.printf("%s has maximum number of %d nights.%n",maxName,maxNight);// display maximum number of nights and customer name who stay muximum number of nights
       
      
       System.out.printf("The average number of nights stay per booking is: %.2f%n", totalNight/customerCounter);// display average number of nights per booing
       System.out.printf("The total charges collected is %.2f%n", total);// display total charge corrected
       
       System.out.println("");//display line spacing
       System.out.println("");//display line spacing
       
       
       // display exit messeage and student number
         System.out.println("Thanks for using Yeppoon Caravan Park Management System");
           System.out.println("Program witten by 0221573");  
          
    }//end of main method
}//end of classs


     


          