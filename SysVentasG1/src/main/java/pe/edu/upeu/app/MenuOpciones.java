package pe.edu.upeu.app;

import java.io.Console;

import pe.edu.upeu.dao.CategoriDao;
import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.dao.ModeloDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.productoDao;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();
    UsuarioTO user;

    public void login() {
        System.out.println("***********Validar sus Credenciales***********");
        user=new UsuarioTO();
        user.setUsuario(leerT.leer("", "Ingrese su Usuario"));
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] clavex=cons.readPassword();
        user.setClave(String.valueOf(clavex));
        if (new UsuarioDao().longinvalidar(user.getUsuario(),user.getClave())) {
            menuPrincial();
        }else{
            System.out.println("Intente Otra vez!");
            login();
        }
    }

    public void menuPrincial() {
        System.out.println("********************Bienvenidos al Sistema de Ventas******************");
        String valorX="1=Registrar Usuario\n"+"2=Registrar Categoria\n"+
                "3=Registrar cliente\n4=Registrar Modelo\n5=Crear Producto";
        int opciones=0;
        do {
            switch (opciones) {
                case 1: new UsuarioDao().crearUsuario(); break;
                case 2: new CategoriDao().crearCategoria(); break;
                case 3: new ClienteDao().crearCliente();break;
                case 4: new ModeloDao().crearModelo();break;
                case 5: new productoDao().crearProducto();break;
                default: System.out.println("Opcion erronea!"); break;
            }
            char continuar=leerT.leer("", "Desea continuar? S=si/N=no")
                            .toLowerCase()
                            .charAt(0)=='s'?'s':'n';
            if (continuar=='s') {
                opciones=leerT.leer(0, "Eliga la siguiente operacion:\n"+valorX);
            }else{opciones=0;}

        } while (opciones!=0);
        
    }

}
