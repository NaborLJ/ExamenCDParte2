package examenfinalparte2;

import javax.swing.JOptionPane;

public class Principal {

    public static boolean p = false;

    public static void main(String arg[]) {
        /**
         * JPane para ingresar digitos, el digito que introduzcamos se le asignara a la variable dig.
         * @param dig Variable de tipo int, recogerá el digito introducido para operar con el.
         */
        int digit = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de digitos correcto (mayor que 0): "));;
        int numDigit = 0;
        /**
         * Condición if que retornará un mensaje de error en caso de que el número introducido previamente sea menor a 1.
         * En caso de que el digito sea 1 o mayor realizará el bucle for que precede al if.
         */
        if (digit <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        /**
         * Bucle que recorrerá la variable int i mientras sea menor o igual a 99999, cada vuelta de bucle sumará al contador i++.
         * La condición while dentro del bucle marca que cuando  variable aux sea distinta a 0 realice la operacion aux/10, asigne el valor a aux y añada una vuelta al contador.
         * @param aux Variable de tipo int que le es asginado como valor la variable i.
         * @param contador Variable de tipo int inicializada en 0.
         */
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
        /**
         * Se le asigna a la variable ndig el valor de la variable contador.
         * Ahora se usará la variable ndig como la variable contador.
         * A partir de este punto comienzan las condiciones que ha de pasar el digito introducido para ver si es mostrado por pantalla o no.
         */
            numDigit = contador;

            if (numDigit == digit) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
