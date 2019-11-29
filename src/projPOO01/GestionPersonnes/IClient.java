package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.Services.Achat;

public interface IClient {
	
	public void achete(List<Achat> listA);
	public boolean paie();
	boolean estClient();
	

}
