package view;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		int n = 3;
		int i = n-1;
		
		SomatorioController sc = new SomatorioController();
		int res = sc.somatorio(n, i);
		System.out.println(res);
	}
}
