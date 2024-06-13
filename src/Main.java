import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funionários serão cadastrados? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Funcionario> funcionarioList = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            Integer ID = 0;
            boolean idValido = false;

            System.out.println("Dados da " + (i + 1) + "° pessoa:");

            //Checks if the ID inserted by the user already exists
            do {
                System.out.print("ID: ");
                ID = sc.nextInt();
                sc.nextLine();

                if (!Validation.existeFuncionarioComID(funcionarioList, ID)) {
                    idValido = true;
                } else {
                    System.out.println("ID já existe. Por favor, escolha um ID diferente.");
                }
            } while (!idValido);

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario funcionario = new Funcionario(ID,nome,salario);
            funcionarioList.add(funcionario);
        }


        System.out.print("Entre o ID do funcionário que terá o salário ajustado: ");
        Integer idFuncionario = sc.nextInt();
        sc.nextLine();

        //Search Employee by ID and Increase salary
        Funcionario funcionario = Validation.buscarFuncionarioPorID(funcionarioList, idFuncionario);
        if (funcionario != null) {
            System.out.print("Entre a porcentagem de aumento salarial: ");
            double percentualAumento = sc.nextDouble();
            sc.nextLine(); // limpar o buffer do scanner

            funcionario.aumentarSalario(percentualAumento);

            // Exibindo informações atualizadas do funcionário
            System.out.println("\nSalário atualizado de " + funcionario.getNome() + " - ID: " + funcionario.getID() + ": " + funcionario.getSalario());
        } else {
            System.out.println("Funcionário com ID " + idFuncionario + " não encontrado.");
        }

        System.out.println("");
        System.out.println("Lista de funcionários:");
        for (Funcionario x : funcionarioList){
            System.out.println(x);
        }
    }
}