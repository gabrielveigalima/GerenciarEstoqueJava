package ultilitarios;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/estoque";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean Conecta(){
        boolean result = true;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null,"Conectou!");

        }
        catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
            result = false;
        }
        catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null,"Deu erro no conexão "+Fonte);
            result = false;
        }
        
        return result;
    }
    
    public void Desconecta(){
        boolean result = true;
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null,"Banco fechado!");
        }
        catch(SQLException fecha){
            JOptionPane.showMessageDialog(null,"Não foi possível "+
                    "fechar o banco de dados: "+fecha);
            result = false;
        }
        
    }
    
    public void executasql(String sql){
        try{
            statement = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null, sqlex.getMessage());
        }
    }
}
