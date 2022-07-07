package pe.edu.upeu.dao;

import java.io.ObjectInput;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class productoDao extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util=new UtilsX();

    ProductoTO pTo;
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_CATEGORIA="Categoria.txt";
    final static String TABLA_MODELO="Modelo.txt";

    /**
     * 
     */
    public void crearProducto(){
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        pTo=new ProductoTO();
        String idPro=generarId(leerA,0,"p",1);
        pTo.setIdProducto(idPro);
        pTo.setNombreProd(leerT.leer("", "Nombre Producto"));
        mostrarCategoria();
        pTo.setIdCat(leerT.leer("","Selecione una categoria"));
        mostrarModelo();
        pTo.setIdMod(leerT.leer("","Selecione un modelo"));
        pTo.setPrecioUnid(leerT.leer(0.0,"Ingrese el precio Unitario"));
        pTo.setUtilidad(leerT.leer(0.0, "Ingrese la unidad"));
        pTo.setUnidMed(leerT.leer("","Unidad Medida"));
        pTo.setStock(leerT.leer(0,"Ingrese Cantida"));
        pTo.setCantMayor(leerT.leer(0,"Ingrese cantidad para descuento"));
        leerA=new LeerArchivo(TABLA_PRODUCTO);
        agregarContenido(leerA, pTo);

    }

    public void mostrarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object[][] dataC=listarContenido(leerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.println(dataC[i][0]+"="+dataC[i][1]+",");
        }
        System.out.println("");
    }

    public void mostrarModelo() {
        leerA=new LeerArchivo(TABLA_MODELO);
        Object[][] dataC=listarContenido(leerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.println(dataC[i][0]+"="+dataC[i][1]+",");
        }
        System.out.println("");
    }
}
