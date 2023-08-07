import java.util.ArrayList;
import java.util.Scanner;
public class CarritoDeCompras implements ElementoVenta {
    @Override
    public void calcularPrecio() {

    }

    ArrayList<String> miArrayList;

    public CarritoDeCompras() {
        miArrayList = new ArrayList<>();

        miArrayList.add("Manzana");
        miArrayList.add("Banana");
        miArrayList.add("Naranja");
    }

public void agregarProductos(){
        Scanner reader = new Scanner(System.in);
        int numero=0;
        System.out.println("Que producto desea agregar");
        System.out.println("precione 1 para manzana, \n"+
                           "precione 2 para banana,  \n"+
                           "precione 3 para Naranja");
        numero = reader.nextInt();

    if(numero == 1){
        String fruta1 = miArrayList.get(0);
    } else if (numero==2) {
        String fruta2 = miArrayList.get(1);
    } else if (numero==3) {
        String fruta3 = miArrayList.get(2);
    }else {
        System.out.println("Numero o caracter no valido");
    };

};
public void eliminarProductos(){
    System.out.println("Que producto desea Eliminar");

};
public void TotalCompra(){};

}
