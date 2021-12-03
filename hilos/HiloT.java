package hilos;
/**
* @author Brigada 4
*/
public class HiloT extends Thread{
  /*
  * @param nombre, Recibe una cadena de caracteres
  */
  public HiloT(String nombre){
    super(nombre);
  }
/*
* Metodo run

*/
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("Iteración "+i+" del "+getName());
    }
    System.out.println("Termina el hilo "+getName());
  }


}