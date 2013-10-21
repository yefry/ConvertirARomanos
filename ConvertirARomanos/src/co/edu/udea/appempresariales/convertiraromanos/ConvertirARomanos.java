package co.edu.udea.appempresariales.convertiraromanos;

/* Convierte los n�meros enteros del 1 al 999 a n�meros Romanos*/
public class ConvertirARomanos {
	
	/* Segunda versi�n del m�todo que convierte un n�mero entero a un n�mero Romano*/
	public String convertirNumero(int numeroEntero){
		String numeroConvertido = ""; // vble donde voy a guardar el n�mero convertido a Romano
		
		String numerosdeUnidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String numerosdeDecenas[] =  {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String numerosdeCentenas[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		int menorDiez = numeroEntero%10; 		// Unidades del numeroEntero que voy a convertir
		int menorCien = (numeroEntero/10)%10; 	// Decenas del numeroEntero que voy a convertir
		int menorMil = numeroEntero/100; 		// Centenas del numeroEntero que voy a convertir
		
		/*
		 * Desici�n que tomo, si el n�mero entero es mayor a 99, especificamente debe ser entre 100 y 999,
		 * voy a guardar las centenas del 100 al 900 en la vble numeroConvertido, luego le adiciono las decenas del 
		 * 10 al 90 a la vble numeroConvertido, y por �ltimo le adiciono las unidades del 1 al 9 a la vble numeroContenido
		 * Si el n�mero entero no es mayor a 99 y es mayor a 9, se har� lo mismo dicho anteriormente, omitiendo solo
		 * las centenas y de lo contrario es menor que 10, y guard� las unidades del 1 al 9 en la vble numeroConvertido.
		 * */
		if(numeroEntero>=100)
			numeroConvertido = numerosdeCentenas[menorMil] + numerosdeDecenas[menorCien] +numerosdeUnidades[menorDiez];
		else
			if(numeroEntero>=10)
				numeroConvertido = numerosdeDecenas[menorCien] +numerosdeUnidades[menorDiez];			
			else
				numeroConvertido = numerosdeUnidades[menorDiez];		
		
		return numeroConvertido;
	}		
}