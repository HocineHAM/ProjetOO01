package projPOO01.GestionPersonnes;

import java.util.List;

public interface IFournisseur {
	
	public boolean livre();
	public void commande(List<Commande> c);
	public boolean testFournisseur();

}
