package projPOO01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.Salarie;

public class Programme {

	public static ArrayList<Salarie> saisieCSalarie() {
		String w = "111";
		Scanner sc = new Scanner(System.in);
		int i;
		List<Salarie> lSalarie = new ArrayList<Salarie>();

		for (i = 0; i < 5; i++) {

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
					ctrlNumSecu(w);
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
					ctrlSalaire(z);
					
					errsalaire = false;

				} catch (ErreurFormatSalaire e) {

					// e.printStackTrace();
					System.out.println(e.getMessage());
				}

			sc.nextLine();

			Salarie s = new Salarie(n, p, a, v, c, w, a);

			lSalarie.add(s);
		}
		sc.close();
		return (ArrayList<Salarie>) lSalarie;
	}

	public static ArrayList<Client> saisieCClient() {
		ArrayList<Client> listC = new ArrayList<Client>();
		Scanner sc = new Scanner(System.in);
		int i;
		for (i = 0; i < 4; i++) {
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

		sc.close();
		return listC;

	}

	public static ArrayList<Fournisseur> saisieCFournisseur() {

		ArrayList<Fournisseur> listFour = new ArrayList<Fournisseur>();

		Scanner sc = new Scanner(System.in);
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
			sc.close();
		}
		return listFour;
	}

	public static void ctrlSalaire(String z) throws ErreurFormatSalaire {
		try {
			Double.valueOf(z);
		} catch (Exception e) {

			throw new ErreurFormatSalaire("Vous n'avez pas le droit de mettre des lettres");
		}

	}

	public static void ctrlNumSecu(String n) throws ErrNumSecu {
		if (n.length() != 15) {
			throw new ErrNumSecu("Le nombre de chiffre est different de 15!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Création et Affichage des
		 * 
		 */
		ArrayList<Salarie> ArrSalarie = Programme.saisieCSalarie();
		for (Salarie s : ArrSalarie) {
			System.out.println(s.toString());
		}

//		ArrayList<Client> ArrClient = Programme.saisieCClient();
//		for (Client client : ArrClient) {
//			System.out.println(client.toString());
//		}
//
//		ArrayList<Fournisseur> ArrFournisseur = Programme.saisieCFournisseur();
//		for (Fournisseur fournisseur : ArrFournisseur) {
//			System.out.println(fournisseur.toString());
//		}
	}

//	public static void gereClient(IClient client) {
//
//		client.achete();
//		client.paie();

//	}
}
