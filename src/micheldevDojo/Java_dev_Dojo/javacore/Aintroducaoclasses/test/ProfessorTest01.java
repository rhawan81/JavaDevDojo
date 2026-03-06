package micheldevDojo.Java_dev_Dojo.javacore.Aintroducaoclasses.test;

import micheldevDojo.Java_dev_Dojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mauricio";
        professor.idade = 29;
        professor.sexo = 'M';


        System.out.println( " Nome : " + professor.nome + " idade: " + professor.idade + " anos " + professor.sexo);

    }
}
