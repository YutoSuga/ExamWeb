package util;

import java.text.Normalizer;public class util {

	//3つの数字からカラーコードを生成する
	public static String CreateColorCode(int red,int green,int blue) {
		return "#"+change(red)+change(green)+change(blue);
	}

	//10進数を16進数に直すメソッド
	public static String change(int num) {
		int a = num / 16;
		int b = num % 16;
		String code=subChange(a)+subChange(b);
		return code;
	}

	public static String subChange(int num) {
		if (num <= 9) {
			return String.valueOf(num);
		}
		switch (num) {
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";

		}
		return "F";
	}

	//全角文字を半角文字に変換するメソッド
	public static String HalfString(String text) {
		return  Normalizer.normalize(text, Normalizer.Form.NFKC);
	}
	//計算するメソッド
	public static int calc(int[] nums,String calc) {
		switch(calc) {
		case"sum":
			return calcSum(nums);
		case"del":
			return calcDel(nums);
		case"mul":
			return calcMul(nums);
		case"div":
			return calcDiv(nums);

		}
		return 0;

	}

	public static int calcSum(int[]nums) {
		int sum=0;
		for(int n:nums) {
			sum+=n;
		}
		return sum;
	}

	public static int calcDel(int[]nums) {
		System.out.println("calcDelなう");
		int sum=0;

		System.out.println("for文の前"+sum);

		for(int n:nums) {
			sum-=n;
		}
		sum+=nums[0]+nums[0];
		System.out.println("for文のあと"+sum);

		return sum;
	}

	public static int calcMul(int[]nums) {
		int sum=1;
		for(int n:nums) {
			sum*=n;
		}
		return sum;
	}

	public static int calcDiv(int[]nums) {
		int sum=nums[0]*nums[0];
		for(int n:nums) {
			sum/=n;
		}
		return sum;
	}


}
