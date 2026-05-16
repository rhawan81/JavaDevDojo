    package micheldevDojo.Java_dev_Dojo.javacore.Hherança.test;

    import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.Jogo;
    import micheldevDojo.Java_dev_Dojo.javacore.Hherança.dominio.JogoDigital;

    public class JogoTest01 {
        public static void main(String[]args){
            JogoDigital jogoDigital = new JogoDigital();
            jogoDigital.setPlataforma("PC");
            jogoDigital.setTitulo("Cyberpunk 2077");
            jogoDigital.setAnoLancamento(2020);
            jogoDigital.imprimir();
        }
    }
