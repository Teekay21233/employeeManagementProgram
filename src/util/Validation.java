package util;

import entities.Funcionario;

import java.util.List;

public class Validation {

    public static boolean existeFuncionarioComID(List<Funcionario> funcionarios, int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getID() == id) {
                return true;
            }
        }
        return false;
    }

    public static Funcionario buscarFuncionarioPorID(List<Funcionario> funcionarios, int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getID() == id) {
                return funcionario;
            }
        }
        return null; // Retorna null se não encontrar o funcionário com o ID especificado
    }
}
