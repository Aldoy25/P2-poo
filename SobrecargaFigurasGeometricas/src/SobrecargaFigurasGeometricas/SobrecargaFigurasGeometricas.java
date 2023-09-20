/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SobrecargaFigurasGeometricas;

public class SobrecargaFigurasGeometricas {
    private double resultado;

    public SobrecargaFigurasGeometricas() {
        resultado = 0.0;
    }
    public void Area(double radio) {
        resultado = Math.PI * radio * radio;
    }
    public void Area(double lado, String figura) {
        switch (figura) {
            case "1":
                resultado = lado * lado;
                break;
            case "2":
                resultado = (lado * lado) / 2.0;
                break;
            case "3":
                resultado = 2.0 * lado * lado;
                break;
        }
    }
    public void Area(double radio, boolean esfera) {
        if (esfera) {
            resultado = 4.0 * Math.PI * radio * radio;
        }
    }
    public void Resultado() {
        System.out.printf("El área es: %05.5f%n", resultado);
    }
}
