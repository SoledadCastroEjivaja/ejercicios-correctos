import java.util.Scanner;
public class contar_palabras_repetidas {
	     /**
		 * Crear un programa que permita el ingreso de 30 palabras y muestre cuantas veces esta una determinada palabra. 
		 * La palabra a buscar debe leerse antes de ingresar las 30 palabras.
		 */
		
	       
		public static void main(String[] args) {
			Scanner leer=new Scanner(System.in);
			
			String palabra,palabra_ale;
			int cantidad,contador;
			contador=1;
			cantidad=0;
			
			System.out.print("ingrese palabra que se debe contemplar : ");
			palabra=leer.next();
		    while(contador<=30)
		    {
		    	System.out.print("ingrese palabra"+contador+":");
		    	palabra_ale=leer.next();
		    		if(palabra.equals(palabra_ale))
		    		{
		    			cantidad=cantidad+1;
		
		    		}
			contador++;
		    }
			System.out.print(" la palabra "+palabra+" se repitio "+cantidad+" veces ");
			
			
leer.close();
		}

		
	}

