

import java.util.Scanner;

public class Level5 {

	private static double l5m1,l5m2,l5m3,l5m4,l5m5,l5m6;
   
    public static void Level5(){
        
        float ict1,ict2,ict3,average;
        int credit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Level 05 \n");
        
        double[] marks= new double[6]; 
        for(int i = 0 ;i<6;i++){
        
            System.out.println("Module 0" + (i+1));
            System.out.println("----------------");
            
            System.out.print("ICT 1 : ");
            ict1 = sc.nextFloat();
            System.out.print("ICT 2 : ");
            ict2 = sc.nextFloat();
            System.out.print("ICT 3 : ");
            ict3 = sc.nextFloat();
            
            if(ict1<=100 && ict1>0 && ict2<=100 && ict2>0 && ict3 <= 100 && ict3>0){
            
            	average = (ict1+ict2+ict3)/3;
            marks[i] = average;
            
            l5m1= marks[0];
            l5m2= marks[1];
            l5m3= marks[2];
            l5m4= marks[3];
            l5m5= marks[4];
            l5m6= marks[5];
            GetMarks.setL5m1(l5m1);
            GetMarks.setL5m2(l5m2);
            GetMarks.setL5m3(l5m3);
            GetMarks.setL5m4(l5m4);
            GetMarks.setL5m5(l5m5);
            GetMarks.setL5m6(l5m6);
            
            
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
        System.out.println("Total Credits =" + (credit+  GetMarks.getL4c()));
        	if(credit==120){
        		String c;
        		System.out.print("Do you want to exit with DipHe?");
        		c = sc.next();
        		if(c.length()==1 && c.charAt(0)=='y'){
        		
        			 System.out.println("OK.. You can exit with DipHe!!");
        			 Student.Menu();	
        	         
        		}else if(c.length()==1 && c.charAt(0)=='n'){
        			GetMarks.setL5c(credit);
        			System.out.print("You can move to the level 6 \n");
        			Level6.Level6();
        		}
        	}	
        	
        	if (credit<100){
        		System.out.print("Resit");
        	}else if(credit!=120){
        		GetMarks.setL5c(credit);
        		System.out.println("Move to level 06/n");
	         	
   	         Level6.Level6();
   	        
        	}
            
       
        
    }
    
    }

