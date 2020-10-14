//Yusuf Jangda
//A16437467
//yujangda@ucsd.edu
import java.util.Scanner;
public class covidTransmission
{
	public static void main(String args[]) 
	{
		int D1;
		int D2;
		int H1;
		int H2;
		int M1;
		int M2;
		int contactTime;
		String risk = null;
		Scanner scnr = new Scanner (System.in);
		System.out.println("Enter D1 H1 M1 D2 H2 M2");
		D1=scnr.nextInt();
		H1=scnr.nextInt();
		M1=scnr.nextInt();
		D2=scnr.nextInt();
		H2=scnr.nextInt();
		M2=scnr.nextInt();

		contactTime = ((D2-D1)*24*60)+((H2-H1)*60)+(M2-M1);
		if(D1 < 0 || D1 > 31) {
			contactTime= -1;
			risk = "-1";		
		}
		if(D2 < 0 || D2 > 31) {
			contactTime= -1;
			risk = "-1";
		}
		if(H1 < 0 || H1 > 23) {
			contactTime= -1;
			risk = "-1";
		}
		if(H2 < 0 || H2 > 31) {
			contactTime= -1;
			risk = "-1";
		}
		if(M1 < 0 || M1 > 59) {
			contactTime= -1;
			risk = "-1";
		}
		if(M2 < 0 || M2 > 59) {
			contactTime= -1;
			risk = "-1";
		}
		if (contactTime >=0 && contactTime<=60){
			risk = "low";
		}
		else if(contactTime >60 && contactTime<=180) {
			risk = "medium";
		}
		else if(contactTime >180 && contactTime<=360) {
			risk = "high";
		}
		else if (contactTime>360) {
			risk = "very high";
		}
		else if(contactTime<0) {
			contactTime= -1;
			risk = "-1";			
		}
		System.out.println(contactTime + " " + risk);
	}
}
