package dudu;

import java.util.Scanner;

public class exercicio {
	
	public static void main(String[] args) {
		
		double nota1, nota2, media;
		Scanner exercicio = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		nota1= exercicio.nextDouble();
		nota1= nota1*2;
		
		System.out.println("Digite sua segunda nota: ");
		nota2= exercicio.nextDouble();
		nota2=nota2*3;
		
		media= (nota1+nota2)/5;
		
		System.out.println("Sua media e: "+media);	
		
		//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	}

}
