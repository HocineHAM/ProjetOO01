package projPOO01.GestionPersonnes;

import java.util.List;

public interface IClient {
	
	public void achete(List<Achat> listA);
	public boolean paie();
	public boolean testClient();
	

}
