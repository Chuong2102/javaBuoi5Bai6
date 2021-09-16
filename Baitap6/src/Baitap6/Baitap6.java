package Baitap6;
import java.util.Scanner;
import java.lang.Math;
public class Baitap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		double x1, x2;
		double delta;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nhap a");
		a = input.nextFloat();
		System.out.println("Nhap b");
		b = input.nextFloat();
		System.out.println("Nhap c");
		c = input.nextFloat();
		
		if(a == 0) {
			System.out.println("He so a phai khac 0!!!");
		}
		else {
			delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Vo nghiem");
			}
			else if(delta == 0){
				double temp = 2*a;
				x1 = -b/temp;
				x2 = x1;
				System.out.println("He phuong trinh co nghiem kep x1 = x2 = " +x1 );
			}
			else if(delta > 0) {
				double sqrtDelta = Math.sqrt(delta);
				double mau = 2*a;
				x1 = (-b + sqrtDelta)/mau;
				x2 = (-b - sqrtDelta)/mau;
				
				System.out.print("He phuong trinh co 2 nghiem x1 = "+x1+" x2 ="+x2);
			}
		}
	}

}
