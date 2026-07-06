void main()
{
    int opc = 0;
    boolean menu=true;
    Scanner teclado = new Scanner(System.in);
    do{
        System.out.println("======MENU======");
        System.out.println("[1] Registrar Usuario");
        System.out.println("[2] Reporte de Consola");
        System.out.println("[3] Salir");
        opc=teclado.nextInt();
        switch(opc){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.out.println("Cerrando programa...");
                menu = false;
                break;
        }
    }while(menu == true);

}