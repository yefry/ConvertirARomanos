package co.edu.udea.appempresariales.convertiraromanos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* Clase para hacer las pruebas de la conversión de numeros enteros a Romanos */
public class ConvertirARomanosTest {

	ConvertirARomanos convertiraRomanos;
	String numero; // Número en Romano que quiero comparar con el esperado --> lo que quiero evaluar
	
	@Before
	public void init(){
		convertiraRomanos = new ConvertirARomanos(); // Instanciación de la clase para convertir los numeros a Romanos
		numero = "";
	}
	
	/* Métodos para hacer las pruebas unitarias */
	@Test
	public void testConvertir1() {				
		/* Numero Romano esperado, al convertir el número entero (uno) a Romano con la ayuda del método convertirNumero */
		numero = convertiraRomanos.convertirNumero(1); 
		Assert.assertEquals("I", numero); // chequear ("I" --> valor evaluado). (numero --> lo que quiero evaluar)		
	}
	
	@Test
	public void testConvertir2() {				
		numero = convertiraRomanos.convertirNumero(2);
		Assert.assertEquals("II", numero);		
	}
	
	@Test
	public void testConvertir3() {				
		numero = convertiraRomanos.convertirNumero(3);
		Assert.assertEquals("III", numero);		
	}
	
	@Test
	public void testConvertir4() {				
		numero = convertiraRomanos.convertirNumero(4);
		Assert.assertEquals("IV", numero);		
	}
	
	@Test
	public void testConvertir5() {				
		numero = convertiraRomanos.convertirNumero(5);
		Assert.assertEquals("V", numero);		
	}
	
	@Test
	public void testConvertir6() {				
		numero = convertiraRomanos.convertirNumero(6);
		Assert.assertEquals("VI", numero);		
	}
	
	@Test
	public void testConvertir7() {				
		numero = convertiraRomanos.convertirNumero(7);
		Assert.assertEquals("VII", numero);		
	}
	
	@Test
	public void testConvertir8() {				
		numero = convertiraRomanos.convertirNumero(8);
		Assert.assertEquals("VIII", numero);		
	}
	
	@Test
	public void testConvertir9() {				
		numero = convertiraRomanos.convertirNumero(9);
		Assert.assertEquals("IX", numero);		
	}
	
	@Test
	public void testConvertir10() {				
		numero = convertiraRomanos.convertirNumero(10);
		Assert.assertEquals("X", numero);		
	}
	
	@Test
	public void testConvertir14() {				
		numero = convertiraRomanos.convertirNumero(14);
		Assert.assertEquals("XIV", numero);		
	}
	
	@Test
	public void testConvertir16() {				
		numero = convertiraRomanos.convertirNumero(16);
		Assert.assertEquals("XVI", numero);		
	}
	
	@Test
	public void testConvertir24() {				
		numero = convertiraRomanos.convertirNumero(24);
		Assert.assertEquals("XXIV", numero);		
	}
	
	@Test
	public void testConvertir36() {				
		numero = convertiraRomanos.convertirNumero(36);
		Assert.assertEquals("XXXVI", numero);		
	}
	
	@Test
	public void testConvertir49() {				
		numero = convertiraRomanos.convertirNumero(49);
		Assert.assertEquals("XLIX", numero);		
	}
	
	@Test
	public void testConvertir50() {				
		numero = convertiraRomanos.convertirNumero(50);
		Assert.assertEquals("L", numero);		
	}
	
	@Test
	public void testConvertir77() {				
		numero = convertiraRomanos.convertirNumero(77);
		Assert.assertEquals("LXXVII", numero);		
	}
	
	@Test
	public void testConvertir100() {				
		numero = convertiraRomanos.convertirNumero(100);
		Assert.assertEquals("C", numero);		
	}
	
	@Test
	public void testConvertir101() {				
		numero = convertiraRomanos.convertirNumero(101);
		Assert.assertEquals("CI", numero);		
	}
	
	@Test
	public void testConvertir122() {				
		numero = convertiraRomanos.convertirNumero(122);
		Assert.assertEquals("CXXII", numero);		
	}
	
	@Test
	public void testConvertir158() {				
		numero = convertiraRomanos.convertirNumero(158);
		Assert.assertEquals("CLVIII", numero);		
	}
	
	@Test
	public void testConvertir234() {				
		numero = convertiraRomanos.convertirNumero(234);
		Assert.assertEquals("CCXXXIV", numero);		
	}
	
	@Test
	public void testConvertir372() {				
		numero = convertiraRomanos.convertirNumero(372);
		Assert.assertEquals("CCCLXXII", numero);		
	}
	
	@Test
	public void testConvertir500() {				
		numero = convertiraRomanos.convertirNumero(500);
		Assert.assertEquals("D", numero);		
	}
	
	@Test
	public void testConvertir566() {				
		numero = convertiraRomanos.convertirNumero(566);
		Assert.assertEquals("DLXVI", numero);		
	}
	
	@Test
	public void testConvertir893() {				
		numero = convertiraRomanos.convertirNumero(893);
		Assert.assertEquals("DCCCXCIII", numero);		
	}
	
	@Test
	public void testConvertir999() {				
		numero = convertiraRomanos.convertirNumero(999);
		Assert.assertEquals("CMXCIX", numero);		
	}
}
