package ajedrez;

import java.sql.*;
import java.util.Scanner;

public class App {

	String claseParticipante;
	static String nivelParticipante;

	public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/CampeonatoAjedrez";
        String usuario ="root";
        String contrasenia ="";
        GuardarParticipante guardarParticipantes = new GuardarParticipante(url, usuario, contrasenia);

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Jugador o Arbitro?");
            String claseParticipante = sc.nextLine();
            System.out.println();
       
           
            
            if (claseParticipante.equals("Jugador")){
            	 System.out.print("¿En qué nivel desea participar?");
                 nivelParticipante = sc.nextLine();
                 System.out.println();
            	Participante jugador = LeerParticipante.leer(nivelParticipante);
            	guardarParticipantes.guardar(jugador);
            }
        	
            Participante participante = LeerParticipante.leer(nivelParticipante);
            guardarParticipantes.guardar(participante);
            System.out.println("Acción completada con éxito");
            
        } catch (SQLException ex) { // Mantener el control sobre el tipo de error
            System.out.println("SQLException: " + ex.getMessage());

        }
    }
}
