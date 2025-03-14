abstract class Funcionario {
    private String nome;
    private int inscricao;
    private double salario;
    private String turno;
    private int dias;

    public Funcionario(String nome, int inscricao, double salario, String turno, int dias) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
        this.dias = dias;
    }

    public void horariosDisponiveis() {
        System.out.println("Horário disponível de " + nome + ": 08:00 - 17:00");
    }

    public void horarioTrabalhado() {
        System.out.println(nome + " trabalha 8 horas por dia durante " + dias + " dias.");
    }

    public void informacoesFuncionarios() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Inscrição do funcionário: " + inscricao);
        System.out.println("Salário do funcionário: R$ " + salario);
        System.out.println("Turno: " + turno);
        System.out.println("Dias trabalhados por semana: " + dias);
    }

    public abstract void funcaoDesempenhada();

    public String getNome() {
        return nome;
    }
}

class Diretor extends Funcionario {
    private String segmento;

    public Diretor(String nome, int inscricao, double salario, String turno, int dias, String segmento) {
        super(nome, inscricao, salario, turno, dias);
        this.segmento = segmento;
    }

    public void criarDescontos() {
        System.out.println(getNome() + " está criando descontos na escola!");
    }

    public void criarFardas() {
        System.out.println(getNome() + " está encomendando novos uniformes!");
    }

    public void gerenciarProfessores() {
        System.out.println(getNome() + " está gerenciando os professores!");
    }

    @Override
    public void funcaoDesempenhada() {
        System.out.println(getNome() + " é um Diretor e gerencia a escola!");
    }
}

class Coordenador extends Funcionario {
    public Coordenador(String nome, int inscricao, double salario, String turno, int dias) {
        super(nome, inscricao, salario, turno, dias);
    }

    public void auxiliarProfessores() {
        System.out.println(getNome() + " está auxiliando os professores!");
    }

    public void organizarFestivais() {
        System.out.println(getNome() + " está organizando festivais na escola!");
    }

    @Override
    public void funcaoDesempenhada() {
        System.out.println(getNome() + " é um Coordenador da escola!");
    }
}

class Secretario extends Funcionario {
    public Secretario(String nome, int inscricao, double salario, String turno, int dias) {
        super(nome, inscricao, salario, turno, dias);
    }

    public void receberEncomenda() {
        System.out.println(getNome() + " está recebendo uma encomenda!");
    }

    public void receberPagamentos() {
        System.out.println(getNome() + " está recebendo pagamentos!");
    }

    @Override
    public void funcaoDesempenhada() {
        System.out.println(getNome() + " é um Secretário da escola!");
    }
}

class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int inscricao, double salario, String turno, int dias, String disciplina) {
        super(nome, inscricao, salario, turno, dias);
        this.disciplina = disciplina;
    }

    public void lecionar() {
        System.out.println(getNome() + " está dando aula de " + disciplina + "!");
    }

    public void criarAtividades() {
        System.out.println(getNome() + " está criando atividades.");
    }

    @Override
    public void funcaoDesempenhada() {
        System.out.println(getNome() + " é um Professor da escola!");
    }
}

public class TesteUML {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("Lucas", 1, 10000, "Integral", 5, "Ensino Médio");
        Coordenador coordenador = new Coordenador("Maria", 2, 8000, "Noturno", 4);
        Secretario secretario = new Secretario("Carlos", 3, 4000, "Diurno", 5);
        Professor professor = new Professor("Emerson", 4, 6000, "Integral", 3, "Matemática");

        diretor.informacoesFuncionarios();
        diretor.funcaoDesempenhada();
        diretor.criarDescontos();
        diretor.criarFardas();
        diretor.gerenciarProfessores();
        System.out.println();

        coordenador.informacoesFuncionarios();
        coordenador.funcaoDesempenhada();
        coordenador.auxiliarProfessores();
        coordenador.organizarFestivais();
        System.out.println();

        professor.informacoesFuncionarios();
        professor.funcaoDesempenhada();
        professor.lecionar();
        professor.criarAtividades();
        professor.horariosDisponiveis();
        professor.horarioTrabalhado();
    }
}
