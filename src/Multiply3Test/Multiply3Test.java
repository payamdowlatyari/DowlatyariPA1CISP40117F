
package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Multiply3Test {
    static int counter = 0;
    static int mainAray[][]= new int[100][5];

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        
        do {            
        Random generator = new Random();
        int selectQiz = generator.nextInt(4);
            switch (selectQiz) {
                case 0: Addition addObject = new Addition();
                        Multiply3Test.mainAray[counter] = addObject.quiz();
                    break;
                case 1: Subtraction subObject = new Subtraction();
                        Multiply3Test.mainAray[counter] = subObject.quiz();
                    
                    break;
                case 2: Multiply multObject = new Multiply();
                        Multiply3Test.mainAray[counter] = multObject.quiz();
                    break;
                case 3: Division divObject = new Division();
                        Multiply3Test.mainAray[counter] = divObject.quiz();
                    break;
                default: 
                    break;    
            }
            counter++;
        } while (Multiply3Test.mainAray[counter-1][3] != -1);
        
        Multiply3Test.printQuestionResult();
    }
    
        public static void printQuestionResult(){
            int counterIncorrect = 0;
            int counterCorrect = 0;
            
           System.out.println("Here is the list of all questions:");
           for (int i=0; i<counter-1 ; i++ ){
            System.out.print(Multiply3Test.mainAray[i][0]);
            switch (Multiply3Test.mainAray[i][4]) {
                case 0: System.out.print(" + ");
                    break;
                case 1: System.out.print(" - ");
                    break;
                case 2: System.out.print(" * ");
                    break;
                case 3: System.out.print(" / ");
                    break;
                default: 
                    break;    
            }
            System.out.print(Multiply3Test.mainAray[i][1]);
            System.out.print(" = ");
            System.out.print(Multiply3Test.mainAray[i][2]);
            if (Multiply3Test.mainAray[i][2] != Multiply3Test.mainAray[i][3]){
              System.out.print(" Your answer was: ");
              System.out.println(Multiply3Test.mainAray[i][3]);
              counterIncorrect++;
            }else {
              System.out.print(" Correct! \n");
              counterCorrect++;
            }
           }
        
            System.out.print("Number of questions: ");
            System.out.println(counter-1);

            if (counterIncorrect>(counter-1)/3){
                  System.out.print("Number of incorrect answers: ");
                  System.out.println(counterIncorrect);
                  System.out.println("No, study more! ");

            }else{
                  System.out.print("Number of correct answers: ");
                  System.out.println(counterCorrect);
                  System.out.println("Awesome! ");
            }
       }       
}
