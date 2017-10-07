

package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Multiply {
    int userAnswer=0;
    int firstInt;
    int secondInt;
    int correctAnswer;
    int tmpArrayMult[] = new int[5];
    private boolean bool;
    
    public int[] quiz (){
        
            createQuestion();
            checkResponse();        
         return tmpArrayMult; 
    }
    
    public void createQuestion (){
                 
    Random generator = new Random();
    
        firstInt  = generator.nextInt(19)+1;
        secondInt  = generator.nextInt(19)+1;
        correctAnswer= firstInt*secondInt;
        
        System.out.printf("%d times %d (-1 to exit): \n",firstInt,secondInt);
        Scanner input = new Scanner (System.in);
            userAnswer =input.nextInt();
        
            tmpArrayMult[0]= firstInt;
            tmpArrayMult[1]= secondInt;
            tmpArrayMult[2]= correctAnswer;
            tmpArrayMult[3]= userAnswer;
            tmpArrayMult[4]= 2;
            
    }
    
    public String createResponse (boolean bool){
        String comment=" -------- Please come back later! --------\n";
        
        if (bool&&userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment="Good job! M\n";
                        break;
                    case 1:
                        comment="Nice work! M\n";
                        break;
                    case 2:
                        comment="Excellent! M\n";
                        break;
                    default:
                        comment="Correct answer! M\n";
                        break;

                }
                
        }else if(userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment = "Try again! M\n";
                        break;
                    case 1:
                        comment = "Keep trying! M\n";
                        break;
                    case 2:
                        comment = "Sorry! M\n";
                        break;
                    default:
                        comment="Wrong answer! M\n";
                        break;
                } 
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
    

    
}

