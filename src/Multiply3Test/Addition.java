

package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Addition {
    int userAnswer=0;
    int firstInt;
    int secondInt;
    int correctAnswer;
    int tmpArrayAdd[] = new int[5];
    private boolean bool;
    
    public int[] quiz (){
        
            createQuestion();
            checkResponse();        
         return tmpArrayAdd; 
    }
    
    public void createQuestion (){
                 
    Random generator = new Random();
    
        firstInt  = generator.nextInt(19)+1;
        secondInt  = generator.nextInt(19)+1;
        correctAnswer= firstInt+secondInt;
        
        System.out.printf("%d Plus %d (-1 to exit): \n",firstInt,secondInt);
        Scanner input = new Scanner (System.in);
            userAnswer =input.nextInt();
        
            tmpArrayAdd[0]= firstInt;
            tmpArrayAdd[1]= secondInt;
            tmpArrayAdd[2]= correctAnswer;
            tmpArrayAdd[3]= userAnswer;
            tmpArrayAdd[4]= 0;
            
    }
    
    public String createResponse (boolean bool){
        String comment=" -------- Please come back later! --------\n";
        
        if (bool&&userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment="Good job! A\n";
                        break;
                    case 1:
                        comment="Nice work! A\n";
                        break;
                    case 2:
                        comment="Excellent! A\n";
                        break;
                    default:
                        comment="Correct answer! A\n";
                        break;

                }
                
        }else if(userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment = "Try again! A\n";
                        break;
                    case 1:
                        comment = "Keep trying! A\n";
                        break;
                    case 2:
                        comment = "Sorry! A\n";
                        break;
                    default:
                        comment="Wrong answer! A\n";
                        break;
                }
        }       
    return comment;   
    }
    
    public void checkResponse (){
        
        bool=true;
         
            if (userAnswer!=firstInt+secondInt ){
            bool=false;
            }
         
        System.out.print(createResponse(bool));
               
    }
    

    
}

