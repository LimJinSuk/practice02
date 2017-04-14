package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args){ 
		int[] money = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액  : ");
		int number = scan.nextInt();
		scan.close();
		
		int mok = number;
		int next = 0;
		int count=0;
		
		for(int i=0; i<10; i++){
			count = mok/money[i];//갯수
			mok = mok%money[i];//잔액
			
			System.out.println(money[i]+"원 : "+count+"개");
		}
	}
}