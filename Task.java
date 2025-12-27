import java.util.Scanner;
 class RandomGuess{
	int guess;
	int random;
	Scanner sc;
	public RandomGuess(int guess,int random,Scanner sc){
		this.guess=guess;
		this.random=random;
      this.sc=sc;
	
	}
      public int guessNum(){
	      System.out.println("enter your number:");
	        int guessNum=sc.nextInt();
            return guessNum;
    }
	     int i=1;
	     public void game(){
	        while(random!=guess){

        	// guessNum();q i 
        	guess=guessNum();

        	i++;
        	
        }
           if(random==guess){
        		System.out.println("============you won the game!!===============");
        		System.out.println("!!=====your guess no is correct!=====!!");
        	}
	     }
	  	  
	 
     
}

	

public class Task{
	public static void main(String []args){
        Scanner sc= new Scanner(System.in);
            String say="y";
            while(!say.equals("n")){
            	     int random= (int)((Math.random())*100)+1;
            	     System.out.println(random);
                     RandomGuess randomguess= new RandomGuess(0,random,sc);
                     randomguess.game();
        	         System.out.println("wants to play again??(y/n) ");
        		    say=sc.next();
            }

        	System.out.println("thanks for playing!!");
        
	}

}
