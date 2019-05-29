package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Reserva3 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// reserva3
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.query(Var.valueOf("app.entity.Reserva"),Var.valueOf("select r, r.livro.isbn from Reserva r"));
   }
 }.call();
}

}

