package busca;

public class ponto {
    String letra;
    int H;
    int distancia_proxima;

    public int getDistancia_proxima() {
        return distancia_proxima;
    }

    public void setDistancia_proxima(int distancia_proxima) {
        this.distancia_proxima = distancia_proxima;
    }

    public ponto(String letra, int H, int distancia_proxima) {
        this.letra = letra;
        this.H = H;
        this.distancia_proxima = distancia_proxima;
    }

    public ponto(String letra, int H) {
        this.letra = letra;
        this.H = H;
    }

    
    
    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }
}
