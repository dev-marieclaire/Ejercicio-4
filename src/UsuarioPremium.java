public class UsuarioPremium extends CuentaUsuario
{
    UsuarioBasico(String mail, Integer mesesActivo)
    { super(mail, mesesActivo, new PlanPremium()); }
}