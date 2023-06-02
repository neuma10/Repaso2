
public class CalculoEdades {
	private int [] edades;
	
	public CalculoEdades (int [] edades) {
		this.edades = edades;
	} 
	
	public String frase () {
		int menor=0, mayor=0, jubilado=0;
		String resultado;
		
		for (int i = 0; i<edades.length ; i++) {
			if (edades[i] <= 17) {
				menor = menor + 1;
			} else if (edades[i] >= 18 && edades[i] < 64) {
				mayor = mayor + 1;
			} else if (edades[i] >= 65) {
				jubilado = jubilado + 1;
			}
		}
		
		resultado = "Menores de edad: " + menor + " , Mayores de edad: " + mayor + ", Jubilados: " + jubilado ;
		return resultado;
	}
}
