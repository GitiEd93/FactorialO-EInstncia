import java.util.Scanner;

public class main{

	public static void main(String[] args) {

		Scanner n=new Scanner(System.in);
		System.out.println("Ingrese el valor a calcular su Factorial.");
		System.out.print(" >>> ");
		int val=n.nextInt();
        Factorial f=new Factorial();	
		System.out.print("El factorial de "+val+" es : ");
		System.out.println(f.calcFactorial(val));

			
		}
	}

