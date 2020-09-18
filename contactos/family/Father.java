package contactos.family;

public class Father {

  protected String nombreCompleto;
  protected int edad;

  public Father(String nombreCompleto, int edad){
    
    this.nombreCompleto = nombreCompleto;
    this.edad = edad;

  }

  public String getNombreCompleto(){
      return nombreCompleto;
  }

  public int getEdad(){
      return edad;
  }

  public String mostrarDatos(){
      return "Nombre Completo: "+nombreCompleto+"\nEdad: "+edad;
  }

}
