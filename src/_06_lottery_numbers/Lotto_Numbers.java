package _06_lottery_numbers;

import java.util.Random;

public class Lotto_Numbers {
public static void main(String[] args) {
int one=0;
int two=0;
int three=0;
int four=0;
int five=0;
int red=0;
	Random ran=new Random();

	one=ran.nextInt(69)+1;
	two=ran.nextInt(69)+1;
	three=ran.nextInt(69)+1;
	four=ran.nextInt(69)+1;
	five=ran.nextInt(69)+1;
	red=ran.nextInt(26)+1;

	System.out.println(one + " " + two + " " + three + " " + four + " " + five + " " + red);
	
}
}
