package projPOO01.Menu;

import java.util.ArrayList;
import java.util.Scanner;


import projPOO01.ControlesSaisie.Saisies;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.Patron;
import projPOO01.GestionPersonnes.Salarie;

public class Menu {

	public static Scanner sc = null;
	
	
	public static void gererMenu() {
		boolean saisieIncompris = true;
		while (saisieIncompris) {

			System.out.println("Si vous voulez saisir les Salariés les afficher tappez 1");
			System.out.println("Si vous voulez saisir les clients les afficher tappez 2");
			System.out.println("Si vous voulez saisir les Fournisseurs les afficher tappez 3");
			System.out.println("Si vous voulez saisir le Patron et l'afficher tappez 4");
			System.out.println("Si vous voulez voir la liste des client tappez 5");

			String i = sc.nextLine();
			if (i.equals("1")) {
				ArrayList<Salarie> ArrSalarie = Saisies.saisieCSalarie();
				for (Salarie s : ArrSalarie) {
					System.out.println(s.toString());
					saisieIncompris = false;
				}
			} else if (i.equals("2")) {
				ArrayList<Client> ArrClient = Saisies.saisieCClient();
				for (Client client : ArrClient) {
					System.out.println(client.toString());
					saisieIncompris = false;
				}
			} else if (i.equals("3")) {

				ArrayList<Fournisseur> ArrFournisseur = Saisies.saisieCFournisseur();
				for (Fournisseur fournisseur : ArrFournisseur) {
					System.out.println(fournisseur.toString());
					saisieIncompris = false;
				}

			} else if (i.equals("4")) {

				Patron p = Saisies.saisiePatron();
				System.out.println(p.toString());
				saisieIncompris = false;

			} else if (i.equals("5")) {
				if (Saisies.lTouteslespersonnes.isEmpty()) {
					System.out.println("La liste est vide! Veuillez la remplir :");
					Saisies.choisirClient();
				}
			} else {
				System.out.println("Je n'ai pas compris votre demande");
				saisieIncompris = true;
			}

		}
	}
}
