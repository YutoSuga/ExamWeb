package util;

public class utilTest {
	public static void main(String[]args) {
		while(true) {
			System.out.println("数字を入力してね(0～255)：");
			int num = new java.util.Scanner(System.in).nextInt();
			System.out.println("入力した数字を16進数に直したよ:"+util.change(num));

		}

	}

}
