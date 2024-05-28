package modelo.data.dao;

import modelo.Producto;
import modelo.data.Candidato;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.DSL;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class CandidatoDAO {

    public static boolean validarExistenciaCandidato(DSLContext query,String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Candidatos")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        if(resultados.size()>=1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void registrarCandidato(DSLContext query, Candidato candidato){
        Table tablaCandidatos = table(name("Candidatos"));
        Field[] columnas = tablaCandidatos.fields("Nombre","PartidoPolitico","Cargo");
        query.insertInto(tablaCandidatos, columnas[0], columnas[1],columnas[2])
                .values(candidato.getNombre(),candidato.getPartidoPolitico(),candidato.getCargo())
                .execute();
    }
}
