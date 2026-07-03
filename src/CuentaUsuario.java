public abstract class CuentaUsuario {
    private String correoelectronic;
    private int mesesactivo;

    // Añadiendo Plan dentro de la clase abstracta.
    iPlanSuscripcion PlanSuscripcion;

    public CuentaUsuario(String correoelectronic, int mesesactivo) {
        this.correoelectronic = correoelectronic;
        this.mesesactivo = mesesactivo;
    }
}
