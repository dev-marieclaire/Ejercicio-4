public class PlanBasico implements iPlanSuscripcion {
    public Double calcularCosto(Integer meses)
    { return (Double) (5.0 * meses); }
}