package busca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Busca_A {

    public static void main(String[] args) {
              
      Scanner ler = new Scanner (System.in);
      
        System.out.println("Por favor, insira o ponto inicial:");
        System.out.println("letra: ");
        String letra = ler.next();
        System.out.println("número de heurística: ");
        int h = ler.nextInt();
        
        ponto p = new ponto (letra, h, 0);
        	
        List<ponto> listaPonto = new ArrayList<ponto>();
        listaPonto.add(p);
        
        int distancia_final = 0;        
        int i = 0;
        
        boolean fim1 = false;        
	while(fim1 == false){
            System.out.println("Por favor, insira os pontos adjacentes a " + listaPonto.get(i).getLetra() + " :");

            ArrayList<PontoProximo> listaPontoProximo = new ArrayList<PontoProximo>();            
            boolean fim2 = false;
            int indice = 0;
            
            while (fim2 == false){
                System.out.println("letra: ");
                letra = ler.next();
                System.out.println("número de heurística: ");
                h = ler.nextInt();
                System.out.println("distância do ponto " + listaPonto.get(i).getLetra());
                int dist = ler.nextInt();
                
                p = new ponto (letra, h, dist);
                PontoProximo pp = new PontoProximo (p,indice);
                indice ++;
                
                listaPontoProximo.add(pp);
                
                System.out.println("Existem mais pontos próximos? \n s ou n?");
                String sn = ler.next();                
                if (sn.equals("n")){
                    
                    int menor_distancia_heuristica = listaPontoProximo.get(0).getP().getDistancia_proxima()+listaPontoProximo.get(0).getP().getH();                    
                    int indice_do_mais_proximo = 0;                    
                            
                    for (PontoProximo distancia : listaPontoProximo){
                        
                        if (distancia.getP().getDistancia_proxima()+distancia.getP().getH()<=menor_distancia_heuristica){
                            menor_distancia_heuristica = distancia.getP().getDistancia_proxima()+distancia.getP().getH();
                            indice_do_mais_proximo = distancia.getIndice();
                        }                        
                    }
                    
                    listaPonto.add(listaPontoProximo.get(indice_do_mais_proximo).getP());                    
                    if(listaPonto.get(i+1).getH() == 0){
                        fim1 = true;                        
                    } else{
                    i++;
                    }
                fim2 = true;  
                distancia_final += listaPontoProximo.get(indice_do_mais_proximo).getP().getDistancia_proxima();
                }
            }
        }
        System.out.println("Caminho mais curto: " + distancia_final);
        for (ponto x : listaPonto){
            System.out.println(x.getLetra());
        }
    }
}
