import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
    
    //declaração de vetor unidimensional
    int[] meu_array = new int[5];

    //inicialização os valores de vetores por acesso rápido
    meu_array [0] = 10;
    meu_array [1] = 20;
    meu_array [2] = 30;
    meu_array [3] = 40;
    meu_array [4] = 50;

    // recuperando os elementos da array  por acesso rápido
    int element0 = meu_array[0];
    int element1 = meu_array[1];
    
    System.out.println(element0);
    System.out.println(element1);

    for (int i = 0; i < meu_array.length; i++) {
        System.out.println("Elemento " + i + ": " + meu_array[i]);
    }

    //array (ou vetor) do tipo texo/string 
    //a quantidade de elementos é amarrada no inicio, por meio de um numero inteiro
    //permitindo que a mesma seja ampliada/diminuida no decorrer do processo
    String [] lista_aluno = new String [5];

    lista_aluno[0]= "joao";
    lista_aluno[1]= "vanessa";
    lista_aluno[2]= "davi";
    lista_aluno[3]= "lucas";
    lista_aluno[4]= "igor";

    //array (ou vetor) do tipo texo/string 
    //a quantidade de elementos é amarrada no ato da criação por meio dos conteudos
    //portanto, nao e possivel modificar a quantidade, somente adicionando e removendo
    String [] lista_cidades = {"poa", "itaim paulista", "Suzano", "itu"};

    // 0- poa 1-itaim paulista 2-suzano 3-itu
    System.out.println(lista_cidades[2]);

    //acesso posicional - sequencial (percorrer um array)
    for (int i=0; i< lista_aluno.length;i++){
        System.out.println("elemento "+i+":"+lista_aluno[i]);
    }

    for (int i=0; i< lista_cidades.length;i++){
        System.out.println("elemento "+i+":"+lista_cidades[i]);
    }

    int[] array1 = {1,2,3,4,5};
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(lista_cidades));

    //verificando o tamanho da array
    System.out.println("o tamanho é: "+array1.length);
    System.out.println("o tamanho é: "+lista_cidades.length);

    //copiando uma array
    int[] copia = array1.clone();
    String []copia_cidade = lista_cidades;

    System.out.println(Arrays.toString(copia));
    System.out.println(Arrays.toString(copia_cidade));
    
    //recortando e copiando para uma nova array
    String[] copia_sel = Arrays.copyOf(lista_cidades, 2);

    System.out.println("copia: "+ Arrays.toString(copia_sel));

    //organizando elementos
    int[] nova_array = {5,6,4,2,3,1,0};
    Arrays.sort(nova_array);

    System.out.println("Ordenado em: "+ Arrays.toString(nova_array));

    //inserindo um valor igual em todas as posições
    int[] array_vazia = new int [5];
    Arrays.fill(array_vazia, 10);

    System.out.println("preenchendo em: "+ Arrays.toString(array_vazia));

    //verificando se arrays são iguais
    boolean resp = Arrays.equals(lista_cidades, copia_cidade);

    System.out.println("são iguais: " + resp);

    if(Arrays.equals(lista_cidades,copia_cidade)){
        System.out.println("elas são iguais");
    }else{
        System.out.println("elas são diferentes");
    }

    //pesquisa de posições na array
    int posicao = Arrays.binarySearch(lista_cidades, "itu");
    System.out.println("a posição é: "+ posicao);

}
}

