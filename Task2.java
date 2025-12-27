import java.util.Scanner;
public class Task2{
	public static void main(String []args){

	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of subjects:");
	int NoOfSub=sc.nextInt();
	String[] subName=new String[NoOfSub];
	int[] marks=new int[NoOfSub];


	for(int i=0;i<NoOfSub;i++){	
		
		System.out.println("enter sub name:");
		// subName[i].matches("[a-zA-Z]+");
   String name=sc.next();
		if(!name.matches("[a-zA-Z]+")) {
        System.out.println("Invalid subject name! Please enter right subject name.");
        i--; 
        continue;
    }

    subName[i] = name;

	}


	System.out.println("enter marks for each subjects!!");
	boolean fail=false;

	for(int i=0;i<NoOfSub;i++){
        System.out.println("marks for  "+subName[i]+":");
        marks[i]=sc.nextInt();
        if(marks[i] <0 || marks[i]>100){
        	System.out.println("invalid !please try again..");
        	i--;
        	continue;
        }
        System.out.println("subject:"+subName[i]+" "+"marks:"+marks[i]);
        	if(marks[i]<33){
        		fail=true;
        	}
	}


 
	double sumOfMark=0;
	System.out.println("TOtal marks of student is:"); 

 
    float average=	(float)sumOfMark/NoOfSub;


	String grade="";

if(fail){
	grade="F";
}
else{


	if (average<0 || average>100) {
		System.out.println("something went wrong!");
	}
	else if(average==100){
		grade="A++";
	}
	
    else if(average>=90 && average<100){
		
		grade="A+";
	
	}
	else if(average<90 && average>=80){
		

		grade="A";
		
	}
	else if(average<80 && average>=70){

		grade="B";
		
	}
	else if(average<70 && average>=40){
       
		grade="C";
		
	}
	else if(average<40&& average>=25){
		
		grade="D";
	}
	else{
		grade="F";
	}
}
	    System.out.println("==== Student Report ====");
        System.out.println("Total Marks: " + sumOfMark);
        System.out.println("Average Percentage: " + average+"%");
        System.out.println("Grade: " + grade);

}
      
	
	
}