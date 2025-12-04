public class PokemonCasanier extends PokemonTerrestre{
    private double nbHTele;
    public PokemonCasanier(String nom,double poids,int nbPattes,double taille,double nbHTele){
        super(nom,poids,nbPattes,taille);
        this.nbHTele = nbHTele;
    }

    @Override
    public String toString() {
        String pref = super.toString();
        return pref + "je regarde la télé " + nbHTele + " heures par jour";
    }
}
