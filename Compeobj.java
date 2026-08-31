public class Compeobj {
    String Nombre;
    int Edad;
    String Categoria;
    double ResultadoObt;

    public Compeobj(String nombre, int edad, String categoria, double resultadoObt) {
        Nombre = nombre;
        Edad = edad;
        Categoria = categoria;
        ResultadoObt = resultadoObt;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public double getResultadoObt() {
        return ResultadoObt;
    }

    public void setResultadoObt(double resultadoObt) {
        ResultadoObt = resultadoObt;
    }
    

    
}
