public class SummativeSum {


    public static int sum(int [] myArray) {
        int total = 0; // 
        int i; 
        for (i = 0; i < myArray.length; i++)
            total += myArray[i];
 
        return total;
    }
 
    // Driver method
    public static void main(String[] args){
        int [] arrOne = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int [] arrTwo = { 999, -60, -77, 14, 160, 301 };
        int [] arrThree = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130};
        int [] arrFour = {140, 150, 160, 170, 180, 190, 200, -99 } ;
      
        System.out.println("Array Sum:" + sum(arrOne));
        System.out.println("Array Sum:" + sum(arrTwo)); 
        System.out.println("Array Sum:" + sum(arrThree));
        System.out.println("Array Sum:" + sum(arrFour));    
    }
}




