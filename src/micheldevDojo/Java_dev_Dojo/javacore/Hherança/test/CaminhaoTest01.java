package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Caminhao;

public class CaminhaoTest01 {
    public static void main(String[] args){
        Caminhao caminhao = new Caminhao();
        caminhao.setVelocidade(120);
        caminhao.setModelo("Volvo");
        caminhao.setCapacidadeDeCarga(10000);
        caminhao.setAno("2020");
        caminhao.setMarca("BMW");
        caminhao.mover();
    }
}
