

import java.util.Scanner;


public class Level4 {

    public static void Level4(){
        
        float ict1,ict2,ict3,average = 0;
        int credit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Level 04 \n");
        
        for(int i = 0 ;i<6;i++){ // to enter marks for six modules
        
            System.out.println("Module 0" + (i+1));
            System.out.println("----------------");
            
            System.out.print("ICT 1 : ");
            ict1 = sc.nextFloat();
            System.out.print("ICT 2 : ");
            ict2 = sc.nextFloat();
            System.out.print("ICT 3 : ");
            ict3 = sc.nextFloat();
            
            if(ict1<=100 && ict1>0 && ict2<=100 && ict2>0 && ict3 <= 100 && ict3>0){//to validate the marks
            
            	average = (ict1+ict2+ict3)/3;
            
            System.out.println("Overall :  " + average);
           
            if(average>30){
                System.out.println("Result : Pass \n");
                credit+=20;
              
              }else{
                System.out.println("Result : Fail \n"); 
            	
              }
            }else{
            	System.out.println("Invalid marks, Enter the marks again!\n");
            	i--;
            
            }	
           
           
        
        }
        System.out.println("Total Credits =" + credit);
       
        	if(credit==120){
        		String c;
        		while(true){
        		System.out.print("Do you want to exit with CertHe?");
        		c = sc.next();
        		if(c.length()==1 && c.charAt(0)=='y'){
        		
        			 System.out.println("OK.. You can exit with CertHe!!");
        	         Student.Menu();
        	         break;
        		}else if(c.length()==1 && c.charAt(0)=='n'){
        			GetMarks.setL4c(credit);
        			System.out.println("You can move to the level 5\n");
        			Level5.Level5();
        			break;
        		}
        		System.out.println("");
        		}	
        		
        	}	
        	
        	if (credit<100){
        		System.out.print("Resit");
        	}else if(credit!=120){
        		GetMarks.setL4c(credit);
        		System.out.println("Move to level 05\n");
	         	
   	         Level5.Level5();
   	        
        	}
        	
         
     		 
    }
    
}
