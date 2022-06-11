import java.util.Scanner;//imported java util scanner to scan key board

public class Ordersystem // class Ordersystem
 {
   
    public static Scanner input = new Scanner(System.in); //scanner for user entering inputs
    public static String again;//string of name again
    public static int choose; // variable with name choose and datatype int
    public static int quantity; // variable with name quantity and datatype int
    public static int x; // variable with name x and datatype int
    public static int y;// variable with name y and datatype int
    public static int z;// variable with name z and datatype int
    public static int a;// variable with name a and datatype int
    public static int b;// variable with name b and datatype int
    public static int c; // variable with name c and datatype int 
    public static int d;// variable with name d and datatype int
    public static int discount=0;// variable with name discount & value 0 and datatype int
    public static int total=0;// variable with name total & value 0 and datatype int
    
    
    public static void order(){
        System.out.println("hi sir, Whats your good Name??"); // ask name
        Scanner myObj = new Scanner(System.in);  // prompt user to get name
        String Name = myObj.nextLine();  //store name
        System.out.println("\nplease Enter your username");// ask username
        String userName = myObj.nextLine();  // Read username
        System.out.println("Your Username is: " + userName); //displays user name to give discount if same as the owner
        //Give discount to users whose name are same as owner
                if(userName.equals("Vishalji")) //condition for the discount
                  {
                       discount = 5;
                       System.out.println("Discount = £" + discount);
                    }
                 else if(userName.equals("vishalji"))
                 {
                        discount = 5;
                        System.out.println("Discount = £" + discount);
                    }
                 else if(userName.equals("VISHALJI"))
                {
                        discount = 5;
                        System.out.println("Discount = £" + discount);
                    }
                else{
                        discount = 0;
                    }
                    System.out.println("\nPlease Select the Pizza by selecting a number");  //name of the pizza
                    System.out.println("1.Margreeta_________________________________£5.00");
                    System.out.println("2.Yummy-tummy Double layer__________________£7.00");
                    choose = input.nextInt();
                     
                    System.out.println("\nPlease select size of pizza by selecting a number:"); // type of size
                    System.out.println("1.Small_____£2");
                    System.out.println("2.Medium____£3");
                    System.out.println("3.Large_____£5");
                    x = input.nextInt();
                   
                    
                    System.out.println("\nPlease choose crust Type by selecting a number:");//type of crust
                    System.out.println("1.Thin crust________£2");
                    System.out.println("2.Stuffed Crust_____£5");
                    y = input.nextInt();
                    
                        
                    System.out.println("\nPlease select topping by selecting number:"); //type of topping
                    System.out.println("1.Black olives, anchovies, capers______£2");
                    System.out.println("2.Mixed sliced mushrooms and garlic____£3");
                    z = input.nextInt();
                                 
                    System.out.println("Discount = £" + discount); // discount displayes if user name is same
        
          if(choose==1)//condition for choice of pizza
          {
              System.out.println("You chosed Margreeta."); //choice of pizza
              System.out.print("How many Margreeta? :"); //asking quntity
              quantity =input.nextInt();//stores quantity
              
                  if(x==1 && y==1 || y==2 && z==1 || z==2) //condition for the choice of size 
                    {   
                        int a=5;
                        int b=2;
                              if(y==1 && z==1) // condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                            
                     }
                    else if(x==2 && y==1 || y==2 && z==1 || z==2)//condition for the choice of size 
                    {
                        int a=5;
                        int b=3;
                              if(y==1 && z==1)// condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                              
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                      
                     }
                    else if(x==3 && y==1 || y==2 && z==1 || z==2)//condition for the choice of size 
                    {
                        int a=5;
                        int b=5;
                              if(y==1 && z==1)// condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                      
                    }
                    else//other condition in required input
                    {
                        System.out.println("invalid input!\nPlease input as per MENU to get Pizza.");
                    }
            
       
            System.out.println("do you want to buy again? Y or N");
            again = input.next();
            
              if(again.equalsIgnoreCase("Y"))
             {
               order();
              }
             else{
               System.out.println("Total price is " + total); //displays total pizza
             }  
             
                }
                else if(choose==2)//condition for choice of pizza
                {
                System.out.println("You choose Yummy-tummy Double layer.");//choice of pizza
                System.out.print("How many Yummy-tummy Double layer? :");//ask number of pizza
                quantity =input.nextInt();
                
                     if(x==1 && y==1 || y==2 && z==1 || z==2)//condition for the choice of size 
                     {
                        int a=7;
                        int b=2;
                              if(y==1 && z==1)// condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                                
                        }
                     else if(x==2 && y==1 || y==2 && z==1 || z==2)//condition for the choice of size 
                     {
                        int a=7;
                        int b=3;
                              if(y==1 && z==1)// condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                        }
                        else if(x==3 && y==1 || y==2 && z==1 || z==2)//condition for the choice of size 
                     {
                        int a=7;
                        int b=5;
                              if(y==1 && z==1)// condition for choice of crust & topping
                              {
                                  int c=2;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==1 && z==2)// condition for choice of crust & topping
                                {
                                  int c=2;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==1)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=2;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else if(y==2 && z==2)// condition for choice of crust & topping
                                 {
                                  int c=5;
                                  int d=3;
                                  total = ((total) + (((a+b+c+d)*(quantity)) -(discount))); //total amount the pizza
                                }
                                else 
                                {
                                    System.out.println("invalid input");
                                }
                        }
                        else
                    {
                        System.out.println("invalid input!\nPlease input as per MENU to get Pizza.");
                    }
            
       
                System.out.println("You want to buy again?Y or N");
                again = input.next();
                
                    if(again.equalsIgnoreCase("Y"))
                     {
                        order();//call the method you to create
                        }       
                        else
                     {
                        System.out.println("Total price is £" + total); //displays total amount of pizza
                        }
                
            }
                else//other condition in required input
                {
                   System.out.println("Please Choose 1, 2 or 3 ae required!");
                   order();
                }
    }
    public static void main(String[] args) 
      {
         order(); 
      }
}