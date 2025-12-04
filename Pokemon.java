
public abstract class Pokemon {
    private String _nom;
    private double _poids;

    public Pokemon(String _nom, double _poids) {
        this._nom = _nom;
        this._poids = _poids;
    }

    public  abstract double vitesse();


    public String toString(){
        return "je suis le Pokemon "+ _nom + "mon poids est de "+_poids;
    }

    protected double getPoids(){return _poids;}

}