public class Articulo {
    private float precio;
    public void setPrecio(){
        precio = 3.50F; // la F al final castea el valor de un flotante
    }
    public void setPrecio (float nuevoPrecio){
        precio =nuevoPrecio;
    }
    float getPrecio(){
        return precio;
    }
}
