package co.edu.udea.appempresariales.convertiraromanos;

/* Convierte los números enteros del 1 al 999 a números Romanos*/
public class ConvertirARomanos {
	
	/* Primera versión del método que convierte un número entero a un número Romano*/
	public String convertirNumero(int numeroEntero) {
		
		String numeroConvertido = ""; // vble donde voy a guardar el número convertido a Romano
	
		int menorDiez = numeroEntero%10; // Unidades del numeroEntero que voy a convertir
		int menorCien = (numeroEntero/10)%10; // Decenas del numeroEntero que voy a convertir
		int menorMil = numeroEntero/100; // Centenas del numeroEntero que voy a convertir
		
		/*
		 * if(numeroEntero > 99)
		 * Desición que tomo, si el número entero es mayor a 99, especificamente debe ser entre 100 y 999,
		 * voy a guardar las centenas del 100 al 900 en la vble numeroConvertido
		 * */
		if(numeroEntero > 99){
			/*
			 * switch(menorMil)
			 * Si la centena es 100, menorMil tendrá el valor de 1, se cumplirá el caso 1 y numeroConvertido
			 * tendrá el valor de 100 en Romano (C)
			 * */
			switch (menorMil) {			
			case 1:
				numeroConvertido = "C";
				break;
			case 2:
				numeroConvertido = "CC";
				break;
			case 3:
				numeroConvertido = "CCC";
				break;
			case 4:
				numeroConvertido = "CD";
				break;
			case 5:
				numeroConvertido = "D";
				break;
			case 6:
				numeroConvertido = "DC";
				break;
			case 7:
				numeroConvertido = "DCC";
				break;
			case 8:
				numeroConvertido = "DCCC";
				break;
			case 9:
				numeroConvertido = "CM";
				break;			
			}
		}
		
		/*
		 * if(numeroEntero > 9)
		 * Desición que tomo si el número entero es mayor a 9, especificamente debe ser entre 10 y 99,
		 * voy a adicionar las decenas del 10 al 90 en la vble numeroConvertido
		 * */
		if (numeroEntero > 9){
			/*
			 * switch(menorCien)
			 * Si la decena es 20, menorCien tendrá el valor de 2, se cumplirá el caso 2 y numeroConvertido
			 * tendrá el valor de 20 en Romano (XX), siempre y cuando no haya entrado en la desición anterior if(numeroEntero > 9),
			 * de lo contrario se le adicionará el valor 20 en Romano al valor que tenga numeroConvertido.
			 * */
			switch (menorCien) {
			case 1:
				numeroConvertido += "X";
				break;
			case 2:
				numeroConvertido += "XX";
				break;
			case 3:
				numeroConvertido += "XXX";
				break;
			case 4:
				numeroConvertido += "XL";
				break;
			case 5:
				numeroConvertido += "L";
				break;
			case 6:
				numeroConvertido += "LX";
				break;
			case 7:
				numeroConvertido += "LXX";
				break;
			case 8:
				numeroConvertido += "LXXX";
				break;
			case 9:
				numeroConvertido += "XC";
				break;
			default:
				numeroConvertido += "";
				break;
			}
		}
					
		/*
		 * switch(menorDiez)
		 * Si la unidad es 3, menorDiez tendrá el valor de 3, se cumplirá el caso 3 y numeroConvertido
		 * tendrá el valor de 3 en Romano (III), siempre y cuando no haya entrado en las desiciones anteriores,
		 * de lo contrario se le adicionará el valor 3 en Romano al valor que tenga numeroConvertido.
		 * */
		switch (menorDiez) {
		case 1:
			numeroConvertido += "I";
			break;
		case 2:
			numeroConvertido += "II";
			break;
		case 3:
			numeroConvertido += "III";
			break;
		case 4:
			numeroConvertido += "IV";
			break;
		case 5:
			numeroConvertido += "V";
			break;
		case 6:
			numeroConvertido += "VI";
			break;
		case 7:
			numeroConvertido += "VII";
			break;
		case 8:
			numeroConvertido += "VIII";
			break;
		case 9:
			numeroConvertido += "IX";
			break;	
		default:
			numeroConvertido += "";
			break;
		}
		
		return numeroConvertido;
	}
}