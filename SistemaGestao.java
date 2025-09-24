import java.util.*;

public class SistemaGestao {
    private static Scanner sc = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Projeto> projetos = new ArrayList<>();
    private static List<Equipe> equipes = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== Sistema de Gestão ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Cadastrar Projeto");
            System.out.println("4 - Listar Projetos");
            System.out.println("5 - Cadastrar Equipe");
            System.out.println("6 - Listar Equipes");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> listarUsuarios();
                case 3 -> cadastrarProjeto();
                case 4 -> listarProjetos();
                case 5 -> cadastrarEquipe();
                case 6 -> listarEquipes();
            }
        } while (opcao != 0);
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("Login: ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        System.out.print("Perfil (1-ADMIN, 2-GERENTE, 3-COLABORADOR): ");
        int p = sc.nextInt(); sc.nextLine();
        Perfil perfil = switch (p) {
            case 1 -> Perfil.ADMIN;
            case 2 -> Perfil.GERENTE;
            default -> Perfil.COLABORADOR;
        };
        usuarios.add(new Usuario(nome, cpf, email, cargo, login, senha, perfil));
        System.out.println("Usuário cadastrado!");
    }

    private static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    private static void cadastrarProjeto() {
        if (usuarios.isEmpty()) {
            System.out.println("Cadastre pelo menos um GERENTE primeiro!");
            return;
        }
        System.out.print("Nome do projeto: ");
        String nome = sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();

        System.out.println("Escolha um gerente (índice): ");
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getPerfil() == Perfil.GERENTE) {
                System.out.println(i + " - " + usuarios.get(i).getNome());
            }
        }
        int idx = sc.nextInt(); sc.nextLine();
        Usuario gerente = usuarios.get(idx);

        Projeto p = new Projeto(nome, desc, gerente);
        projetos.add(p);
        System.out.println("Projeto cadastrado!");
    }

    private static void listarProjetos() {
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
            return;
        }
        for (Projeto p : projetos) {
            System.out.println(p);
        }
    }

    private static void cadastrarEquipe() {
        System.out.print("Nome da equipe: ");
        String nome = sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        Equipe e = new Equipe(nome, desc);
        equipes.add(e);
        System.out.println("Equipe cadastrada!");
    }

    private static void listarEquipes() {
        if (equipes.isEmpty()) {
            System.out.println("Nenhuma equipe cadastrada.");
            return;
        }
        for (Equipe e : equipes) {
            System.out.println(e);
        }
    }
}