/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Cliente extends Persona{
    private String Direccion;

    public Cliente(String Direccion, String Nombre, String Identificacion, String Telefono) {
        super(Nombre, Identificacion, Telefono);
        this.Direccion = Direccion;
    }
   


    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void ingresar_info_cliente(){ // ingresar informacion y guardarlo en un bin
    FileOutputStream can =null;
    DataOutputStream escrit = null;   
       try
    {
        can = new FileOutputStream("Cliente",true);
        escrit= new DataOutputStream(can);          
        Nombre =JOptionPane.showInputDialog(null,"Digite el nombre de la persona","Informacion del cliente",JOptionPane.QUESTION_MESSAGE);
        
        Identificacion =JOptionPane.showInputDialog(null,"Digite la identificacion de la persona","Informacion del cliente",JOptionPane.QUESTION_MESSAGE);
        Telefono =JOptionPane.showInputDialog(null,"Digite el telefono del cliente","Informacion del Cliente",JOptionPane.QUESTION_MESSAGE);
       
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
    public void leer_cliente(){
    
    FileInputStream fis=null;
    DataInputStream leer=null;
    try
    {
        fis =new FileInputStream("Cliente");
        leer = new DataInputStream(fis);
        while(true)
        {
            Nombre = leer.readUTF();
            Identificacion = leer.readUTF();
            Telefono =leer.readUTF();
          
            
       
            JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+ "\nIdentificacion del trabajador:" +Identificacion+
                                          "\n Telefono: "+ Telefono,
                                          "Datos Personales del cliente" ,JOptionPane.INFORMATION_MESSAGE);    
        }
    }
    catch(FileNotFoundException e)
    {
        System.out.println("El archivo Cliente no existe "+e.getMessage());
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
    public void buscar_cliente(){

    String Id_a_buscar;
    FileInputStream fis=null;
    DataInputStream leer=null;
     Id_a_buscar =JOptionPane.showInputDialog(null,"Digite la identificacion del cliente que quiere buscar","Buscar cliente",JOptionPane.QUESTION_MESSAGE);

     
     try{
        fis =new FileInputStream("Cliente");
        leer = new DataInputStream(fis);
        while(true)
        {
            Nombre = leer.readUTF();
           Identificacion = leer.readUTF();
           Telefono = leer.readUTF();
            Direccion =leer.readUTF();
            
            if (Identificacion.equals(Id_a_buscar)){  //Condicional para comparar String caracter por caracter
            JOptionPane.showMessageDialog(null,"Nombre: "+Nombre+"\n Identificacion del cliente: "+Identificacion+
                                          "\n Direccion del cliente: "+ Direccion+"\nTelefono: "+Telefono,"Datos Personales del cliente" ,JOptionPane.INFORMATION_MESSAGE);    
                                                    } 
        }
    }
    catch(FileNotFoundException e)
    {
        System.out.println("El archivo Cliente no existe "+e.getMessage());
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
