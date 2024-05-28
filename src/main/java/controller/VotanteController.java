package controller;

import modelo.data.Candidato;
import modelo.data.DBConnector;
import modelo.data.DBGenerator;
import modelo.data.Votante;
import modelo.data.dao.CandidatoDAO;
import modelo.data.dao.VotanteDAO;
import org.jooq.DSLContext;

public class VotanteController {

    public static boolean validarVotante(String rut) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Elecciones");
        if (!VotanteDAO.validarVotante(query, "Rut", rut)) {
            DBConnector.closeConnection();
            return true;
        }
        else
            return false;
    }
}
