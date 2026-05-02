package micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.test;

import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Hospital;
import micheldevDojo.Java_dev_Dojo.javacore.Gassociacao.dominio.Medico;

public class HospitalTest01 {
    public static void main(String[] args) {
        Medico medico = new Medico("Maria Braga ", "Cardiologista");
        Medico medico2 = new Medico("Otavio Mauricio ", "Oftamologista");
        Medico medico3 = new Medico("Ana Clara Gomes ", "Pediatria");
        Medico[] medicos = {medico,medico2,medico3};
        Hospital hospital = new Hospital("Hospital Portugues ",medicos);


        hospital.imprime();
    }
}
