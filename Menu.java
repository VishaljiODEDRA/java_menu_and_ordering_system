

 
import java.util.Random;  // imported util random for generating random number 
import java.util.Scanner;//imported util scanner to scan the keyboard

public class Menu { //created class called menu
    static int y = 0; //variable y with int datatype
    static double bill = 0; //variable bill with double datatype
    
    static int order='\0';//variable int
    double e;//variable double for service charges

    static String x = null; // varible x of string datatype  

   
    public static void main(String[] args) {
        Scanner sc = null;
        String[] z = new String[] { "A1", "A2", "A3" }; // string variable z having 3 values

        sc = new Scanner(System.in);
        System.out.println("please Enter Your Name: "); // asking for name
        x = sc.next(); // prompt user to get name

        System.out.println("can you please tell me Total No. of people in your group: "); // asking user for number of people in group assign table of based on number of people
        y = sc.nextInt(); //promp for number of people
        
        Random rand = new Random();
        int d = rand.nextInt(z.length);
        System.out.println( "Your section is: " + z[d]); //assigning section of tables

        Random r1 = new Random();
        int lower = 1;
        int upper = 25;
        int a = r1.nextInt(upper - lower) + lower; // generating random number from 1 to 25  to assign table to group people less than 2
        

        Random r2 = new Random();
        int lower1 = 26;
        int upper1 = 40;
        int b = r2.nextInt(upper1 - lower1) + lower1; // generating random number from 26 to 40  to assign table to group people less than 4
        

        Random r3 = new Random();
        int lower2 = 41;
        int upper2 = 50;
        int c = r3.nextInt(upper1 - lower1) + lower1;// generating random number from 41 to 50  to assign table to group people less than 6
        
        if (y <= 2) // if people less than or equal to 2 then 
        {
            System.out.println("please have sit on 2 sitter table, your table No:" + a);
        } else if (y <= 4)  // if people less than or equal to 4 then
        {
            System.out.println("please have sit on 4 sitter table, your table No:" + b);
        } else if (y <= 6) // if people less than 6 or equal to then
        {
            System.out.println("please have sit on 6 sitter table, your table No:" + c);
        } 
        else if(y == 0 || y>6)// if user answers 0 or grater than 6 then
        {
            System.out.println("This is not a valid input. \nPlease enter valid number from 1 to 6.");
        }
        else //remaining all conditions
        {
            System.out.println(" Invalid input!!!");
        }
        
        System.out.println("\n\n========================MENU======================="); //menu for user 
       
       System.out.println("\n                 1.paratha_________£1.99");
       System.out.println("                  2.Naan____________£1.39"); 
       System.out.println("\n                Vegetable:");
       System.out.println("                  4.Pau bhaji___________£1.79");
       System.out.println("                  5.Paneer masala_______£1.99");
       System.out.println("\n                Soft-drinks:");
       System.out.println("                  7.Lassi______________£0.99");
       System.out.println("                  8.Coca-cola__________£0.79");
       System.out.println("                  9.To get total bill including service charge");
       System.out.println("                  0.To Exit");

       //user can order item by enter number written in front of item
       // if user enters 9 then he will get bill with the service charges
       //if user enter 0 then he wil come out of restuarent and he will some message return in case 0 followed by while loop
       
       loop: do
        {
            System.out.println("\nEnter the letter of the item, that you want : "); //message to get number
            order = sc.nextInt(); //prompt user to get number
            
          switch (order) {
            case 1: 
                if(y<=2)  // if number of guest are less than or equal to 2 then
             {
                if(order == 1) // if the user enter first item then
                {   
                    double paratha = 1.99; // variable for the prize of paratha
                    System.out.println("Your Order for Paratha of £1.99 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paratha;
                    System.out.println("Your bill without tax: \n=" + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                       else { // if user inputs remaining all inputs then
                            System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 1)
                {   
                    double paratha = 1.99; // variable for the prize of paratha
                    System.out.println("Your Order for Paratha of £1.99 is placed for Table No: " + b);// user recieve sms for the item he ordered on that particular table number
                    bill = bill + paratha;
                    System.out.println("Your bill without tax: \n=" + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=6) // if number of guest are less than or equal to 6 then
             {
                if(order == 1)
                {   
                    double paratha = 1.99; // variable for the prize of paratha
                    System.out.println("Your Order for Paratha of £1.99 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paratha;
                    System.out.println("Your bill without tax: \n=" + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6) // if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;
             
            case 2:
                if(y<=2) // if number of guest are less than or equal to 2 then
             {
                if(order == 2)
                {   
                    double  naan = 1.39; // variable for the prize of naan
                    System.out.println("Your Order for Naan of £1.39 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + naan;
                    System.out.println("Your bill without tax:\n=" + bill);// user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                 else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 2)
                {   
                    double naan = 1.39; // variable for the prize of naan
                    System.out.println("Your Order for Naan of £1.39 is placed for Table No: " + b); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + naan;
                    System.out.println("Your bill without tax:\n=" + bill);// user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y<=6) // if number of guest are less than or equal to 6 then
             {
                if(order == 2)
                {   
                    double naan = 1.39; // variable for the prize of naan
                    System.out.println("Your Order for Naan of £1.39 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + naan;
                    System.out.println("Your bill without tax:\n=" + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                 else {
                     System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6)// if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;   
             
             case 4:
                if(y<=2) // if number of guest are less than or equal to 2 then
             {
                if(order == 4)
                {   
                    double paubhaji = 1.79; // variable for the prize of paubhaji
                    System.out.println("Your Order for Pau Bhaji of £1.79 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paubhaji;
                    System.out.println("Your bill without tax:\n="  + bill);// user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 4)
                {   
                    double paubhaji = 1.79; // variable for the prize of paubhaji
                    System.out.println("Your Order for Pau Bhaji of £1.79 is placed for Table No: " + b); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paubhaji;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=6) // if number of guest are less than or equal to 6 then
             {
                if(order == 4)
                {   
                    double paubhaji = 1.79; // variable for the prize of paubhaji
                    System.out.println("\nYour Order for Pau Bhaji of £1.79 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paubhaji ;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6)// if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;
             
             case 5:
                if(y<=2) // if number of guest are less than or equal to 2 then
             {
                if(order == 5)
                {   
                    double paneermasala = 1.99; // variable for the prize of paneermasala
                    System.out.println("Your Order for Paneer Masala of £1.99 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paneermasala;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 5)
                {   
                    double paneermasala = 1.99; // variable for the prize of paneermasala
                    System.out.println("Your Order for Paneer Masala of £1.99 is placed for Table No: " + b); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paneermasala;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=6) // if number of guest are less than or equal to 6 then
             {
                if(order == 5)
                {   
                    double paneermasala = 1.99; // variable for the prize of paneermasala
                    System.out.println("\nYour Order for Paneer Masala of £1.99 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + paneermasala;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6) // if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;
        
             case 7:
                if(y<=2) // if number of guest are less than or equal to 2 then
             {
                if(order == 7)
                {   
                    double lassi = 0.99; // variable for the prize of lassi
                    System.out.println("Your Order for Lassi of £0.99 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + lassi;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 7)
                {   
                    double lassi = 0.99; // variable for the prize of lassi
                    System.out.println("Your Order for Lassi of £0.99 is placed for Table No: " + b); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + lassi;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=6) // if number of guest are less than or equal to 6 then
             {
                if(order == 7)
                {   
                    double lassi = 0.99; // variable for the prize of lassi
                    System.out.println("\nYour Order for Lassi of £0.99 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + lassi;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6) // if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;
             
             
             case 8:
                if(y<=2)// if number of guest are less than or equal to 2 then
             {
                if(order == 8)
                {   
                    double cocacola = 0.79; // variable for the prize of coca cola
                    System.out.println("Your Order for Coca-Cola of £0.79 is placed for Table No: " + a); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + cocacola;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                  else {
                      System.out.println("invalid input");
                }
             }
              else if(y<=4) // if number of guest are less than or equal to 4 then
             {
                if(order == 8)
                {   
                    double cocacola = 0.79; // variable for the prize of coca cola
                    System.out.println("Your Order for Coca-Cola of £0.79 is placed for Table No: " + b); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + cocacola;
                    System.out.println("Your bill without tax:\n="  + bill);// user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y<=6)  // if number of guest are less than or equal to 6 then
             {
                if(order == 8)
                {   
                    double cocacola = 0.79; // variable for the prize of coca cola
                    System.out.println("\nYour Order for Coca-Cola of £0.79 is placed for Table No: " + c); // user recieve sms for the item he ordered on that particular table number
                    bill = bill + cocacola;
                    System.out.println("Your bill without tax:\n="  + bill); // user wil receive bill for items he ordered till the time excluding Tax & service charges
                }
                else {
                    System.out.println("invalid input");
                }
             }
              else if(y==0 || y>6) // if user enter number of guest 0 or more than 6 then
             {
                System.out.println("invalid input");
             }
             break;
             
             case 9: // if user enter this case then he will get...
                 System.out.println("Above bill is excluding tax & service charges."); // message for billing system
                 double e; // variable for service charges, already mentioned earlier
                 System.out.println("We charge extra '10 %' for Service charges."); // sms for Service charges
                 System.out.println("\nService Charges =  (10/100)*bill " ); // calculation of service charges
                 System.out.println("Service Charges =  (0.1)*bill " ); // step by step
                 System.out.println("Service Charges = (0.1)*"+ bill ); 
                 e=(0.1)*bill;
                 System.out.println("Service charges =£" + e); // total service charges
                 System.out.println("\nYour total bill including service charges = bill + service charges"); //actual bill including service charges
                 System.out.println("Your total bill including service charges = " + bill + " + " + e); ////step by step
                 bill = bill + e;
                 System.out.println("Your total bill including service charges = £" + bill); // total bill including service charges
                 break;
             
             case 0:  
                 break; //line breaks and jumps to while 
               
             default: // if user enters remaining other all cases then
             System.out.println("Invalid option!!! \n  ...Please Enter again...");
             
       }
       
     }
      while(order != 0); //user get out of the restaurent and get this message
      
      System.out.println("Thank You for using our services & reataurent.");
      System.out.println("...Sorry for any inconvenince...");
     }
      
   }
  


