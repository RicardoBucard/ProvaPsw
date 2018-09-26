
public class Artista {
    private String nomeArtistico;
    private String banda;
    private int anosCarreira;
    private String estiloMusical;
    public Artista(String nomeArtistico, String banda, int anosCarreira, String estiloMusical){
        this.nomeArtistico = nomeArtistico;
        this.banda = banda;
        this.anosCarreira = anosCarreira;
        this.estiloMusical = estiloMusical;
        }

    public String getNomeArtistico() {
        return nomeArtistico;
    }
    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }
    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
    }
    public int getAnosCarreira() {
        return anosCarreira;
    }
    public void setAnosCarreira(int anosCarreira) {
        this.anosCarreira = anosCarreira;
    }
    public String getEstiloMusical() {
        return estiloMusical;
    }
    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
    public boolean equals (Object o){
        Artista outroArtista = (Artista) o;
            if(outroArtista.getNomeArtistico()!= null && this.getNomeArtistico() != null
                    && outroArtista.getBanda()!= null && this.getBanda()!= null
                    && outroArtista.getAnosCarreira() != 0 && this.getAnosCarreira() != 0
                    && outroArtista.getEstiloMusical()!= null && this.getEstiloMusical()!= null){
                if(outroArtista.getNomeArtistico().equals(this.getNomeArtistico()) && 
                   outroArtista.getBanda().equals(this.getBanda())&& 
                   outroArtista.getAnosCarreira() == (this.getAnosCarreira()) &&
                   outroArtista.getEstiloMusical().equals(this.getEstiloMusical())){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
    }
}

