import java.util.ArrayList;

public class PlataformaStreaming {
    private ArrayList<CuentaUsuario> listaUsuarios;

    public PlataformaStreaming(ArrayList<CuentaUsuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void registraruSUARIO(CuentaUsuario usuario){
        listaUsuarios.add(usuario);
    }

    public void Reporte (){
        double dineroTotal = 0.0;

        System.out.println("======= REPORTE DE CUENTAS DE USUARIO =======");
        for (CuentaUsuario u : listaUsuarios){
            double totalCuenta = u.ObtenerTotalPagar();
            dineroTotal = dineroTotal + totalCuenta;

            System.out.println("Email: "+u.geteMail());
            System.out.println("Meses Activo: "+u.getMesesActivo());
            System.out.println("Total a Pagar "+totalCuenta);
        }

        System.out.println("===========================");
        System.out.println("Dinero total recaudado: "+dineroTotal);
    }
}
