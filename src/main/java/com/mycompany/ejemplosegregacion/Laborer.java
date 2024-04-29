/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosegregacion;

/**
 *
 * @author jhenriquez
 */
// Clase para un obrero que solo trabaja

class Laborer implements Workable {
    @Override
    public void work() {
        System.out.println("El obrero está trabajando.");
    }
}
