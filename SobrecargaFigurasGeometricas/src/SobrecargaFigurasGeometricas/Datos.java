/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SobrecargaFigurasGeometricas;
import javax.swing.JOptionPane;

public class Datos {
    private SobrecargaFigurasGeometricas calculadora;
    public Datos() {
        calculadora = new SobrecargaFigurasGeometricas();
    }
    public void ejecutarPrograma() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú de Figuras Geométricas\n" +
                "1. Calcular area de un círculo\n" +
                "2. Calcular area de una figura cuadrada, triangular o rectangular\n" +
                "3. Calcular area de una esfera\n" +
                "4. Salir\n" +
                "Ingrese su seleccion:");
            switch (opcion) {
                case "1":
                    double radioCirculo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:\n"));
                    calculadora.Area(radioCirculo);
                    calculadora.Resultado();
                    break;
                case "2":
                    String figura = JOptionPane.showInputDialog("seleciona la figura que desea calcular\n" + 
                    "1.-Cuadrado\n" + 
                    "2.-Triangulo\n" +
                    "3.-Rectangulo:\n");
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado de la figura:\n"));
                    calculadora.Area(lado, figura);
                    calculadora.Resultado();
                    break;
                case "3":
                    double radioEsfera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la esfera:\n"));
                    calculadora.Area(radioEsfera, true);
                    calculadora.Resultado();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.\n");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.\n");
            }
        }
    }
}