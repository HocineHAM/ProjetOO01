package projPOO01;


import java.util.Scanner;

import projPOO01.ControlesSaisie.Saisies;
import projPOO01.Menu.Menu;

public class Programme {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu.sc = new Scanner(System.in);
		Saisies.sc = Menu.sc;
		Menu.gererMenu();
		Saisies.choisirClient();
		Saisies.clientAcheteur(Saisies.saisieCClient());
		Saisies.listAchat();

	}

}
