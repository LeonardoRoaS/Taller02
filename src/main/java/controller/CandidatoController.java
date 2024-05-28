package controller;

import modelo.Producto;
import modelo.data.Candidato;
import modelo.data.DBConnector;
import modelo.data.DBGenerator;
import modelo.data.dao.CandidatoDAO;
import modelo.data.dao.ProductoDAO;
import org.jooq.DSLContext;

public class CandidatoController {

    public static boolean registrarCandidato(String nombre, String partido, String cargo) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Elecciones");
        if (!CandidatoDAO.validarExistenciaCandidato(query, "Nombre", nombre)) {
            Candidato candidato = new Candidato(nombre, partido, cargo);
            CandidatoDAO.registrarCandidato(query, candidato);
            DBConnector.closeConnection();
            return true;
        }
        else
            return false;
    }
}
