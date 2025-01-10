import java.util.Scanner;
import java.util.Random;

public class StonePaperScissor 
{
    static int winU=0;
    static int winC=0,numberOfGames=0;
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("------------------------------------Stone_Paper_Scissor--------------------------------------");
        System.out.println("                                        Instructions                                            \n");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("Enter \'Stone\' for inputing stone. ");
        System.out.println("Enter \'Scissor \' for inputing stone. ");
        System.out.println("Enter \'Paper\' for inputing stone. ");
        System.out.println("Enter \'Scoreboard\' to get scoreboard ");
        System.out.println("Enter \'end\'  to end program");
        System.out.println("\n----------------------------------------------------------------------------\n");

        
        Input();
        
    }
    public static void Input(){
        
        Scanner sc = new Scanner(System.in);
        numberOfGames++;
        System.out.print("Enter your move below : ");
        String input =  sc.nextLine();
        
        Random rand = new Random();
        int random = rand.nextInt(3)+1;
        
        //Computer move : 
        
        if(!input.equalsIgnoreCase("end"))
        {
            if(random == 1)
            {
                System.out.println("Computer Move = Stone!");
            
            }
            else if (random == 2 )
            {
                System.out.println("Computer Move = Scissor!");
            }
            else if (random == 3)
            {
                System.out.println("Computer Move = Paper!");
                
            }
        }
        else
        {
            end();
        }
        //Computer move :  end
        
        
        
        //Stone move : start
         
        if (input.equalsIgnoreCase("stone") && random == 2)
        {
            winU++;
            System.out.println("Player wins !");
            
        }
        else if (input.equalsIgnoreCase("stone") && random == 3)
        {
            winC++;
            System.out.println("Computer wins ! ");

        }
        else if (input.equalsIgnoreCase("stone") && random == 1)
        {
            
            System.out.println("Draw ");
            
        }
        
        //Scissor move : 
        
        else if (input.equalsIgnoreCase("scissor") && random == 2)
        {
            
            System.out.println(" Draw ");
            
        }
        else if (input.equalsIgnoreCase("scissor") && random == 1)
        {
            winC++;
            System.out.println("Computer wins! ");
            
        }
        else if (input.equalsIgnoreCase("scissor") && random == 3)
        {
            winU++;
            System.out.println("Player wins!");
            
        }
        
        //Paper
        
        else if (input.equalsIgnoreCase("paper") && random == 3)
        {
            
            System.out.println(" Draw! ");
            
        }
        else if (input.equalsIgnoreCase("paper") && random == 1)
        {
            winU++;
            System.out.println("Player wins! ");
            
        }
        else if (input.equalsIgnoreCase("paper") && random == 2)
        {
            winC++;
            System.out.println("Computer wins! ");
            
        }
        else if(input.equalsIgnoreCase("scoreboard"))
        {
            scoreboard();
        }
        else if(input.equalsIgnoreCase("end"))
        {
            end();
        }
        else
        {
            System.out.println("Wrong input!");
            end();
        }
        
        
        again();
    }
    public static void scoreboard()
    {
        System.out.println("\n----------------------------------Scoreboard----------------------------------\n");
        System.out.println("Player's score = "+ winU);
        System.out.println("Computer's score = "+winC);
        System.out.println("Number of games played = "+ numberOfGames);
        System.out.println("\n-------------------------------------------------------------------------------\n");

        again();
        
    }
    public static void again()
    {
        Input();
        
    }
    public static void end ()
    {
        System.out.println("\n------------------------------------Result------------------------------------\n");
        System.out.println("Player's score = "+ winU);
        System.out.println("Computer's score = "+winC);
        System.out.println("Number of games played = "+ numberOfGames);
        System.out.println();
        if(winU>winC)
        {
            System.out.println("You Won !!!");
        }
        else if(winU==winC)
        {
            System.out.println("It is a draw.");
            
        }
        else
        {
            System.out.println("You lost :( ");
        }
        System.out.println("------------------------------------_The_End_------------------------------------");
        System.exit(0);
    }
}