
public class PrincipalApp {
	public static void main (String [] args) {
		int [] array = {12,18,5,66,29,8,20,65};
		String resultado;
		
		CalculoEdades objeto = new CalculoEdades (array);
		
		resultado = objeto.frase();
		System.out.println(resultado);
		
	}
}
