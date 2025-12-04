//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Construction de pokemonSportif : ");
        PokemonSportif pokemonSportif = new PokemonSportif("Pikachu",18,2,0.85,120);
        System.out.println(pokemonSportif.toString());

        System.out.println("Construction de pokemonCasanier: ");
        PokemonCasanier pokemoncasanier = new PokemonCasanier("Salameche",12,2,0.65,8);
        System.out.println(pokemoncasanier.toString());

        System.out.println("Construction de PokemonMer: ");
        PokemonMer pokemonMer = new PokemonMer("Rondoudou",45,2);
        System.out.println(pokemonMer.toString());

        System.out.println("Construction de PokemonCroisiere : ");
        PokemonCroisiere pokemonCroisiere = new PokemonCroisiere(" Bulbizarre ",21,2);
        System.out.println(pokemonCroisiere.toString());


        CollectionPokemons collectionPokemons = new CollectionPokemons();
        collectionPokemons.ajouterPokemon(pokemonSportif);
        collectionPokemons.ajouterPokemon(pokemoncasanier);
        collectionPokemons.ajouterPokemon(pokemonCroisiere);

        System.out.println("affiche de la collection de pokemons : ");
        for (Pokemon p : collectionPokemons) {
            System.out.println(p);
        }

    }
}