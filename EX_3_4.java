import java.util.*;
import java.util.Scanner;

public class EX_3_4 {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir une phrase :");
			String str = sc.nextLine();  // sert à lire au clavier
			for (int i=0; i < str.length(); i++){
				char c= str.charAt(i); // prend le charactère indice i
				if (Character.isLetter(c)){
					System.out.print(c);
				}
				else 
					System.out.println();
			}
			System.out.println();
		}
}
