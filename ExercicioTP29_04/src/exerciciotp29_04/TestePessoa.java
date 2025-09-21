package exerciciotp29_04;

public class TestePessoa {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Matheus", 22, Genero.MASCULINO.toString());
        System.out.println(f.getNome());
        Aluno aluno1 = new Fundamental("Matheus", 22, Genero.MASCULINO.toString());
        aluno1.setNota(10f);
        System.out.println("Nota do Matheus Fundamental: "+ aluno1.getNota());
        Aluno aluno2 = new Colegio("Matheus", 22, Genero.MASCULINO.toString());
        aluno2.setNota(10f);
        System.out.println("Nota do Matheus Colegio: "+ aluno2.getNota());
    }
}
