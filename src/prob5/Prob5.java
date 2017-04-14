package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {
	Random r;
	int k;
	
	public static void main(String[] args) {
		Prob5 jinsuk = new Prob5();
		 
		int k=jinsuk.randomNum();
		jinsuk.gameStart(k);
	}
	
	public int randomNum(){
		r = new Random();
		k = r.nextInt(100) + 1;
		
		return k;
	}
	
	public void gameStart(int k){
		int i=1;
		int min=1;
		int max=100;
		System.out.print("수를 결정하였습니다. 맞추어 보세요");
		System.out.println(min+"-"+max);
		while(true){
			if(i==1000){
				break;
			}
			Scanner scan = new Scanner(System.in);
			System.out.print(i+">>");
			int number = scan.nextInt();
			
			if(number>k){
				max=number;
				System.out.println("더 낮게");
				System.out.println(min+"-"+max);
			}
			else if(number<k){
				min=number;
				System.out.println("더 높게");
				System.out.println(min+"-"+max);
			}
			else{
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까(y/n)>>");
				String answer = scan.next();
				reStart(answer);
			}
			i++;
		}
	}
	
	public void reStart(String answer){
		if(answer.equals("y")){
			int k1=randomNum();
			gameStart(k1);
		}
		else
			System.exit(0);
	}

}