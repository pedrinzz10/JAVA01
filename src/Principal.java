public class Principal {
    public static void main(String[] args) {
        //Cria um objeto a partir da classe Piloto
        Piloto bortoleto = new Piloto();
        bortoleto.Nome = "Gabriel bortoleto";
        bortoleto.Equipe = "Sauber";
        bortoleto.Peso = 45;
        bortoleto.Vitorias = 0;

        //Cria um objeto a partir da classe Piloto
        Piloto senna = new Piloto();
        senna.Nome = "Senna";
        senna.Equipe = "McLaren";
        senna.Peso = 56;
        senna.Vitorias = 60;

        //exibir valores
        System.out.println(bortoleto.Nome + " / " + bortoleto.Equipe + " / " + bortoleto.Peso);
        System.out.println(senna.Nome + " / " + senna.Equipe + " / " + senna.Peso);







    }
}
