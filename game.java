import java.util.Scanner;
import java.util.Random;
class game{
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner s=new Scanner(System.in);
		int gameLevel=5;
		int r = rand.nextInt();
		
		if (r<0) { // for creating positive number
			r = (r*-1);
		}
       r=(r % 100)+1;

        boolean win=false;
        System.out.println();
        System.out.println("   *** Welcome To Guessing Game *** ");
        System.out.println();
        System.out.print(" Enter your name plz : ");
        String name=s.next();
         System.out.println(" "+ name + " now you have to choose a number between 1 - 100 ");
       for(int x=1; x<=gameLevel; x++){
       	      System.out.print(" Enter a number : ");



       int guess=s.nextInt();

       if (guess==r) {
       	  System.out.println(" Congratulation " + name + " !!" );
       	  System.out.println(" You Win :) ");
       	  win=true;
       	  break;
       }
       else if( guess>r && x!=gameLevel ){
       	System.out.println();
       	System.out.println(" Choose a Small number ! ");
       
       }
        else if( guess<r && x!=gameLevel ){
        	System.out.println();
       	System.out.println(" Choose a big  number ! ");
       	
       }

       }
      if(!win){
      	System.out.println();
       	System.out.println(" You lose  " + name + " :(");
       	System.out.println(" The number was : " + r);
       }

}
}