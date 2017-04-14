package prob3;

public class Prob3 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}

	public static void replaceSpace(char c[]) {//공백 to ,
		for(int i=0; i<c.length; i++){
			if(c[i]==' ')
				c[i]=',';
		}
	}

	public static void printCharArray(char c[]) {//출력
		System.out.println(c);
	}
}
