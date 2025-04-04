package com.seu_nome.taskboard.service;

import com.seu_nome.taskboard.model.Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardService {
    private Connection connection;

    public BoardService(Connection connection) {
        this.connection = connection;
    }

    public Board criarBoard(String nome) {
        try {
            String query = "INSERT INTO board (nome) VALUES (?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Board(); // Retorna um novo board (simplificação)
    }
}

