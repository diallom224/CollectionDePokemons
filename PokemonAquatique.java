public abstract class PokemonAquatique extends Pokemon{
    private  int nbNageoires;
    public PokemonAquatique(String nom,double poids,int nbNageoires){
        super(nom,poids);
        this.nbNageoires = nbNageoires;
    }


    public double vitesse(){
        return getPoids()/25 * nbNageoires;
    }

    public int getNbNageoires() {
        return nbNageoires;
    }

    @Override
    public String toString() {
        String prefix = super.toString();
        return prefix + "ma vitesse est de " + vitesse() + " km/h, et j'ai " + nbNageoires + " nageoires.";
    }
}
