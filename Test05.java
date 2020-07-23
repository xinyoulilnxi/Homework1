package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Test05 t = new Test05();
		String a = t.random();
		String b = console.next();
		Boolean c = t.code(a,b);
		System.out.println(c);

	}
	public String random(){
		StringBuilder str = new StringBuilder();
		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			int a = ran.nextInt(2);
			if(a == 0) {
				str.append((char) ('a' + 26 * Math.random()));
			}else{
				str.append((char) ('A' + 26 * Math.random()));
			}
		}
		System.out.println(str);
		return str.toString();
	}
	public Boolean code(String str,String answer){
		Boolean b = str.equalsIgnoreCase(answer);
		return b;
	}
	
}
