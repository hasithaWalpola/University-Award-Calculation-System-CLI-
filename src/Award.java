import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Award {




	public static void Award() {
		
		
		double total = 0, level5 = 0,level6 = 0;
		int credit = 0;
		
		ArrayList<Double> avg = new ArrayList<Double>();//to find the minimum average of level 5
        avg.add(GetMarks.getL5m1());
        avg.add(GetMarks.getL5m2());
        avg.add(GetMarks.getL5m3());
        avg.add(GetMarks.getL5m4());
        avg.add(GetMarks.getL5m5());
        avg.add(GetMarks.getL5m6());
        Collections.sort(avg);
        
        ArrayList<Double> avg2 = new ArrayList<Double>();//to find the minimum average of level 5
        avg2.add(GetMarks.getL6m1());
        avg2.add(GetMarks.getL6m2());
        avg2.add(GetMarks.getL6m3());
        avg2.add(GetMarks.getL6m4());
        avg2.add(GetMarks.getL6m5());
        avg2.add(GetMarks.getL6m6());
        Collections.sort(avg2);
		
        for(int i = 1 ;i<6;i++){
        	level5 += avg.get(i);
        	level6 += avg2.get(i);
        }
        
        
        
        total = ((level5/500)/3+((level6/500)/3)*2)*100;
        
       
		credit = GetMarks.getL4c() + GetMarks.getL5c() + GetMarks.getL6c();
 		
		
		System.out.println("\nStudent Name = "+GetMarks.getStudentName() + "\n");
		System.out.println("\nStudent Id = "+GetMarks.getStudentId());
		
		System.out.println("\nTotal Average = " + total);
		System.out.println("Total Credit = " + credit);
	
		String deg = "";
		
		if(credit == 360){
			
			if(total>=70){
				
				System.out.println("\n B.eng 1st Class Honours Degree !");
				deg  = "B.eng 1st Class Honours Degree";
			}else if(total>=60 && total <=69){
				
				System.out.println("\n B.eng Upper 2nd Class Honours Degree !");
				deg  = "B.eng Upper 2nd Class Honours Degree" ;
			}else if(total>=50 && total <=59){
				
				System.out.println("\n B.eng Lower 2nd Class Honours Degree !");
				deg  = "B.eng Lower 2nd Class Honours Degree";
			}else if(total>=40 && total <=49){
				
				System.out.println("\n 3rd Class Honours Degree !");
				deg  = "B.eng 3rd Class Honours Degree";
				
			}else{
				
				System.out.println("\n Fail ");
				deg  = "Fail" ;
			}
			
			
		}else{
			
			if(total>=70){
				
				System.out.println("\n B.eng Non Honours Degree !");
				deg  = "B.eng Non Honours Degree";
			}else if(total>=60 && total <=69){
				
				System.out.println("\n B.eng Non Honours Degree !");
				deg  = "B.eng Non Honours Degree";
			}else if(total>=50 && total <=59){
				
				System.out.println("\n B.eng Non Honours Degree !");
				deg = "B.eng Non Honours Degree";
				
			}else if(total>=40 && total <=49){
				
				System.out.println("\n B.eng Non Honours Degree !");
				deg = "B.eng Non Honours Degree";
			}else{
				
				System.out.println("\n Fail ");
				deg = "Fail";
			}
			
			
			
		}
		//write to the file
		String writeString = GetMarks.getStudentId()+ ";" + GetMarks.getStudentName() + ";" + total + ";" + credit + ";" + deg;
    	String path = System.getProperty("user.dir") + "\\files\\reports.txt";
		
    	try {
    		File file = new File(path);
        	
        	if(!file.exists()){
        		file.createNewFile();
        	}
        	
        	FileWriter fw = new FileWriter(file,true);
        	BufferedWriter bw  = new BufferedWriter(fw);
        	
			bw.write(writeString);
			bw.newLine();
			bw.flush();
	    	fw.close();
	    	bw.close();
	    	
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		String s;
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.print("Do you want to continue ? ");
		s = scan.next();
		if(s.length()==1 && s.charAt(0)=='y'){
			
			System.out.println("");
			Student sd = new Student();
			sd.Menu();
			break;
		}else if(s.length()==1 && s.charAt(0)=='n'){
			 System.exit(0);
			 break;
		}
		System.out.println("");
		
		}
		   }
	
		     
}