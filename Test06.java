package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String str = console.next();
		int a = parseInt(str);
		System.out.println(a);
	}
	public static int parseInt(String str){
		String regex = new String();
		regex = "^[\\d]{1,}\\+[\\d]{1,}$";
		String regex1 = "^[\\d]{1,}\\-[\\d]{1,}$";
		String regex2 = "^[\\d]{1,}\\*[\\d]{1,}$";
		String regex3 = "^[\\d]{1,}\\/[\\d]{1,}$";

		if(str.matches(regex)){
			int a = str.indexOf("+");
			String str1 = str.substring(0,a);
			String str2 = str.substring(a + 1,str.length());
			int a1 = Integer.valueOf(str1);
			int a2 = Integer.valueOf(str2);
			return a1 + a2;
		}
		if (str.matches(regex1)){
			int a = str.indexOf("-");
			String str1 = str.substring(0,a);
			String str2 = str.substring(a + 1,str.length());
			int a1 = Integer.valueOf(str1);
			int a2 = Integer.valueOf(str2);
			return a1 - a2;
		}if (str.matches(regex2)){
			int a = str.indexOf("*");
			String str1 = str.substring(0,a);
			String str2 = str.substring(a + 1,str.length());
			int a1 = Integer.valueOf(str1);
			int a2 = Integer.valueOf(str2);
			return a1 * a2;
		}if (str.matches(regex3)){
			int a = str.indexOf("/");
			String str1 = str.substring(0,a);
			String str2 = str.substring(a + 1,str.length());
			int a1 = Integer.valueOf(str1);
			int a2 = Integer.valueOf(str2);
			return a1 / a2;
		}
		else{
		return 0;}
	}
}









