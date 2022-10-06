import java.util.Random;
import java.util.*;

public class DogGenetics {

    static int a ;
    static int b ;
    static int c ;
    static int d ;
    static int e ;
    static int n = 1 ;
    

    public static void main(String [] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("What is your dog's name?");
            String dogName = myScanner.nextLine();
            System.out.println("Well then, I have this highly reliable report on "+ dogName +"'s prestigious background right here." );
            System.out.println(dogName+" is:");
            generateDNA();

            System.out.println("Wow, that's QUITE the dog! ");
    }

    public static void generateDNA(){
    String dogTypeA =  "Golden Retriever";
    String dogTypeB =  "Labrador Retriever";
    String dogTypeC =  "French Bulldog";
    String dogTypeD =  "Beagle";
    String dogTypeE =  "German Shepherd Dog";

    ArrayList<String> dogBreed = new ArrayList<String>(Arrays.asList(dogTypeA, dogTypeB ,dogTypeC, dogTypeD, dogTypeE));
    //System.out.println(dogBreed);

   
    Random rand = new Random();
     a = rand.nextInt(100) + 1;
        n =  100 - a;
     b = rand.nextInt(n);
        n =  100 - a - b;
     c = rand.nextInt(n) ;
        n =  100- a -b - c;
     d = rand.nextInt(n);
        n =  100- a -b -c- d;
     e = n;
    
     ArrayList<Integer> dogBreedPercentage = new ArrayList<Integer>(Arrays.asList(a,b,c,d,e));
     //System.out.println(dogBreedPercentage);
    
    /*System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);*/

    for(int i =0; i < 5 ; i++){
        System.out.println(dogBreedPercentage.get(i)+ "%: "+ dogBreed.get(i));

    }
   

        

    }
  }   











