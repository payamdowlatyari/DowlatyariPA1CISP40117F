

package Multiply3Test;

import java.util.Random;
import java.util.Scanner;

public class Division {
    int userAnswer=0;
    int firstInt;
    int secondInt;
    int correctAnswer;
    int tmpArrayDiv[] = new int[5];
    private boolean bool;
    
    public int[] quiz (){
        
            createQuestion();
            checkResponse();        
         return tmpArrayDiv; 
    }
    
    public void createQuestion (){
                 
    Random generator = new Random();
    
        firstInt  = generator.nextInt(19)+1;
        secondInt  = generator.nextInt(19)+1;
        correctAnswer= firstInt/secondInt;
        
        System.out.printf("%d Divide %d (-1 to exit): \n",firstInt,secondInt);
        Scanner input = new Scanner (System.in);
            userAnswer =input.nextInt();
        
            tmpArrayDiv[0]= firstInt;
            tmpArrayDiv[1]= secondInt;
            tmpArrayDiv[2]= correctAnswer;
            tmpArrayDiv[3]= userAnswer;
            tmpArrayDiv[4]= 3;
            
    }
    
    public String createResponse (boolean bool){
        String comment=" -------- Please come back later! --------\n";
        
        if (bool&&userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment="Good job! D\n";
                        break;
                    case 1:
                        comment="Nice work! D\n";
                        break;
                    case 2:
                        comment="Excellent! D\n";
                        break;
                    default:
                        comment="Correct answer! D\n";
                        break;

                }
                
        }else if(userAnswer!=-1){
            Random generator = new Random();
            int i = generator.nextInt(3);
                switch (i) {
                    case 0:
                        comment = "Try again! D\n";
                        break;
                    case 1:
                        comment = "Keep trying! D\n";
                        break;
                    case 2:
                        comment = "Sorry! D\n";
                        break;
                    default:
                        comment="Wrong answer! D\n";
                        break;
                }
        }       
    return comment;   
    }
    
    public void checkResponse (){
        
        bool=true;
         
            if (userAnswer!=firstInt/secondInt ){
            bool=false;
            }
         
        System.out.print(createResponse(bool));
               
    }
    

    
}

