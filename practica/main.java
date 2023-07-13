package practica;

public class main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Hella");
        usuario.setApellido("Gutierrez");
        usuario.setEmail("Hella@gmail.com");
        usuario.setPassword("123456");
        System.out.println(usuario.getNombre()+" "+usuario.getApellido()+" "
        +usuario.getEmail()+" "+usuario.getPassword());
    }
}
