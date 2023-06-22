/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;
import Data.*;
import javax.swing.JOptionPane;
import GUI.*;
/**
 *
 * @author LENOVO
 */
public class Cine {

  numeroasientosyfecha num1 =new numeroasientosyfecha();
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sala_cine salaCine = new Sala_cine();

        boolean cerrar = false;
        while (!cerrar) {
            String opcion = JOptionPane.showInputDialog(null, "Menú:\n" +
                    "1. Mostrar cartelera\n" +
                    "2. Comprar entradas\n" +
                    "3. Mostrar estadísticas\n" +
                    "4. Agregar pelicula(admin)\n"+
                    "5. Eliminar Pelicula(admin)\n"+
                    "6. Cerrar");

            switch (opcion) {
                  case "1":
                    salaCine.mostrarCartelera();
                    break;
                case "2":
                    salaCine.venderEntradas();
                    break;
                case "3":
                    salaCine.mostrarEstadisticas();
                    break;
                case "4":
                    // Aquí puedes verificar las credenciales del administrador antes de llamar al método agregarPelicula()
                    salaCine.agregarPelicula();
                    break;
                case "5":
                    // Aquí puedes verificar las credenciales del administrador antes de llamar al método eliminarPelicula()
                    salaCine.eliminarPelicula();
                    break;
                case "6":
                    cerrar = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
    }
   

