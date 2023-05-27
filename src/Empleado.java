public class Empleado extends Persona
{
    private String puestoLaboral;
    public Empleado(String nombre, int edad, String puestoLaboral) {
        super(nombre, edad);
        this.puestoLaboral = puestoLaboral;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "puestoLaboral='" + puestoLaboral + '\'' +
                '}';
    }
}
