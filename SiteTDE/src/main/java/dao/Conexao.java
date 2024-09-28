package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String bdUsuario;
    private String bdsenha;
    private String bdHost;

    //Acesso com o banco
    private static Conexao conexao;
    //Cuidar parar não pegar outros além do java.sql
    private Connection conn;

    //Dados do MySQL
    private Conexao() {
        this.bdUsuario = "root";
        this.bdsenha = "@1234";
        //Porta e Banco
        this.bdHost = "jdbc:mysql://localhost:3306/form?allowPublicKeyRetrieval=true&useSSL=false";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conexão com banco de dados
            this.conn = DriverManager.getConnection(bdHost, bdUsuario, bdsenha);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //método para controlar instâncias
    public static Conexao getConexao() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao;
    }

    public Connection getConnection() {
        try {
            if (this.conn == null || this.conn.isClosed()) {
                this.conn = DriverManager.getConnection(bdHost, bdUsuario, bdsenha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.conn;
    }

}