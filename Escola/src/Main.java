public class Main{
    public static void main (String[] args){

        Aluno aluno = new Aluno("João", 20,"123" );
        Professor prof = new Professor("Maria", 40, "Matématica");
        Funcionario func = new Funcionario("Carlos", 30, 2000);

        System.out.println(aluno.getNome());
        System.out.println(prof.getDisciplina());
        System.out.println(func.getSalario());

    }
}