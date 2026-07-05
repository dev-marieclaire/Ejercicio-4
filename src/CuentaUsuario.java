public abstract class CuentaUsuario implements iPlanSuscripcion {
    private String eMail;
    private Integer mesesActivo;

    // Añadiendo Plan dentro de la clase abstracta.
    iPlanSuscripcion planSuscripcion;

    public CuentaUsuario(String eMail, Integer mesesActivo, iPlanSuscripcion planSuscripcion)
    {
        this.eMail = eMail;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }

    // Con este metodo luego le agregamos para que llame al ooooootro metodo
    // Luego no, ahora
    public void ObtenerTotalPagar()
    { PlanSuscripcion.calcularCosto(); }
}
