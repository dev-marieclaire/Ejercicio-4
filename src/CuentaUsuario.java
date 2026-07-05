public abstract class CuentaUsuario implements iPlanSuscripcion {
    private String correoelectronic;
    private int mesesactivo;

    // Añadiendo Plan dentro de la clase abstracta.
    iPlanSuscripcion PlanSuscripcion;

    public CuentaUsuario(String correoelectronic, int mesesactivo, iPlanSuscripcion planSuscripcion) {
        this.correoelectronic = correoelectronic;
        this.mesesactivo = mesesactivo;
        PlanSuscripcion = planSuscripcion;
    }

    // Con este metodo luego le agregamos para que llame al ooooootro metodo
    public void ObtenerTotalPagar (){

    }
}
