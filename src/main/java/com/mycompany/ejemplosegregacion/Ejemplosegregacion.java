/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosegregacion;

/**
 *
 * @author jhenriquez
 * En este ejemplo, hemos segregado la interfaz Worker en dos
 * interfaces más específicas: Workable para los trabajadores que solo trabajan y 
 * Eatable para los trabajadores que solo comen. Luego, tenemos clases concretas
 * como Laborer y OfficeWorker que implementan estas interfaces según sus necesidades.

Este enfoque sigue el ISP al asegurarse de que las interfaces sean cohesivas 
* y tengan un único motivo de cambio. 
* Cada interfaz representa un conjunto 
* coherente de comportamiento y las clases 
* solo implementan las interfaces que necesitan, 
* evitando así la dependencia de funcionalidad innecesaria.
 */
public class Ejemplosegregacion {

    public static void main(String[] args) {
        // Crear un obrero y hacerlo trabajar
        Workable laborer = new Laborer();
        laborer.work();
        // Crear un oficinista y hacerlo comer
        Eatable officeWorker = new OfficeWorker();
        officeWorker.eat();
    }
  /*  En este método main, creamos instancias de Laborer y OfficeWorker y 
    las asignamos a variables de tipo Workable y Eatable, respectivamente.
    Luego, llamamos a los métodos work() y eat() en estas variables para probar
    el comportamiento de las clases Laborer y OfficeWorker.
Con este código, podemos verificar que las clases y las interfaces 
    funcionan correctamente según lo esperado. La segregación 
    de interfaces nos permite tener una mayor flexibilidad al definir 
    comportamientos específicos para diferentes tipos de trabajadores.
*/
}
