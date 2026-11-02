package br.com.local.ecotech;
import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
     /*
    Método de conexao com SQL SERVER
    Local ou
    Nuvem no somee.com
     */

    public static Connection conectar() {
        //Objeto de conexao
        Connection conn = null;
        try {
//            Adicionar Política de criacao de thread
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("net.sourceforge.jtds.jdbc.Driver");

            // Conexão com o SQL Server: preencha com os dados do seu banco
            conn= DriverManager.getConnection("jdbc:jtds:sqlserver://SEU_SERVIDOR;"+
                    "databaseName=SEU_BANCO;user=SEU_USUARIO;password=SUA_SENHA;");
            System.out.println("Conectado com sucesso ao SQL Server!");

        } catch (SQLException e) { // SQLException

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
