package sistema_iptu;

public class Casa {
    private Município município;
    private Double areaM2;
    private Integer vagas;

    public Double calcularIPTU(){
        return (this.areaM2 * this.município.getPrecoM2())*1.005;
    }
}
