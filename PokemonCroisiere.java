public class PokemonCroisiere extends PokemonAquatique {

    public PokemonCroisiere(String nom, double poids, int nbNageoires) {
        super(nom, poids, nbNageoires);
    }

    @Override
    public double vitesse() {
        return (getPoids() / 25.0 * getNbNageoires()) / 2.0;
    }
}
