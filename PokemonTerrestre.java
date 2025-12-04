public abstract class PokemonTerrestre extends Pokemon {
    private int nbPattes;
    private double taille;

    public PokemonTerrestre(String nom, double poids,int nbPattes, double taille){
        super(nom,poids);
        this.nbPattes = nbPattes;
        this.taille = taille;
    }

    @Override
    public  double vitesse(){return nbPattes*taille*3;}

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + " ma vitesse est de " + vitesse() + " j'ai " + nbPattes + " pattes, ma taille est de " + taille + " m.";
    }


}