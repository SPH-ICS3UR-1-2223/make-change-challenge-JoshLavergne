import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Your challenge is to read in a price
		
		System.out.println("What is the cost of your purchase?");
		double objectPrice = in.nextDouble();
			
	System.out.println("Your purchase is "+ "$"+Math.round(objectPrice*100)/100.0 );
		System.out.println("How much money do you have?");
		double moneyGiven = in.nextDouble();
    System.out.println("You have "+ "$"+Math.round(moneyGiven*100)/100.0 );
		//Read in the amount paid
		
    if (objectPrice>moneyGiven) {
    System.out.println("insufficient funds");
    }
		
    else  { 
    	System.out.println("Purchase Complete"); 
    }
    
    double changeDue = (moneyGiven - objectPrice);
    int lastDigit = (int)((changeDue*100)%10);
    if (lastDigit==1 || lastDigit==2) {
    	changeDue=changeDue-(lastDigit/100.0);
    } else if (lastDigit==3 || lastDigit==4) {
    	changeDue = changeDue + ((5-lastDigit)/100.0);
    }
    changeDue = Math.round(changeDue*100)/100.0;
    
    
		//Print out the amount of change
    
    System.out.println("Your total change due is " + "$"+changeDue + " Dollars");
    
		//Break the change into all denominations: 
		//$100,$50,$20,$10,$5,$2,$1,$0.25,$0.10,$0.05
    
       int num100 =(int)(changeDue/100);
       System.out.println("You need "+num100+ " 100 dollar bill/s");
       changeDue = changeDue-num100*100;
       
       int num50 = (int) (changeDue/50);
       System.out.println("You need "+num50+ " 50 dollar bill/s");
       changeDue = changeDue-num50*50;
       
       int num20 = (int) (changeDue/20);
       System.out.println("You need "+num20+ " 20 dollar bill/s");
       changeDue = changeDue-num20*20;
       
       int num10 = (int) (changeDue/10);
       System.out.println("You need "+num10+ " 10 dollar bill/s");
       changeDue = changeDue-num10*10;
       
       int num5 = (int) (changeDue/5);
       System.out.println("You need "+num5+ " 5 dollar bill/s");
       changeDue = changeDue-num5*5;
       
       int num2 = (int) (changeDue/2);
       System.out.println("You need "+num2+ " 2 dollar coin/s");
       changeDue = changeDue-num2*1;
       
       int num1 = (int) (changeDue/1);
       System.out.println("You need "+num1+ " 1 dollar coin/s");
       changeDue = changeDue-num1*1;
       
       int num025 = (int) (changeDue/0.25);
       System.out.println("You need "+num025+ " 25 cent coin/s");
       changeDue = changeDue-num025*0.25;
       
       int num010 = (int) (changeDue/0.10);
       System.out.println("You need "+num010+ " 10 cent coin/s");
       changeDue = changeDue-num010*0.10;
       
       int num05 = (int) (changeDue/0.05);
       System.out.println("You need "+num010+ " 5 cent coin/s");
       changeDue = changeDue-num05*0.05;
    
		//As a bonus, make your project round to the nearest $0.05 like actual stores.
		
      
       
       
	}

}
