/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplosegregacion;

/**
 *
 * @author jhenriquez
 */
// Clase para un oficinista que solo come
class OfficeWorker implements Eatable {
    @Override
    public void eat() {
        System.out.println("El oficinista está comiendo en el almuerzo.");
    }
}
