package projPOO01.ControlesSaisie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.Patron;
import projPOO01.GestionPersonnes.Salarie;
import projPOO01.Services.Achat;

public class Saisies {

	public static List<IClient> lTouteslespersonnes = new ArrayList<IClient>();
	public static Scanner sc = null;

	/**
	 * methode pour saisir un patron
	 * 
	 * @return patron
	 */
	public static Patron saisiePatron() {
		String numeroSecu = "0";
		String salaire = "0";

		System.out.println("Veuillez renter votre nom :");
		String nom = sc.nextLine();
		System.out.println("Veuillez renter votre prénom :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez renter votre adresse :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez renter votre ville :");
		String ville = sc.nextLine();
		System.out.println("Veuillez renter votre code postale :");
		String codepostal = sc.nextLine();
		boolean errnumerosociale = true;
		while (errnumerosociale)
			try {
				System.out.println("Veuillez renter votre numéro de sécurité sociale:");
				numeroSecu = sc.nextLine();
				Patron.ctrlNumSecu(numeroSecu);
				errnumerosociale = false;
			} catch (ErrNumSecu e) {

				System.out.println(e.getMessage());
			}

		boolean errsalaire = true;
		while (errsalaire)
			try {
				System.out.println("Veuillez renter votre salaire:");
				salaire = sc.nextLine();
				Patron.ctrlSalaire(salaire);

				errsalaire = false;

			} catch (ErreurFormatSalaire e) {

				// e.printStackTrace();
				System.out.println(e.getMessage());
			}

		Patron patron = new Patron(nom, prenom, adresse, ville, codepostal, numeroSecu, salaire);

		return patron;
	}
/**
 * methode qui permet de creer des fournisseurs et de remplir une liste
 * @return liste de fournisseurs
 */
	public static List<IClient> choisirClient() {
		List<IClient> client = new ArrayList<IClient>();
		List<IClient> Lcl = Saisies.lTouteslespersonnes;
		for (IClient personne : Lcl) {
			if (personne.estClient())
				client.add(personne);
		}
		System.out.println("Liste des clients: " + client.toString());
		
		return client;
	}

