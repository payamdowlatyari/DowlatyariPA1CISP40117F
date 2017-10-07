

package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Subtraction {
    int userAnswer=0;
    int firstInt;
    int secondInt;
    int correctAnswer;
    int tmpArraySub[] = new int[5];
    private boolean bool;
    
    public int[] quiz (){
        
            createQuestion();
            checkResponse();        
         return tmpArraySub; 
    }
    
    public void createQuestion (){
                 
    Random generator = new Random();
    
        firstInt  = generator.nextInt(19)+1;
        secondInt  = generator.nextInt(19)+1;
        correctAnswer= firstInt-secondInt;
        
        System.out.printf("%d Minus %d (-1 to exit): \n",firstInt,secondInt);
        Scanner input = new Scanner (System.in);
            userAnswer =input.nextInt();
        
            tmpArraySub[0]= firstInt;
            tmpArraySub[1]= secondInt;
            tmpArraySub[2]= correctAnswer;
            tmpArraySub[3]= userAnswer;
            tmpArraySub[4]= 1;
            
    }
    
    public String createResponse (boolean bool){
        String comment=" -------- Please come back later! --------\n";
        
        if (bool&&userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment="Good job! S\n";
                        break;
                    case 1:
                        comment="Nice work! S\n";
                        break;
                    case 2:
                        comment="Excellent! S\n";
                        break;
                    default:
                        comment="Correct answer! S\n";
                        break;

                }
                
        }else if(userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment = "Try again! S\n";
                        break;
                    case 1:
                        comment = "Keep trying! S\n";
                        break;
                    case 2:
                        comment = "Sorry! S\n";
                        break;
                    default:
                        comment="Wrong answer! S\n";
                        break;
                }
        }       
    return comment;   
    }
    
    public void checkResponse (){
        
        bool=true;
         
            if (userAnswer!=firstInt-secondInt ){
            bool=false;
            }
         
        System.out.print(createResponse(bool));
               
    }
    

    
}

