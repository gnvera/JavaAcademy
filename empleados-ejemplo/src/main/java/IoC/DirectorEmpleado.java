package IoC;

public class DirectorEmpleado implements Empleados {

    // Creación del campo tipo creación informe
    private CreacionInformes informeNuevo;

    private String email;
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    // Creación de constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo){
        this.informeNuevo = informeNuevo;
    }
    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {
        return "Informe creado con el director " + informeNuevo.getInforme();
    }

    //Método init: Ejecutar tareas antes de que el bean esté disponible
    public void metodoInicial(){
        System.out.println("Dentro del método init, aquí irían las tareas a ejecutar antes de que el bean esté listo");
    }

    //Método destroy: Ejecutar tareas despues de que el bean haya sido utilizado
    public void metodoFinal(){
        System.out.println("Dentro del método destroy, aquí irían las tareas a ejecutar después de utilizar el bean");
    }
}
