import java.util.Scanner;
public class QBrating {
	public static void main(String[] args){
		Scanner intTD = new Scanner(System.in);
		System.out.println("Please enter the touchdown score here: ");
		double TD = intTD.nextDouble();
		
		Scanner intYards = new Scanner(System.in);
		System.out.println("Please enter the total yards score here: ");
		double Yards = intYards.nextDouble();
		
		Scanner intINT = new Scanner(System.in);
		System.out.println("Please enter the interceptions score here: ");
		double INT = intINT.nextDouble();
		
		Scanner intcomp = new Scanner(System.in);
		System.out.println("Please enter the completions score here: ");
		double comp = intcomp.nextDouble();
		
		Scanner intATT = new Scanner(System.in);
		System.out.println("Please enter the passes attempted score here: ");
		double ATT = intATT.nextDouble();
		
		double a = Math.max(0,Math.min((comp/ATT-0.3)*5,2.375));
		double b = Math.max(0,Math.min((Yards/ATT-3)*0.25,2.375));
		double c = Math.max(0,Math.min((TD/ATT)*20,2.375));
		double d = Math.max(0,Math.min((2.375 - (INT/ATT)*25),2.375));
		
		double PasserRating = ((a+b+c+d)/6)*100;
		System.out.printf("The QB rating score of this player is: " +  "%4.2f",PasserRating);
	}
}
