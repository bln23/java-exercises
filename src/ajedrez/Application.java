package ajedrez;

import java.sql.*;


public class Application {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/CampeonatoAjedrez";
        String usuario="root";
        String contrasenia="";
        GuardarParticipantes guardarParticipantes = new GuardarParticipantes(url, usuario, contrasenia);

        try {
            Participante participante = LeerParticipante.leer();
            guardarParticipantes.guardar(participante);
            System.out.println("Acción completada con éxito");
        } catch (SQLException ex) { // Mantener el control sobre el tipo de error
            System.out.println("SQLException: " + ex.getMessage());

        }
    }
}
