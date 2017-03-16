import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Student {
    public static void main(String[] args) {
    	
    			login();
        
            }
    
    public static void login(){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("\t !!UNIVERSITY OF GUGSI!! \n");
    	  
    		System.out.println("Login in to the System");
    	
    		String userName,password;
			
    	    System.out.println("User Name :");
    	    userName = sc.next();
    	    System.out.println("Password  :");
    	    password = sc.next();
    	    
			
    		if (userName.equals("admin") && password.equals("123")){
    			System.out.println("Login Success \n");
    			Menu();
    			
    			
    		}else{
    			System.err.println("Login Failed");
    			login();
    		}
    		
    }
    
    public static void Menu(){
    	
    	Scanner sc = new Scanner(System.in);
    	int no;
    	
    	System.out.println("\tWelcome to UOG");
    	System.out.println("\t--------------\n");
    	System.out.println("\nChoose your option");
    	System.out.println("\nRegister Student   - 1");
    	System.out.println("Add Marks          - 2");
    	System.out.println("Report Generate    - 3 \n");
    	no = sc.nextInt();
    	
    	if(no == 1){
    		
    		registerStudent();
    		
    	}else if(no == 2){
    		
    		addMarks();
    		
    	}else if(no == 3){
    		
    		generateReport();
    		
    	}else{
    		
    		System.err.println("Invalid input!");
    		Menu();
    	}
    	
    	
    }
    
    
    public static void addMarks(){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter Student Details \n");
    	
    	int StudentId;
       
        System.out.print("Enter the student ID :\n");
        StudentId = sc.nextInt();
        
        String path = System.getProperty("user.dir") + "\\files\\students.txt";//to set the path
    	
    	try {
    		File file = new File(path);//open the file
        	
        	if(!file.exists()){
        		System.out.println("File Not Fouond");
        	}
        	
        	FileReader fr = new FileReader(file);
        	BufferedReader br  = new BufferedReader(fr);
    		
    		String line, sid,name,_line;
    		int _sid;
    		boolean found = false;
    		
        	while((line = br.readLine()) != null){
        	
        		sid = line.substring(0,line.indexOf(";"));
        		_sid = Integer.parseInt(sid);
        		
        		
        		if(StudentId == _sid){//to find if the user was registered
        			found = true;
        			
        			_line = line.substring(line.indexOf(";")+1,line.lastIndexOf(";"));//to get the name of the student
        			
        			name = _line.substring(0,_line.indexOf(";"));
        			
        			GetMarks.setStudentName(name);
        			break;
        		}
        	}
			
        	if(found){
        		
	        	System.out.println("Student - " + GetMarks.getStudentName());
	        	GetMarks.setStudentId(StudentId);
	            Level4.Level4();
        	}else{
        		System.err.println("User  Not Found, try again!");
        		System.out.println("If you are not registered, Please register first!");
        		Menu();
        	}
    	
        	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
        
        
   
    }
   
    public static void registerStudent(){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("\t Register Student\n" );
    	
    	String StudName,StudId,Degree,Date; 
    	
    	System.out.println("Student Name    :");
    	StudName= sc.next();
    	System.out.println("Student ID      :");
    	StudId=sc.next();
    	System.out.println("Degree Program  :");
    	Degree=sc.next();
    	System.out.println("Registered Date :");
    	Date=sc.next();
    	
    	String writeString = StudId + ";" + StudName+ ";" + Degree + ";" + Date ;
    	String path = System.getProperty("user.dir") + "\\files\\students.txt";
    	
    	
    	
    	try {
    		File file = new File(path);
        	
        	if(!file.exists()){
        		file.createNewFile();
        	}
        	
        	FileWriter fw = new FileWriter(file,true); //write students details to the file
        	BufferedWriter bw  = new BufferedWriter(fw);
        	
			bw.write(writeString);
			bw.newLine();
			bw.flush();
	    	fw.close();
	    	bw.close();
	    	System.out.println("Student Registered Successfully !\n");
	    	Menu();
	    	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	
    	
    	
    }
    
    
    public static void generateReport(){
    	
    	Scanner sc = new Scanner(System.in);
    	String stid;
    	System.out.print("Student ID - ");
    	stid = sc.next();
  
    	String line,_line,student_id;
    	int sid,_sid;
    	
    	sid = Integer.parseInt(stid);

    	String path = System.getProperty("user.dir") + "\\files\\reports.txt";
    	String name = "",average = "",credit = "",degree = "";
    	
    	try {
    		File file = new File(path);
        	
        	if(!file.exists()){
        		file.createNewFile();
        	}
        	//read from the file
        	FileReader fr = new FileReader(file);
            BufferedReader br  = new BufferedReader(fr);
        	boolean found = false;
        	
        	
        	while((line = br.readLine()) != null){
            	
        		student_id = line.substring(0,line.indexOf(";"));
        		_sid = Integer.parseInt(student_id);
        		
        		
        		if(sid == _sid){
        			found = true;
        			
        			_line = line.substring(line.indexOf(";")+1,line.length());
        			
        			name = _line.substring(0,_line.indexOf(";"));
        			
        			_line = _line.substring(_line.indexOf(";")+1,_line.length());
        			
        			average = _line.substring(0,_line.indexOf(";"));
        			
        			_line = _line.substring(_line.indexOf(";")+1,_line.length());
        			
        			credit = _line.substring(0,_line.indexOf(";"));
        			
        			_line = _line.substring(_line.indexOf(";")+1,_line.length());
        			
        			degree = _line.substring(0,_line.length());
        			
        			break;
        		}
        	}
        	
        	if(found){
        		//report
        		System.out.println("Student ID   -   " + stid);
        		System.out.println("Student Name -   " + name);
        		System.out.println("Average      -   " + average);
        		System.out.println("Credit       -   " + credit);
        		System.out.println("Degree       -   " + degree);
        		Menu();
        		
        	}else{
        		
        		System.out.println("No Student Found");
        		generateReport();
        		
        	}
        	
        	
    	} catch (IOException e) {
    			
    			e.printStackTrace();
    		}
        	
       	
    	
    	
    	
    	
  }
    	
}
