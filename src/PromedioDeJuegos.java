import java.util.Scanner;
public class PromedioDeJuegos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner text=new Scanner (System.in); 
		//En esta seccion declare los 3 puntajes obtenidos que luego daran el promedio de los 3.
		System.out.println("Promedio de Juego");
		System.out.println("Ingrese Puntaje1: ");
		double Puntaje1 = text.nextDouble();
		
		System.out.println("Ingrese Puntaje2: ");
		double Puntaje2 = text.nextDouble();
		
		System.out.println("Ingrese Puntaje3: ");
		double Puntaje3 = text.nextDouble();
		
		System.out.println("Resultado " + ((Puntaje1+Puntaje2+Puntaje3)/3));
		double Resultado = text.nextDouble();
		
		//En esta seccion el programa deberia obtener el promedio y como final declara si es Excelente, Bueno, Suciente, Has Perdido.
		if(Resultado > 1000)
		 {
			System.out.print("Excelente");
		 }
		else if(Resultado > 700)
		{
			System.out.print("Bueno");
		}
		else if(Resultado > 500)
		{
			System.out.print("Suficiente");
		}
		else if(Resultado < 500)
		{
			System.out.print("Has Perdido");
		}
	}

}
