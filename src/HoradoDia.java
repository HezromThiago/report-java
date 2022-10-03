public class HoradoDia {

    public static int horaDoDiaExato(int hora) {

        if(hora >= 6 && hora <= 12) {
            System.out.println("Bom Dia!!! dorminhoco :)");
        }else if(hora >= 12 && hora <= 18) {
            System.out.println("Boa Tarde!!! vai um cafézinho ai? :>");
        }else if(hora >= 18 && hora <= 24){
            System.out.println("Boa Noite!!! relaxar do dia certo? aoba");
        } else {
            System.out.println("Ta de madruga... vai dormir pelo amor de Deus");
        }

        return hora;
    }
}
