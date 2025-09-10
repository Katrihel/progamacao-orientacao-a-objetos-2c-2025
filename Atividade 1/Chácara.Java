package sistema_iptu;

public class Apartamento {
    private Munícipio município;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiPoçoArtesiano;
    
    public Double calcularIPTU(){
        return this.areaM2 * this.município.getPrecoM2();
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEstado(String nome){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = nome;
    }

    public String getPrecoM2(String nome){
        return this.precoM2;
    }

     public void setPrecoM2(Double precoM2){
        this precoM2 = precoM2;
}