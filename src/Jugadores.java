public class Jugadores extends Datos implements Salario{
    private int dorsal;
    private int numGoles;
    public Jugadores(String nombre, int edad, String dni, int dorsal, int numGoles) {
        super(nombre, edad, dni);
        this.dorsal = dorsal;
        this.numGoles = numGoles;
    }
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDorsal=" + dorsal +
                "\n Goles=" + numGoles ;
    }

    @Override
    public void SubidaSueldo() {
        System.out.println("SubidaSueldo a los Jugadores  de un 5% ");
    }
}
