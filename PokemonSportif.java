public class PokemonSportif extends PokemonTerrestre{
    private double frequence;

    public PokemonSportif(String nom,double poids,int nbPattes,double taille,double frequence){
        super(nom,poids,nbPattes,taille);
        this.frequence = frequence;
    }

    public String toString(){
        String pref = super.toString();
        return  pref + " ma frequence cardiaque est de " + frequence + " pulsation a la minute" ;
    }
}
