package com.seu_nome.taskboard.view;

import com.seu_nome.taskboard.service.BoardService;
import com.seu_nome.taskboard.db.ConexaoDB;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BoardService boardService;

    public static void main(String[] args) {
        boardService = new BoardService(ConexaoDB.getConnection());

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar novo board");
            System.out.println("2. Selecionar board");
            System.out.println("3. Excluir boards");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do novo board:");
                    String nomeBoard = scanner.next();
                    boardService.criarBoard(nomeBoard);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

