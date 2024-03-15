public class RegistroDePersona {
    private int id;
    private String nombre1,nombre2,apellido1,apellido2;
    private int edad;

    public RegistroDePersona() {
    }

    public RegistroDePersona(int id, String nombre1, String nombre2, String apellido1, String apellido2, int edad){
        this.id=id;
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String toString(){
        return "Persona{" +
                "id="+ id +
                ", nombres='"+ nombre1 + nombre2 + '\'' +
                ",apellidos='"+ apellido1 + apellido2 + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void  finalizar(){
        System.out.println("Finalizado");
    }
}
