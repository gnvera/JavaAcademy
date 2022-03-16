package IoC;

public class JefeEmpleado implements Empleados{

    private CreacionInformes informeNuevo;
    public JefeEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas(){
        return "Gestiono las cuestiones relativas a mis empleados de sección";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el Jefe con arreglos " + informeNuevo.getInforme();
    }
}
