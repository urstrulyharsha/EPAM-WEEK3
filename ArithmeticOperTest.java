package calculatoroper;
import java.util.Scanner;

public class ArithmeticOperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Choice 1.Addition 2.Substraction 3.Multiplication 4.Division");
		int c=s.nextInt();
		System.out.println("Enter First Number");
		int a=s.nextInt();
		System.out.println("Enter Second Number");
		int b=s.nextInt();
		Add add = new Add(a,b);
		Sub sub = new Sub(a,b);
		Mul mul = new Mul(a,b);
		Div div = new Div(a,b);
		if(c==1) {
			add.oper();
		}
		else if(c==2) {
			sub.oper();
		}
		else if(c==3) {
			mul.oper();
		}
		else if(c==4) {
			div.oper();
		}
		else {
			System.out.println("Invalid Operation");
		}
	}

}