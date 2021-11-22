package prueba;
import modelo.*;

/**
 * @version 1.0
 * @author AdrianM
 */
public class clsPrincipal {
    //METODOS
    public static void main(String[] args){
        
        clsTaza objTaza1; //declaracion
        objTaza1 = new clsTaza(); //inicializacion o reserva de memoria
        
        String aux = "Cafetería: " + objTaza1.servirCafe();
        imprimir( aux );
        imprimir( objTaza1.despacharCafe() );        
    }
    
    public static void imprimir(String varTexto){
        System.out.println(varTexto);
    }
}
