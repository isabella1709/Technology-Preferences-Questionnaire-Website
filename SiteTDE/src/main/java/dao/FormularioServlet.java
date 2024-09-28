package dao;

import model.Formulario;
import dao.Conexao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/formulario")
public class FormularioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String birthdate = request.getParameter("birthdate");
        String gender = request.getParameter("gender");
        String maritalStatus = request.getParameter("marital-status");
        String educationLevel = request.getParameter("education-level");
        String language = request.getParameter("language");
        String area = request.getParameter("area");
        String library = request.getParameter("library");
        String ide = request.getParameter("ide");
        String practice = request.getParameter("practice");

        try (Connection conn = Conexao.getConexao().getConnection()) {
            String query = "INSERT INTO register (nome, birth_date, gender, marital_status, education_level, favorite_language, " +
                    "favorite_area, favorite_library, favorite_ide, favorite_practice) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nome);
            ps.setString(2, birthdate);
            ps.setString(3, gender);
            ps.setString(4, maritalStatus);
            ps.setString(5, educationLevel);
            ps.setString(6, language);
            ps.setString(7, area);
            ps.setString(8, library);
            ps.setString(9, ide);
            ps.setString(10, practice);

            ps.executeUpdate();

            response.setContentType("application/json");
            response.getWriter().println("{\"status\": \"success\", \"message\": \"Formulário enviado com sucesso.\"}");
        } catch (SQLException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("{\"status\": \"error\", \"message\": \"Erro ao inserir dados no banco de dados.\"}");
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().println("{\"status\": \"error\", \"message\": \"Erro interno do servidor.\"}");
        }
    }
}
