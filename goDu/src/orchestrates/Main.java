package orchestrates;

import view.Home;

/**
 * Classe orquestradora de todo o software.
 * 
 * @see view.Home
 * 
 * @author Bruno Ribeiro
 * @author Igor Penha
 */
public class Main {

	/**
	 * Método padrão de toda classe Main, nele é instanciado uma view.Home.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RandomBuild randomLoading = new RandomBuild();
		randomLoading.RandomBuilder();
		new Home();
	}

}
