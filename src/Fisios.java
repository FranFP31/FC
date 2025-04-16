public class Fisios extends Datos{
    private long numColegiado;
    private int aniosExp;

    public Fisios(String nombre, int edad, String dni, long numColegiado, int aniosExp) {
        super(nombre, edad, dni);
        this.numColegiado = numColegiado;
        this.aniosExp = aniosExp;
    }

    public long getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(long numColegiado) {
        this.numColegiado = numColegiado;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n Numero de Colegiado=" + numColegiado +
                "\n Años de Exp=" + aniosExp;
    }
}
