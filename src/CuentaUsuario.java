public abstract class CuentaUsuario {
    private String eMail;
    private Integer mesesActivo;

    // Añadiendo Plan dentro de la clase abstracta.
    protected iPlanSuscripcion planSuscripcion;

    public CuentaUsuario(String eMail, Integer mesesActivo, iPlanSuscripcion planSuscripcion)
    {
        this.eMail = eMail;
        this.mesesActivo = mesesActivo;
        this.planSuscripcion = planSuscripcion;
    }

    // Con este metodo luego le agregamos para que llame al ooooootro metodo
    // Luego no, ahora
    public Double ObtenerTotalPagar()
    { PlanSuscripcion.calcularCosto(this.mesesActivo); }

    public String geteMail() {
        return eMail;
    }

    public Integer getMesesActivo() {
        return mesesActivo;
    }
}
