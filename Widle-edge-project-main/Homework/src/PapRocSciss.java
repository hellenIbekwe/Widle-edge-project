import java.util.*;


public class PapRocSciss{
    static String initMsg;
    static String inputMsg;
    int number; 
    static int tie = 0;
    static int userW = 0;
    static int PCW = 0;
    static String greeting;
    static String name;
    
    
  
   
    public static void helloUser(){
    //Welcome to the game
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter Name: ");
    name = myScanner.nextLine();
    System.out.println("Welcome to the game "+ name+".Let's start!");

    }
    
    /*public static void errorOccured() {
    System.out.println("ERROR OCCURED!.\nPlease, Follow the instruction below.");
        runGame();
    }*/

    
    
    public static void runGame() {
         // declare and initialize the Scanner
         Scanner myScanner = new Scanner(System.in);

        // get input from the user round 
        System.out.println("Enter number of rounds to that you like to play, anything between 1 and 10: ");
        initMsg = myScanner.nextLine();
        int number = Integer.parseInt(initMsg); // check if number bwtween 1 - 10
        if (number >= 1 && number <= 10) {
            System.out.println("You choose: "+ number + " round.");
        } else {
            System.out.println("ERROR OCCURED!.The program is shutting down.");
            System.exit(0);
        }


        int i = 1;
        while (i <= number){


         // get input from the user
        System.out.println("Enter your choice from(1,2 or 3):\n Rock: 1\n Paper: 2\n Scissors: 3");
        inputMsg = myScanner.nextLine();
        String [] acceptedin = new String[] {"1", "2", "3"};
        List<String> acceptedin_list = Arrays.asList(acceptedin);
        while(inputMsg.length() != 1 || acceptedin_list.contains(inputMsg)==false ){

            System.out.println("Select a valid method: ");

            inputMsg = myScanner.nextLine();
        } int initMsCov = Integer.parseInt(inputMsg); //convert value for comparison
        System.out.println("You choose: "+ initMsCov );



        //get computer value 
        Random random = new Random();
        int inputPC = 1;
        while (true){
            inputPC = random.nextInt(4);
            if(inputPC !=0) break;
        }
        System.out.println("Computer choose: " + inputPC);

        if (initMsCov == inputPC) {
            System.out.println("Both players selected same. It's a tie!");
            tie +=1;
        } else if (initMsCov == 1) {
            if (inputPC == 3){
                System.out.println("Rock smashes scissors! You win!");
                userW += 1;
                
            } else {
            System.out.println("Paper covers rock! You lose.");
            PCW +=1; 
            
        }   
        } else if (initMsCov == 2) {
            if (inputPC == 1) {
                System.out.println("Paper covers rock! You win!");
                userW += 1;
                
            } else {
                System.out.println("Scissors cuts paper! You lose.");
                PCW +=1; 
            }
        } else if (initMsCov == 3) {
            if (inputPC == 2){
                System.out.println("Scissors cuts paper! You win!");
                userW += 1;
                
            }else {
                System.out.println("Rock smashes scissors! You lose.");
                PCW +=1; 
            }
        } 
    //Results of game
        System.out.println("Total tie count: "+ tie);
        System.out.println("Total computer victory: "+PCW);
        System.out.println("Total user victory: "+userW);
        i++;
        continue; 

    }

    //Overall Results
    System.out.println("RESULTS ");

    if (PCW == userW ) {
    System.out.println("It is a tie!");
    //try agian round
    } else if (userW > PCW) {
    System.out.println("Congrats! You won this round!");
    } else {
    System.out.println("You lost this round.");
    }
    greetings();
   
        
    }
    
    public static void greetings(){
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Would you like to play again:\n y or n\n");
        greeting = theScanner.nextLine();
        if ((greeting.equals("y")) || (greeting.equals("Y")) ) {
            System.out.println("Lets start again");
            runGame();
        } else if ((greeting.equals("n")) || (greeting.equals("N")) ) {
            System.out.println("Thanks for playing!See you next time.");
    
        } else {
            System.out.println("Option not valid! If you like to restart the game refresh the page. Thank you!");
        }
    
    }
    
    
    
    public static void main(String []args){
        helloUser();
        runGame();



    

    }
}

    




    