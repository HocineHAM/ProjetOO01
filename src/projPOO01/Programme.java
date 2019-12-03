package projPOO01;

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

public class Programme {

	private static List<IClient> lTouteslespersonnes = new ArrayList<IClient>();
	
	static Scanner sc = new Scanner(System.in);

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programme.gererMenu();
		Programme.choisirClient();
		Programme.clientAcheteur(Programme.saisieCClient());
		Programme.listAchat();

	}

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

					// e.printStackTrace();
					System.out.println(e.getMessage());
				}

			sc.nextLine();

			Salarie s = new Salarie(n, p, a, v, c, w, a);

			lSalarie.add(s);
		}

		return (ArrayList<Salarie>) lSalarie;
	}

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

	public static List<IClient> toutesPersonnes() {
		List<IClient> lc = new ArrayList<IClient>();
		lc.addAll(Programme.saisieCSalarie());
		lc.addAll(Programme.saisieCFournisseur());
		lc.addAll(Programme.saisieCClient());
		lc.add(Programme.saisiePatron());
		lTouteslespersonnes = lc;
		return lc;
	}

	public static List<IClient> choisirClient() {
		List<IClient> client = new ArrayList<IClient>();
		List<IClient> Lcl = Programme.lTouteslespersonnes;
		for (IClient personne : Lcl) {
			if (personne.estClient())
				client.add(personne);
		}
		System.out.println("Liste des clients: " + client.toString());
	//	lClients = client;
		return client;
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
				ArrayList<Salarie> ArrSalarie = Programme.saisieCSalarie();
				for (Salarie s : ArrSalarie) {
					System.out.println(s.toString());
					saisieIncompris = false;
				}
			} else if (i.equals("2")) {
				ArrayList<Client> ArrClient = Programme.saisieCClient();
				for (Client client : ArrClient) {
					System.out.println(client.toString());
					saisieIncompris = false;
				}
			} else if (i.equals("3")) {

				ArrayList<Fournisseur> ArrFournisseur = Programme.saisieCFournisseur();
				for (Fournisseur fournisseur : ArrFournisseur) {
					System.out.println(fournisseur.toString());
					saisieIncompris = false;
				}

			} else if (i.equals("4")) {

				Patron p = Programme.saisiePatron();
				System.out.println(p.toString());
				saisieIncompris = false;

			} else if (i.equals("5")) {
				if (Programme.lTouteslespersonnes.isEmpty()) {
					System.out.println("La liste est vide! Veuillez la remplir :");
					Programme.choisirClient();
				}
			} else {
				System.out.println("Je n'ai pas compris votre demande");
				saisieIncompris = true;
			}

		}
	}

}
