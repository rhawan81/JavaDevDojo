package micheldevDojo.Java_dev_Dojo.javacore.Bintroducaometodo.dominio;

public class ImpressoraEstudante {
    // Método público que recebe um objeto Estudante como parâmetro (por referência)
    public void ImprimeEstudante( Estudante estudante){

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }

}
