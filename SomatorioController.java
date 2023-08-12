package controller;

public class SomatorioController {

	public SomatorioController() {
		super ();
		}
	
	public int somatorio(int n, int i) {
		if (n <= 0) {			//condição de parada para valores de entrada negativos
			return 0;
		} else if (i==0){		//condição de parada ao término do cálculo, contador i=0
			return n;
		} else {
			n = n + i;
			i--;
			return somatorio(n, i); //chamada da próxima função com parametro o novo valor de n e decremento do cotnador i
		}
	}
}
