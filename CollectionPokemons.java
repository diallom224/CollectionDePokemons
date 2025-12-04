
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionPokemons implements Iterable<Pokemon> {
    private final ArrayList<Pokemon>collection;

    // Constructeur
    public CollectionPokemons() {
        collection = new ArrayList<>();
    }

    // Ajouter un Pokémon à la collection
    public void ajouterPokemon(Pokemon p) {
        this.collection.add(p);
    }

    /**
     * @return la moyenne des vitesses des Pokémon si la liste n'est pas vide
     */
    public double getVitesseMoyenne() {
        if (collection.isEmpty()) {
            return 0.0;
        }

        double sommeVitesse = 0.0;
        for (Pokemon p : collection) {
            sommeVitesse += p.vitesse();
        }
        return sommeVitesse / collection.size();
    }

    /**
     * @return la vitesse moyenne des PokémonSportif uniquement
     */
    public double getVitesseMoyennePokemonSportif() {
        double sommeVitesse = 0.0;
        int nbPokemonSportif = 0;

        for (Pokemon p : collection) {
            if (p instanceof PokemonSportif) {
                nbPokemonSportif++;
                sommeVitesse += p.vitesse();
            }
        }

        if (nbPokemonSportif == 0) {
            return 0.0;
        }

        return sommeVitesse / nbPokemonSportif;
    }

    @Override
    public Iterator<Pokemon> iterator() {
        return collection.iterator();
    }
}
