/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author LENOVO
 */
public class Trabajador extends Persona{
     public Trabajador(String Nombre, String Identificacion, String Telefono) {
        super(Nombre, Identificacion, Telefono);
      
    }


    
      public void ingresar_info_Trabajador(){ // ingresar informacion y guardarlo en un bin
    FileOutputStream can =null;
    DataOutputStream escrit = null;   
       try
    {
        can = new FileOutputStream("Trabajador",true);
        escrit= new DataOutputStream(can);          
        Nombre =JOptionPane.showInputDialog(null,"Digite el nombre del trabajador","Informacion del trabajador",JOptionPane.QUESTION_MESSAGE);
        Identificacion =JOptionPane.showInputDialog(null,"Digite la identificacion de la persona","Informacion del trabajador",JOptionPane.QUESTION_MESSAGE);
        Telefono =JOptionPane.showInputDialog(null,"Digite el telefono del Trabajador","Informacion del trabajador",JOptionPane.QUESTION_MESSAGE);
        
        escrit.writeUTF(Nombre);
        escrit.writeUTF(Identificacion);
        escrit.writeUTF(Telefono);
       
         
    }
                      catch(FileNotFoundException e)
    {
        System.out.println(e.getMessage());
    }
    catch(IOException e)
    {
       System.out.println(e.getMessage());
    }
       
    finally
    {
        try
        {
            if (can != null)
            {
                can.close();
            }
            if (escrit != null)
            {
                escrit.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    } 
  
}
      public void leer_Trabajador(){
    
    FileInputStream fis=null;
    DataInputStream leer=null;
    try
    {
        fis =new FileInputStream("Trabajador");
        leer = new DataInputStream(fis);
        while(true)
        {
            Nombre = leer.readUTF();
            Identificacion = leer.readUTF();
            Telefono =leer.readUTF();
          
            
       
            JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+ "\nIdentificacion del trabajador:" +Identificacion+
                                          "\n Telefono: "+ Telefono,
                                          "Datos Personales del trabajador" ,JOptionPane.INFORMATION_MESSAGE);    
        }
    }
    catch(FileNotFoundException e)
    {
        System.out.println("El archivo Trabajador no existe "+e.getMessage());
    }
    catch(EOFException e)
    {
        System.out.println("Fin de Archivo");
    }
    catch(IOException e1)
    {
        System.out.println(e1.getMessage());
    }
      
    finally
    {
        try
        {
            if (fis!= null)
            {
                fis.close();
            }
            if(leer!=null)
            {
                leer.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
              
        }
    }
}
      public void buscar_Trabajador(){

    String Id_a_buscar;
    FileInputStream fis=null;
    DataInputStream leer=null;
     Id_a_buscar =JOptionPane.showInputDialog(null,"Digite la identificacion del trabajador que quiere buscar","Buscar Contacto",JOptionPane.QUESTION_MESSAGE);

     
     try{
        fis =new FileInputStream("Trabajador");
        leer = new DataInputStream(fis);
        while(true)
        {
            Nombre = leer.readUTF();
            Identificacion = leer.readUTF();
           Telefono = leer.readUTF();
            if (Identificacion.equals (Id_a_buscar)){  //Condicional para comparar String caracter por caracter
            JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+"\n Identificacion del Trabajador: "+Identificacion
                                          ,"Datos Personales del Trabajador"+"Telefono: "+Telefono ,JOptionPane.INFORMATION_MESSAGE);    
                                                    } 
        }
    }
    catch(FileNotFoundException e)
    {
        System.out.println("El archivo Trabajador no existe "+e.getMessage());
    }
    catch(EOFException e)
    {
        System.out.println("Fin de Archivo");
    }
     
    catch(IOException e1)
    {
        System.out.println(e1.getMessage());
    }
      
    finally
         
    {
        try
        {
            if (fis!= null)
            {
                fis.close();
            }
            if(leer!=null)
            {
                leer.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
              
        }
    }
}
}
