package DFSyBFS;

public class AplicacionMA {
public static void main(String[] args) {
/**
* V�rtices:
* 1, 2, 3, ..., n
*/
int n = 6; // n v�rtices
GrafoMA grafo = new GrafoMA(n);
grafo.adiArco(1, 2, 1); // (i, j, peso) (empieza en i)
grafo.adiArco(1, 3, 2);
grafo.adiArco(1, 4, 8);
grafo.adiArco(2, 5, 3);
grafo.adiArco(3, 5, 3);
grafo.adiArco(3, 4, 9);
grafo.adiArco(3, 6, 8);
grafo.adiArco(4, 6, 20);
grafo.adiArco(5, 6, 4);
grafo.verGrafo();
System.out.print("V�rtices visitados (BFS): ");
grafo.bfs(); // b�squeda en anchura
System.out.println();
System.out.print("V�rtices visitados (DFS): ");
grafo.dfs(); // b�squeda en profundidad
System.out.println();
 System.out.println();
grafo.dijkstra(1); // dijstra(v�rtice de inicio)
}
}
