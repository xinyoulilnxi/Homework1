package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner conosle = new Scanner(System.in);
		String s = conosle.next();
		int a = s.indexOf("@");
		if(a != -1) {
			System.out.println(s.substring(0, a));
		}else{
			System.out.println("不是邮箱");
		}
	}
}
