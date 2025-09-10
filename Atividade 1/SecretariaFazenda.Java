package sistema_iptu;
    
public class SecretariaFazenda {
    Run | Debug
    public static void main(String [] args) {
        Município brasília = new Município(nome:"Brasília", estado:"DF", precoM2:65.5);

        Apartamento apt = new Apartamento(brasília, areaM2:52.0 vagas:1, possuiElevador:True);

        System.out.println("IPTU R$: " + apt.calcularIPTU());
    }
}
