import java.util.Iterator;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//ÁßÃ¸ for¹®
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();//ÁÙ¹Ù²Þ
		}
		
		System.out.println("");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();//ÁÙ¹Ù²Þ
		}
		https://mongte.tistory.com/5
		System.out.println("");
		
		for(int i=1;i<5;i++){
			for(int j=4;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		} 
		
		
	}

}
