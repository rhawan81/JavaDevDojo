package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Moto;

public class MotoTest01 {
    public static void main(String[]args){
        Moto moto = new Moto();

        moto.setMarca("Honda");
        moto.setCilindradas(600);
        moto.setAno("2020");
        moto.setModelo("CBR600RR");
        moto.mover();

    }
}
