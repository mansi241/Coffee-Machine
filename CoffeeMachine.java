package machine;
import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        String input = "";

        while(!input.equals("exit"))
        {
            System.out.println();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        input = s.next();
        input = input.trim();
        if(input.equals("take"))
        {
            System.out.println("I gave you $"+money);
            money = 0;

            
        }else if(input.equals("buy"))
        {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String ctype = s.next();
            String NotAvailable = "";
            if(ctype.equals("1"))
            {
                if(water >= 250)
                {
                    //water -= 250;
                }else
                {
                    NotAvailable = "water";
                } 
                
                if(beans >=16)
                {
                    //beans -=16;
                }else
                {
                    NotAvailable = "beans";
                } 
                
                if(NotAvailable.equals(""))
                {
                    money+=4;
                    cups -=1;
                    water -= 250;
                    beans -=16;
                    System.out.println("I have enough resources, making you a coffee!");

                }else
                {
                    System.out.println("Sorry, not enough "+NotAvailable+"!");
                }

            }else if(ctype.equals("2"))
            {
                if(water >= 350)
                {
                    //water -= 350;
                }else
                {
                    NotAvailable = "water";
                } 
                
                if(milk >=75)
                {
                    //milk -=75;
                }else
                {
                    NotAvailable = "milk";
                } 
                
                if(beans >=20)
                {
                    //beans -=20;
                }else
                {
                    NotAvailable = "beans";
                } 
                
                if(NotAvailable.equals(""))
                {
                    money+=7;
                    cups -=1;
                    water -= 350;
                    milk -=75;
                    beans -=20;
                    System.out.println("I have enough resources, making you a coffee!");

                }else
                {
                    System.out.println("Sorry, not enough "+NotAvailable+"!");
                }
                
            }else if(ctype.equals("3"))
            {
                if(water >= 200)
                {
                    //
                }else
                {
                    NotAvailable = "water";
                } 
                
                if(milk >= 100)
                {
                    
                }else
                {
                    NotAvailable = "milk";
                } 
                
                if(beans >= 12)
                {
                    
                }else
                {
                    NotAvailable = "beans";
                } 
                
                if(NotAvailable.equals(""))
                {
                    money+=6;
                    cups -=1;
                    water -= 200;
                    milk -=100;
                    beans -=12;
                    System.out.println("I have enough resources, making you a coffee!");

                }else
                {
                    System.out.println("Sorry, not enough "+NotAvailable+"!");
                }
            }else if(ctype.equals("back"))
            {
               
            }


            
        }else if(input.equals("fill"))
        {
            System.out.println("Write how many ml of water do you want to add: ");
            water += s.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int mget =  s.nextInt();   
            milk += mget;        
            System.out.println("Write how many grams of coffee beans do you want to add:");
            beans += s.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add: ");
            cups += s.nextInt();   
                     
            
        }else if(input.equals("remaining"))
        {
            System.out.println();
            System.out.println("The coffee machine has:");
            System.out.println(water+" of water");
            System.out.println(milk+" of milk");
            System.out.println(beans+" of coffee beans");
            System.out.println(cups+" of disposable cups");
            System.out.println("$"+money+" of money");
            System.out.println();
        }
        }
    }

}

