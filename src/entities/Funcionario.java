package entities;

public class Funcionario {

    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionario(Integer ID, String nome, Double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentualAumento) {
        salario += salario * (percentualAumento / 100);
    }

    @Override
    public String toString() {
        return ID + ", " + nome + ", " + salario;
    }
}
