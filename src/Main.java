public class Main {

    public static void main(String[] args) {

        Calculadora contas = new Calculadora();
        HoradoDia horas = new HoradoDia();

        System.out.println("Resultado de Soma: " + contas.soma(2, 2) + "\n");
        System.out.println("-------------------------------\n");
        System.out.println("Devo te comprimentar com " + horas.horaDoDiaExato(6)+"h");
    }
}
