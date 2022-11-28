package Modelo;

public abstract class Animal {

    private static int contador= 0;

    private int edad;

    private int id;

    public Animal(int edad) {

        this.edad = edad;
        Animal.contador ++; // contador no lleva this por ser una variable de clase, no un objeto
        this.id = Animal.contador;


    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