	public static ArrayList<Fournisseur> saisieCFournisseur() {

		ArrayList<Fournisseur> listFour = new ArrayList<Fournisseur>();

		int i;
		for (i = 0; i < 3; i++) {
			System.out.println("Veuillez renter votre nom :");
			String n = sc.nextLine();
			System.out.println("Veuillez renter votre prénom :");
			String p = sc.nextLine();
			System.out.println("Veuillez renter votre adresse :");
			String a = sc.nextLine();
			System.out.println("Veuillez renter votre Ville :");
			String v = sc.nextLine();
			System.out.println("Veuillez renter votre code postal:");
			String c = sc.nextLine();
			System.out.println("Veuillez renter votre numéro unique:");
			String nu = sc.nextLine();

			for (Fournisseur w : listFour) {
				if (w.getNumeroUnique().equals(nu)) {
					System.out.println("Le numéro unique existe déja! Veuillez le retapper");
					nu = sc.nextLine();
				}
			}

			Fournisseur fr = new Fournisseur(n, p, a, v, c, nu);
			listFour.add(fr);

		}
		return listFour;
	}
/**
 * methode qui permet de creer des salaries et de remplir une liste de salaries
 * @return liste de salarie
 */
	public static ArrayList<Salarie> saisieCSalarie() {
		String w = "111";

		int i;
		List<Salarie> lSalarie = new ArrayList<Salarie>();

		for (i = 0; i < 2; i++) {

			System.out.println("Veuillez renter votre nom :");
			String n = sc.nextLine();
			System.out.println("Veuillez renter votre prénom :");
			String p = sc.nextLine();
			System.out.println("Veuillez renter votre adresse :");
			String a = sc.nextLine();
			System.out.println("Veuillez renter votre Ville :");
			String v = sc.nextLine();
			System.out.println("Veuillez renter votre code postal:");
			String c = sc.nextLine();

			boolean errnumerosociale = true;

			while (errnumerosociale)
				try {
					System.out.println("Veuillez renter votre numéro de sécurité sociale:");
					w = sc.nextLine();
					Salarie.ctrlNumSecu(w);
					errnumerosociale = false;
				} catch (ErrNumSecu e) {

					System.out.println(e.getMessage());
				}
			String z = "0";
			boolean errsalaire = true;
			while (errsalaire)
				try {
					System.out.println("Veuillez renter votre salaire:");
					z = sc.nextLine();
					Salarie.ctrlSalaire(z);

					errsalaire = false;

				} catch (ErreurFormatSalaire e) {

					System.out.println(e.getMessage());
				}

			sc.nextLine();

			Salarie s = new Salarie(n, p, a, v, c, w, a);

			lSalarie.add(s);
		}

		return (ArrayList<Salarie>) lSalarie;
	}
/**
 * methode qui permet de creer des clients et de les mettres dans une liste de clients
 * @return liste de clients
 */
	public static ArrayList<Client> saisieCClient() {
		ArrayList<Client> listC = new ArrayList<Client>();
		// Scanner sc = new Scanner(System.in);
		int i;
		for (i = 0; i < 2; i++) {
			System.out.println("Veuillez renter votre nom :");
			String n = sc.nextLine();
			System.out.println("Veuillez renter votre prénom :");
			String p = sc.nextLine();
			System.out.println("Veuillez renter votre adresse :");
			String a = sc.nextLine();
			System.out.println("Veuillez renter votre Ville :");
			String v = sc.nextLine();
			System.out.println("Veuillez renter votre code postal:");
			String c = sc.nextLine();
			System.out.println("Veuillez renter votre numéro unique:");
			String nu = sc.nextLine();
			for (Client z : listC) {
				if (z.getNumeroUnique().equals(nu)) {
					System.out.println("Le numéro unique existe déja! Veuillez le retapper");
					nu = sc.nextLine();
				}
			}
			Client cl = new Client(n, p, a, v, c, nu);
			listC.add(cl);
		}

		return listC;

	}
/**
 * methode qui regroupe l'ensemble des personnes(salaries, clients, patron et fournisseurs)
 * @return liste des toutes les personnes(salaries, clients, patron et fournisseurs)
 */
	public static List<IClient> toutesPersonnes() {
		List<IClient> lc = new ArrayList<IClient>();
		lc.addAll(Saisies.saisieCSalarie());
		lc.addAll(Saisies.saisieCFournisseur());
		lc.addAll(Saisies.saisieCClient());
		lc.add(Saisies.saisiePatron());
		Saisies.lTouteslespersonnes = lc;
		return lc;
	}

	public static Client clientAcheteur(List<Client> listC) {
		for (Client cl : listC) {

			System.out.println("choisi un client :" + listC.indexOf(cl) + "le client est" + cl.toString());
		}
		String s = sc.nextLine();
		int st = Integer.parseInt(s);
		Client c = listC.get(st);

		c.paie();
		return c;
	}

	public static List<Achat> listAchat() {
		List<Achat> la = new ArrayList<Achat>();

		boolean vouloirAcheter = false;
		String acheterEncore;
		Date dt = null;
		while (!vouloirAcheter) {

			System.out.println("Veuillez renter la Date d'achat");
			String datestr = sc.nextLine();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.FRENCH);

			try {

				dt = sdf.parse(datestr);
				System.out.println(dt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Veuillez renter l'intitulé de l'achat");
			String intitule = sc.nextLine();
			System.out.println("Veuillez renter la quantité");
			int quantite = sc.nextInt();
			sc.nextLine();
			Achat achat = new Achat(dt, intitule, quantite);

			System.out.println("Voulez vous continuer vos achats? si oui tappez 1 sinon tappez 0");
			acheterEncore = sc.nextLine();
			if (acheterEncore.equals("1")) {
				vouloirAcheter = false;
			} else {
				vouloirAcheter = true;

			}
			la.add(achat);

		}

		for (Achat list : la) {
			System.out.println("Votre liste d'âchat :" + list.toString());
		}

		return la;
	}

}
