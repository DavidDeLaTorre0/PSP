public class ExitValue {
    public static void main(String[] args) {
        // 1) Metemos el comando en un String
        String comando= "ls -l /bin > /home/alumnot/ejecutables.txt";
        String comando1= "pwd";
        String comando2= "uname -a";
        String comando3= "date";


        // 2) Antes de lanzar el proceso, definir sus atributos con ProcessBuilder
        ProcessBuilder pb = new ProcessBuilder(comando.split("\\s"));// \\s  es una expresion regular que significa el espacio en blacno
        ProcessBuilder pb1 = new ProcessBuilder(comando1.split("\\s"));
        ProcessBuilder pb2 = new ProcessBuilder(comando2.split("\\s"));
        ProcessBuilder pb3= new ProcessBuilder(comando3.split("\\s"));

        // 3) Para lanzaar el proceso, tenemos que utilizar el metodo .start() de ProcessBuilder
        // Esto genera un Process

        try{
            Process proceso = pb.start();
            Process proceso1 = pb1.start();
            Process proceso2 = pb2.start();
            Process proceso3 = pb3.start();


                // 4)

        }

        catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

    }
}
