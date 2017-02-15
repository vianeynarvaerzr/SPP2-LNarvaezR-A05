/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a05;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     menu();
    }
    public static void menu(){
        Solicitanombre("tu nombre");
        Solicitaredad("tu edad");
        Solicitarpeso("tu peso");
        Solicitarmatricula("tu matricula");
        
    }
    static String Solicitanombre(String mensaje){
        Scanner teclado =new Scanner(System.in);
        String nombre="";
        boolean flag;
        do{
            System.out.println("Introduce"+ mensaje);
            try{
                nombre=teclado.nextLine();
                flag=true;
            } catch(Exception ex){
                flag=false;
                System.out.println("No escribió su nombre");
                teclado.nextLine();
                
        }
            }while(flag==false);
        return nombre;   
        }
    
    static double Solicitarpeso(String mensaje){
        Scanner teclado =new Scanner(System.in);
        double peso=0;
        boolean flag;
        do{
            System.out.println("Introduce"+mensaje);
         try{
            peso= teclado.nextDouble();
            flag=true;
        } catch(Exception ex){
                flag=false;
                System.out.println("El dato insertado no es un número");
                teclado.nextLine();
                
}
         }while(flag==false);
        return peso;
    }
static long Solicitarmatricula(String mensaje){
        Scanner teclado=new Scanner(System.in);
        long matricula=0;
        boolean flag;
        do{
            System.out.println("Introduce"+mensaje);
         try{
             matricula=teclado.nextLong();
             flag=true;
         }catch(Exception ex){
             flag=false;
             System.out.println("El dato insertado no es correcto");
             teclado.nextLine();
         }
         }while (flag==false);
         
        return matricula;
    }
        static int Solicitaredad(String mensaje){

        Scanner teclado =new Scanner(System.in);
        int edad=0;
        boolean flag;
        do{
            System.out.println("Introduce"+mensaje);
         try{
             edad=teclado.nextInt();
             flag=true;
         } catch (Exception ex){
             flag=false;
             System.out.println("El dato insertado no es correcto");
             teclado.nextLine();
         }
        }while (flag==false);
        return edad;
        }
}