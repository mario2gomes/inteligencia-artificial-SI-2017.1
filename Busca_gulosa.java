package busca;

import java.util.ArrayList;
import java.util.List;

public class Busca_gulosa {

    /**
     * @param args the command line arguments
     */
    public static void main_gulosa(String[] args) {
      // TODO code application logic here
              
        ponto A = new ponto ("A", 30);
	ponto B = new ponto ("B", 26);
	ponto C = new ponto ("C", 21);
	ponto D = new ponto ("D", 7);
	ponto E = new ponto ("E", 22);
	ponto F = new ponto ("F", 36);
	ponto G = new ponto ("G", 0);
	
        List<ponto> listaPonto = new ArrayList<ponto>();
        List<String> listaCaminho = new ArrayList<String>();
        listaCaminho.add("A");

        listaPonto.add(A);
        listaPonto.add(B);
        listaPonto.add(C);
        listaPonto.add(D);
        listaPonto.add(E);
        listaPonto.add(G);
        listaPonto.add(F);

        int distancia_final = 30;        
	for (int i=0; i<5 ;i++){
            
            System.out.println("distancia total entre "); 
                    System.out.println("ponto: " + listaPonto.get(i).getLetra());
                    System.out.println(" e ");
                    
            int distancia;
            int caminho;
            int j = i+1; 
                if (listaPonto.get(j).getH()<listaPonto.get(j+1).getH()){
                    distancia = listaPonto.get(j).getH();
                    caminho = j;
                }
                else{
                    distancia = listaPonto.get(j+1).getH();
                    i++;
                    caminho = j+1;
                }
                    System.out.println("ponto: " + listaPonto.get(caminho).getLetra());
                    System.out.println("é essa: " + distancia);
                    System.out.println("i atual: " + i);
                
                distancia_final += distancia;
                listaCaminho.add(listaPonto.get(i+1).getLetra());
        }
        System.out.println("Caminho mais curto: " + distancia_final + " :\n(utilizando as distâncias heurísticas)"  );
        for (String x : listaCaminho){
            System.out.println(x);
        }
     
    }
}
