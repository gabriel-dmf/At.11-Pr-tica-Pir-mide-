package AT_pratica_piramide;

import java.util.Scanner;

public class Mainpiramide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os valores de ab e h: ");
		float ab = sc.nextFloat();
		float h = sc.nextFloat();
		System.out.println("Informe o tipo da tinta(1-R$127,9; 2-258,98; 3-344,34) ");
		int tipo = sc.nextInt();
		
		Piramide p = new Piramide(h, ab, tipo);
		System.out.println(p);
		
		sc.close();
		
	}

}
