package Modelo;

public abstract class Ave extends Animal {

    private boolean ponedoras;

    public Ave( int edad, boolean ponedoras) {
        super(edad);
        this.ponedoras = ponedoras;
    }

}
