package controller;

public class SomatorioController {

	public SomatorioController() {
		super ();
		}
	
	public int somatorio(int n, int i) {
		if (n <= 0) {			//condi��o de parada para valores de entrada negativos
			return 0;
		} else if (i==0){		//condi��o de parada ao t�rmino do c�lculo, contador i=0
			return n;
		} else {
			n = n + i;
			i--;
			return somatorio(n, i); //chamada da pr�xima fun��o com parametro o novo valor de n e decremento do cotnador i
		}
	}
}
