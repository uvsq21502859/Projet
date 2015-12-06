package execrice1;

public abstract class Message {
	/**Les varibles qui deffinisse tout message*/
	protected String type= new String();
	protected int taille;
	protected String contenu= new String();
	
	/**Fonction permettant d'obtenir le type d'un message*/
	public abstract String getType();
	
	/**Fonction permettant d'avoir la taille d'un message*/
	public int getTaille() {
		return this.taille;
	}
	
	/**Fonction permettant de savoir si un  mot cle se trouve dans un  message*/
	public boolean getMotCles(String motCle) {
		if(this.contenu.contains(motCle))
		return true;
		
		else return false;
	}

}
