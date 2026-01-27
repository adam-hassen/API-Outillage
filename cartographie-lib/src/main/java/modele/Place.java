package modele;

public class Place {

    private int numero;
    private TypePlace type;

    public Place() {}

    public Place(int numero, TypePlace type) {
        this.numero = numero;
        this.type = type;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TypePlace getType() {
        return type;
    }

    public void setType(TypePlace type) {
        this.type = type;
    }
}


