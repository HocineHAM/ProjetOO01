package projPOO01.ControlesSaisie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import projPOO01.Exceptions.ErrNumSecu;
import projPOO01.Exceptions.ErreurFormatSalaire;
import projPOO01.GestionPersonnes.Client;
import projPOO01.GestionPersonnes.Fournisseur;
import projPOO01.GestionPersonnes.IClient;
import projPOO01.GestionPersonnes.Patron;
import projPOO01.GestionPersonnes.Personne;
import projPOO01.GestionPersonnes.Salarie;
import projPOO01.Menu.Menu;
import projPOO01.Services.Achat;

public class Saisies {
	
	public static Client c = new Client();
	public static Fournisseur f = new Fournisseur();
	public static Salarie s = new Salarie();
	public static Patron p = new Patron();
	public static Personne pers = new Personne();
	public static List<IClient> lTouteslespersonnes = new ArrayList<IClient>();
	public static Scanner sc = null;

	

	/**
	 * methode pour saisir un patron
	 * 
	 * @return patron
	 */
	public static Map<String, iSaisie> m = new HashMap<String, iSaisie>();
	
	public static void saisiePersonneGenerique() {

		
		m.put("1 Veuillez rentrer votre nom " + pers.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			pers.setNom(t);
		});
		m.put("2 Veuillez rentrer votre prénom " + pers.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			pers.setPrenom(t);
		});
		m.put("3 Veuillez rentrer votre adresse " + pers.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			pers.setAdresse(t);
		});
		m.put("4 Veuillez rentrer votre ville " + pers.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			pers.setVille(t);
		});
		m.put("5 Veuillez rentrer votre code postale " + pers.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			pers.setCodepostal(t);
		});
		//m.keySet().stream().sorted();
	}
	
	public static void saisiePatron() {
		
		Saisies.saisiePersonneGenerique();
		m.put("6 Veuillez rentrer votre numero de securité sociale " + p.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			p.setNumeroSecu(t);
		});
		m.put("7 Veuillez rentrer votre salaire " + p.getClass().getSimpleName(), (t) -> {
			t = Saisies.sc.nextLine();
			p.setSalaire(t);
		});
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(p -> {
			System.out.println(p.getKey());
			p.getValue().saisir(p.getKey());
			
		});
		System.out.println(p.toString());
	}




	/**
	 * methode qui permet de creer des fournisseurs et de remplir une liste
	 * 
	 * @return liste de fournisseurs
	 */
	public static void choisirClient() {
		List<IClient> client = new ArrayList<IClient>();

		List<IClient> Lcl = Saisies.lTouteslespersonnes;
		for (IClient personne : Lcl) {
			if (personne.estClient())
				client.add(personne);
		}
		System.out.println("Liste des clients: " + client.toString());

		
	}

	public static ArrayList<Fournisseur> saisieCFournisseur() {

		ArrayList<Fournisseur> listFour = new ArrayList<Fournisseur>();

		int i;
		for (i = 0; i < 3; i++) {
			Saisies.saisiePersonneGenerique();
			m.put("Veuillez renter votre numéro unique" + s.getClass().getSimpleName(), (t) -> {
				t = Saisies.sc.nextLine();
				f.setNumeroUnique(t);
				
				});
			
			listFour.add(f);
			}		
		listFour.forEach(lfournisseur -> {
			System.out.println(lfournisseur.toString());
		});
		return listFour;
	}

	/**
	 * methode qui permet de creer des salaries et de remplir une liste de salaries
	 * 
	 * @return liste de salarie
	 */
	public static ArrayList<Salarie> saisieCSalarie() {
		String w = "111";

		int i;
		List<Salarie> lSalarie = new ArrayList<Salarie>();

		for (i = 0; i < 2; i++) {

			
			Saisies.saisiePersonneGenerique();
			m.put("Veuillez renter votre numero de securité sociale " + s.getClass().getSimpleName(), (t) -> {
				t = Saisies.sc.nextLine();
				s.setNumeroSecu(t);
			});
			m.put("Veuillez renter votre salaire " + s.getClass().getSimpleName(), (t) -> {
				t = Saisies.sc.nextLine();
				s.setSalaire(t);
			});
			
			m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(s -> {
				System.out.println(s.getKey());
				s.getValue().saisir(s.getKey());
				
			});
			

			lSalarie.add(s);
		}
		lSalarie.forEach(lsalarie -> {
			System.out.println(lsalarie.toString());
		});
		return (ArrayList<Salarie>) lSalarie;
	}

	/**
	 * methode qui permet de creer des clients et de les mettres dans une liste de
	 * clients
	 * 
	 * @return liste de clients
	 */
	public static ArrayList<Client> saisieCClient() {
		ArrayList<Client> listC = new ArrayList<Client>();
		int i;
		for (i = 0; i < 2; i++) {
			
			Saisies.saisiePersonneGenerique();
			m.put("Veuillez renter votre numéro unique" + c.getClass().getSimpleName(), (t) -> {
				t = Saisies.sc.nextLine();
				c.setNumeroUnique(t);
				
				});
			
			m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(c -> {
				System.out.println(c.getKey());
				c.getValue().saisir(c.getKey());
				
			});
			System.out.println(c.toString());
		
			m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(s -> {
				System.out.println(s.getKey());
				s.getValue().saisir(s.getKey());
				
			});

			listC.add(c);
		}

		listC.forEach(System.out::println);
		
		return listC;

	}

	/**
	 * methode qui regroupe l'ensemble des personnes(salaries, clients, patron et
	 * fournisseurs)
	 * 
	 * @return liste des toutes les personnes(salaries, clients, patron et
	 *         fournisseurs)
	 */
	public static List<IClient> toutesPersonnes() {
		List<IClient> lc = new ArrayList<IClient>();
		lc.addAll(Saisies.saisieCSalarie());
		lc.addAll(Saisies.saisieCFournisseur());
		lc.addAll(Saisies.saisieCClient());
		Saisies.lTouteslespersonnes = lc;
		return lc;
	}

	public static Client clientAcheteur(List<Client> listC) {
		listC.forEach(cl -> {
			System.out.println("choisi un client :" + listC.indexOf(cl) + "le client est" + cl.toString());
		});
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
		la.forEach(a -> {
			System.out.println("Votre liste d'âchat :" + a.toString());
		});

		return la;
	}

}
