package projPOO01.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import projPOO01.ControlesSaisie.Saisies;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.Patron;
import projPOO01.GestionPersonnes.Salarie;

public class Menu {

	public static Scanner sc = null;
	private static String choix = null;

	public static void quitter() {
		
		System.out.println("---------------------------- BY :) ----------------------------------");
		System.exit(0);
		
	}
	public static void gererMenu() {

		Map<String, iExecute> im = new HashMap<String, iExecute>();

		im.put("1 les Salariés", Saisies::saisieCSalarie);
		im.put("2 les clients", Saisies::saisieCClient);
		im.put("3 les Fournisseurs", Saisies::saisieCFournisseur);
		im.put("4 le Patron", Saisies::saisiePatron);
		im.put("5 la liste", Saisies  :: choisirClient);
		im.put("6 quitter", Menu :: quitter);
		im.keySet().stream().sorted().forEach(System.out::println);
		
		
		while(true) {
			
			choix = sc.nextLine();
		im.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
		forEach(e->e.getValue().apply());
					
		
//		boolean saisieIncompris = true;
//		while (saisieIncompris) {
//
//			System.out.println("Si vous voulez saisir les Salariés les afficher tappez 1");
//			System.out.println("Si vous voulez saisir les clients les afficher tappez 2");
//			System.out.println("Si vous voulez saisir les Fournisseurs les afficher tappez 3");
//			System.out.println("Si vous voulez saisir le Patron et l'afficher tappez 4");
//			System.out.println("Si vous voulez voir la liste des client tappez 5");
//
//			String i = sc.nextLine();
//			if (i.equals("1")) {
//				ArrayList<Salarie> ArrSalarie = Saisies.saisieCSalarie();
//				for (Salarie s : ArrSalarie) {
//					System.out.println(s.toString());
//					saisieIncompris = false;
//				}
//			} else if (i.equals("2")) {
//				Saisies.saisieCClient();
//				ArrayList<Client> ArrClient = Saisies.saisieCClient();
//				for (Client client : ArrClient) {
//					System.out.println(client.toString());
//				saisieIncompris = false;
//				}
//			} else if (i.equals("3")) {
//
//				ArrayList<Fournisseur> ArrFournisseur = Saisies.saisieCFournisseur();
//				for (Fournisseur fournisseur : ArrFournisseur) {
//					System.out.println(fournisseur.toString());
//					saisieIncompris = false;
//				}
//
//			} else if (i.equals("4")) {
//
//				Patron p = Saisies.saisiePatron();
//				System.out.println(p.toString());
//				saisieIncompris = false;
//
//			} else if (i.equals("5")) {
//				if (Saisies.lTouteslespersonnes.isEmpty()) {
//					System.out.println("La liste est vide! Veuillez la remplir :");
//					Saisies.choisirClient();
//				}
//			} else {
//				System.out.println("Je n'ai pas compris votre demande");
//				saisieIncompris = true;
//			}
//
//		
		}
	}
}
