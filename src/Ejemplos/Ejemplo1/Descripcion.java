/**
 * Las clases son plantillas para crear objetos.
 * Una clase puede contener atributos (características) y métodos (comportamientos).
 * En este ejemplo, la clase Descripcion tiene cuatro atributos: fabricante, modelo, color y año.
 * No tiene métodos definidos, pero podríamos agregar métodos para manipular estos atributos si fuera necesario.
 */

package Ejemplos.Ejemplo1;

public class Descripcion {

    String fabrticante;
    String modelo;
    String color;
    int año;

    /**
     * Método que devuelve una descripción detallada del automóvil.
     * @return Una cadena con los detalles del automóvil.
     */
    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Auto fabricacte = " + this.fabrticante + "\n");
        sb.append("Modelo = " + this.modelo + "\n");
        sb.append("Color = " + this.color + "\n");
        sb.append("Año = " + this.año + "\n");

        return sb.toString();

    }
}
