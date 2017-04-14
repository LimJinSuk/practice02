package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {

		char[] c1 = reverse("Hello World");//리버싱해서 캐릭터타입으로 바꿈
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");//리버싱해서 캐릭터타입으로 바꿈
		printCharArray(c2);

	}
	
	public static char[] reverse(String str) {
		//뒤부터 돌면서 새로운 캐릭터에 저장
		char[] result = str.toCharArray();//String배열을 Char타입 배열로 하나 생성	
		int length=result.length;
		
		for(int i=0; i<length/2; i++){
			char temp=result[i];
			result[i]=result[length-(i+1)];
			result[length-(i+1)]=temp;
		}
		return result;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
