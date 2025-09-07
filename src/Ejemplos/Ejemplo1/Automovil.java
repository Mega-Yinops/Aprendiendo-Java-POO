/**
 * Clase que representa un automóvil y muestra sus detalles.
 * Una clase es una estructura que agrupa datos y comportamientos relacionados.
 */
package Ejemplos.Ejemplo1;

public class Automovil {
    public static void main(String[] args) {
        Descripcion auto1 = new Descripcion();
        auto1.fabrticante = "Toyota";
        auto1.modelo = "Corolla";
        auto1.color = "Rojo";
        auto1.año = 2020;

        Descripcion auto2 = new Descripcion();
        auto2.fabrticante = "Seat";
        auto2.modelo = "Ibiza";
        auto2.color = "Blanco";
        auto2.año = 2018;

        System.out.println(auto1.detalle());
        System.out.println(auto2.detalle());
    }
}

