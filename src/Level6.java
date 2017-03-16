

import java.util.Scanner;

public class Level6 {
	
	private static double l6m1,l6m2,l6m3,l6m4,l6m5,l6m6;

    
    
	public static void Level6() {
  
        float ict1,ict2,ict3,average;
        int credit=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Level 06 \n");
        
        double[] marks2= new double[6];
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
            marks2[i] = average;
            
            l6m1= marks2[0];
            l6m2= marks2[1];
            l6m3= marks2[2];
            l6m4= marks2[3];
            l6m5= marks2[4];
            l6m6= marks2[5];
            GetMarks.setL6m1(l6m1);
            GetMarks.setL6m2(l6m2);
            GetMarks.setL6m3(l6m3);
            GetMarks.setL6m4(l6m4);
            GetMarks.setL6m5(l6m5);
            GetMarks.setL6m6(l6m6);
            
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
        System.out.println("Total Credits =" + (credit+ GetMarks.getL4c()+GetMarks.getL5c()));
        	
        	
        GetMarks.setL6c(credit);
        
        	if (credit<100){
        		System.out.print("Resit");
        	}else if(credit!=120){
        		GetMarks.setL6c(credit);
        		
        	}
        
         System.out.println("Move to Awards\n");
         	
         Award.Award();
    }

	
	}
    

