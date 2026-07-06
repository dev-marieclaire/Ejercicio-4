
import java.util.Scanner;

public class UI
{
    public static void menu()
    {
        int opc = 0;
        boolean menu=true;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("======MENU======");
            System.out.println("[0] Salir");
            System.out.println("[1] Registrar Usuario Basico");
            System.out.println("[2] Registrar Usuario Estandar");
            System.out.println("[3] Registrar Usuario Premium");
            System.out.println("[4] Imprimir reporte");
            System.out.print(">> ");
            opc=teclado.nextInt();
            switch(opc){
                case 1 -> {
                    System.out.print("Ingrese el correo:\n>> ");
                    String mail = teclado.next();
                    System.out.print("Ingrese la cantidad de meses activo:\n>> ");
                    Integer meses = teclado.nextInt();
                    PlataformaStreaming.registrarUsuario((CuentaUsuario) new UsuarioBasico(mail, meses));
                }
                case 2 -> {
                    System.out.print("Ingrese el correo:\n>> ");
                    String mail = teclado.next();
                    System.out.print("Ingrese la cantidad de meses activo:\n>> ");
                    Integer meses = teclado.nextInt();
                    PlataformaStreaming.registrarUsuario((CuentaUsuario) new UsuarioEstandar(mail, meses));
                }
                case 3 -> {
                    System.out.print("Ingrese el correo:\n>> ");
                    String mail = teclado.next();
                    System.out.print("Ingrese la cantidad de meses activo:\n>> ");
                    Integer meses = teclado.nextInt();
                    PlataformaStreaming.registrarUsuario((CuentaUsuario) new UsuarioPremium(mail, meses));
                }

                case 4 ->  PlataformaStreaming.Reporte();

                case 0 -> {
                    System.out.println("Cerrando programa...");
                    menu = false;
                }
            }
        }while(menu == true);
    }
}