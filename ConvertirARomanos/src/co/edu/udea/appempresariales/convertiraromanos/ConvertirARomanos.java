package co.edu.udea.appempresariales.convertiraromanos;


public class ConvertirARomanos {
	
	
	public String convertirNumero(int numeroEntero){
		String numeroConvertido = ""; 
		
		String numerosdeUnidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String numerosdeDecenas[] =  {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String numerosdeCentenas[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		
		int menorDiez = numeroEntero%10; 		
		int menorCien = (numeroEntero/10)%10; 	
		int menorMil = numeroEntero/100; 		
		
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