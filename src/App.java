public class App {
    public static void main(String[] args) throws Exception {
        Persona individuo = new Persona(27,"Adriana",6778888);

        
        System.out.println(individuo.getEdad() + " " + individuo.getNombre()+ " " + individuo.getTelefono());
    }
}
