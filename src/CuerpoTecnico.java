import java.io.Serializable;

public class CuerpoTecnico extends Datos implements Salario {
    private long idCuerpoTecnico;

    public CuerpoTecnico(String nombre, int edad, String dni, long idCuerpoTecnico) {
        super(nombre, edad, dni);
        this.idCuerpoTecnico = idCuerpoTecnico;
    }

    public long getIdCuerpoTecnico() {
        return idCuerpoTecnico;
    }

    public void setIdCuerpoTecnico(long idCuerpoTecnico) {
        this.idCuerpoTecnico = idCuerpoTecnico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cuerpo Tecnico =" + idCuerpoTecnico ;

    }

    @Override
    public void SubidaSueldo() {
        System.out.println("SubidaSueldo al cuerpoTecnico de un 2.5% ");
    }
}
