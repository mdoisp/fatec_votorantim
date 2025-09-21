package Grafos;

public class GMA {

    //Atributos
    private Integer matriz[][];
    private Object listaVertices[];
    private boolean grafoDirecional;
    private int indexVetice;

    public GMA(int qtdVertices, boolean grafoDirecional) {
        matriz = new Integer[qtdVertices][qtdVertices];
        listaVertices = new Object[qtdVertices];
        this.grafoDirecional = grafoDirecional;
        indexVetice = 0;
    }

    public void adicionarVertices(Object vertice) {
        if (indexVetice < listaVertices.length) {
            listaVertices[indexVetice] = vertice;
            indexVetice++;
        } else {
            System.out.println("Tamanho máximo atingido");
        }
    }

    public void removerVertices(Object vertice) {
        int iVertice = buscaVertice(vertice);
        if (iVertice != -1) {
            //Remove o vetice da lista
            listaVertices[iVertice] = null;
            //remove da matriz de arestas
            for (int iDestino = 0; iDestino < matriz.length; iDestino++) {
                matriz[iVertice][iDestino] = null;
                matriz[iDestino][iVertice] = null;
            }
        }
    }

    public void adicionarAresta(Object origem, Object destino) {
        //Atribuir valor zero ao peso
        adicionarAresta(origem, destino, 0);
    }

    public void adicionarAresta(Object origem, Object destino, int peso) {
        int iOrigem, iDestino;

        iOrigem = buscaVertice(origem);
        iDestino = buscaVertice(destino);

        if (grafoDirecional) {//Grafo é direcional
            matriz[iOrigem][iDestino] = peso;
            matriz[iDestino][iOrigem] = peso;
        } else {//Grafo não é direcional
            matriz[iOrigem][iDestino] = peso;
        }
    }

    public int buscaVertice(Object vertice) {
        int index = 0;
        for (Object aux : listaVertices) {
            if (aux.equals(vertice)) {
                return index;
            }
            index++;
        }
            for(int i=0; i<listaVertices.length;i++){
                if(listaVertices[i].equals(vertice))
                    return i;
            }
        return -1;
    }

    public void imprimirMatrizAdj() {
        /*Imprime a matriz de adjacencias utilizando 
            System.out.print(............)
            | Vertice   |   0   |   1   |   2   |
            |   0       |       |       |       |
            |   1       |       |       |       |
            |   2       |       |       |       |
         */
    }
}
