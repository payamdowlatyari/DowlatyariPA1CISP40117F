

package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Multiply3 {
    int userAnswer=0;
    int counter=0;
    int counterCorrect=0;
    int counterIncorrect=0;
    int firstInt;
    int secondInt;
    int correctAnswer;
    int multiplyArray[][]= new int[5][100];
    private boolean bool;
    
    public void quiz (){
        while (userAnswer != -1) {
            createQuestion();
            checkResponse();        
        }  
    }
    
    public void createQuestion (){
                 
    Random generator = new Random();
    
        firstInt  = generator.nextInt(9)+1;
        secondInt  = generator.nextInt(9)+1;
        correctAnswer= firstInt*secondInt;
        
        System.out.printf("%d times %d (-1 to exit): \n",firstInt,secondInt);
        Scanner input = new Scanner (System.in);
            userAnswer =input.nextInt();
        
            multiplyArray[0][counter]= firstInt;
            multiplyArray[1][counter]= secondInt;
            multiplyArray[2][counter]= correctAnswer;
            multiplyArray[3][counter]= userAnswer;
            counter++;
    }
    
    public String createResponse (boolean bool){
        String comment=" -------- Please come back later! --------\n";
        
        if (bool&&userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment="Good job! \n";
                        break;
                    case 1:
                        comment="Nice work! \n";
                        break;
                    case 2:
                        comment="Excellent! \n";
                        break;
                    default:
                        break;

                }counterCorrect++;
                
        }else if(userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment = "Try again! \n";
                        break;
                    case 1:
                        comment = "Keep trying! \n";
                        break;
                    case 2:
                        comment = "Sorry! \n";
                        break;
                    default:
                        break;
                }counterIncorrect++;   
        }       
    return comment;   
    }
    
    public void checkResponse (){
        
        bool=true;
         
            if (userAnswer!=firstInt*secondInt ){
            bool=false;
            }
         
        System.out.print(createResponse(bool));
         
    }
    
    public void printQuestionResult(){
        
        for (int j=0; j<counter-1 ; j++ ){
            System.out.print(multiplyArray[0][j]);
            System.out.print(" * ");
            System.out.print(multiplyArray[1][j]);
            System.out.print(" = ");
            System.out.print(multiplyArray[2][j]);
            if (multiplyArray[2][j]!=multiplyArray[3][j]){
              System.out.print(" Your answer was: ");
              System.out.println(multiplyArray[3][j]);
            }else {
              System.out.print(" Correct! \n");
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

