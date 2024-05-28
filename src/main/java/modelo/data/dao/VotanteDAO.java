package modelo.data.dao;

import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;

public class VotanteDAO {

    public static boolean validarVotante(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(DSL.table("Votantes")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        if(resultados.size()>=1){
            return true;
        }
        else{
            return false;
        }
    }
}
