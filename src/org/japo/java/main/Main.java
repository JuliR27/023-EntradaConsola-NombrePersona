/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        String nombre;
        try {
            System.out.println("Introduzca su Nombre: ");
            nombre = SCN.nextLine();
        } catch (Exception e) {
            System.out.println("Error de Nombre");
        }
    }
}
