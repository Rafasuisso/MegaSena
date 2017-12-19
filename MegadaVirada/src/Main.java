
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author e.rafael.medeiros
 */
public class Main {
    static int[] jogo;
    static int tamanho = 6;
    static int [] resultado = new int[61];
    
    //define todas ocorrencias como 0
    public static void inicializar(){
        for(int i = 0; i<61; i++){
            resultado[i]=0;
        }
    }
    

    //adiciona um jogo 
    public static void jogar(int [] jogo){
       int valor; 
       for(int i = 0; i<jogo.length; i++){
            valor = jogo[i];
            resultado[valor] ++;
        }
    }
    
    //Calcula as maiores occorencias jogadas
    public static void calcular(int tamanho){
        int numeros[][] = new int[2] [tamanho];
        //inicializa o vetor de numeros
        for(int i = 0; i<tamanho; i++){
            numeros[1][i]=0;
        }
        
        for(int i =0;i<tamanho;i++){
            int maiorValor=0;
            int maiorPosicao=i;
            for(int j= 0; j<61;j++){
                if(numeros[1][j]>maiorValor){
                   
                }
            }
            
            
        }
        
        //percorre o vetor das apostas
        for(int i=0; i<61;i++){
            //percorre o vetor dos resultados
            for(int j = 0; j<=tamanho;j++){
                //verifica se algum numero dentro das apostas é maior que algum dos resutados
                if(numeros[1][j]<resultado[i]){
                    numeros [0][j]=i;
                    numeros [1][j]= resultado[i];
                    j=tamanho -1;
                }
            }
        }
    }
    
    //-------------------------------------------------------------------//
    public static void main(String [] args){
        inicializar();
        int game1 [] = {6,22,34,26,28,15};
        
        jogar(game1);
        for(int i = 0; i<61; i++){
            System.out.print(resultado[i]+" ");
        }
    }
    
    
}
