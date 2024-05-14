package DFSyBFS;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
public class GrafoMA {
/**
* Matriz de Adyacencias
* ~~~~~~~~~~~~~~~~~~~~~
*
* 1 2 3 ... n vértices
* -----------------
* 1 | | | |
* -----------------
* 2 | | | |
* -----------------
* 3 | | | |
* -----------------
* | | | |
* .
* .
* n vértices
*
*/
private int matriz[][]; // Matriz de Adyacencias
private int n; // Número de vértices
public GrafoMA(int n) {
matriz = new int[n+1][n+1];
this.n = n;
}
public void adiArco(int i, int j, int peso) {
matriz[i][j] = peso;
}
/* Por anchura (breadth first search) */
public void bfs(){
int u = 1; // vértice inicial
TreeSet<Integer> visitados = new TreeSet<Integer>();
Queue<Integer> cola = new LinkedList<Integer>();
visitados.add(u); // visitados.inserta(i)
cola.offer(u); // cola.inserta(i)
System.out.format("%3d", u);
while (!cola.isEmpty()) {
u = cola.poll(); // cola.elimina()
for (int v = 1; v <= n; v++)
if (matriz[u][v] != 0 && !visitados.contains(v)) {
cola.offer(v); // cola.inserta(j)
visitados.add(v); // visitados.inserta(j)
System.out.format("%3d", v);
}
}
}

/* Por profundidad (depth first search) */
public void dfs(){
int u = 1; // vértice inicial
int v;
TreeSet<Integer> visitados = new TreeSet<Integer>();
Stack<Integer> pila = new Stack<Integer>();
visitados.add(u); // visitados.inserta(i)
pila.push(u); // pila.inserta(i)
System.out.format("%3d", u);
while (!pila.isEmpty()) {
u = pila.peek(); // Lee el elemento de la cima de la pila
for (v = 1; v <= n; v++)
if (matriz[u][v] != 0 && !visitados.contains(v))
break;
if (v > n) // ¿No tiene o ya fueron visitados sus hijos?
u = pila.pop(); // pila.elimina()
else {
pila.push(v); // pila.inserta(j)
visitados.add(v); // visitados.inserta(j)
System.out.format("%3d", v);
}
}
}
/**
* Dijkstra obtiene la mínima distancia desde un vértice inicial
* hasta todos los vértices.
*/
public void dijkstra(int verticeInicial){
/*
* peso
* u ----------> v
*
* distancia[u] : distancia hasta u
* distancia[v] : distancia hasta v
*/
final int INFINITO = Integer.MAX_VALUE;
int u, v;
int distancias[] = new int[n+1]; // Etiquetas
/* Se etiqueta las distancias de todos los vértices */
for (int i = 1; i <= n; i++)
distancias[i] = INFINITO;
distancias[verticeInicial] = 0; // vértice inicial
/* Se inserta el vertice inicial en la cola de prioridad */
PriorityQueue<Par> cp = new PriorityQueue<Par>();
cp.add(new Par(0, verticeInicial));
while (!cp.isEmpty()) {
//System.out.format("%-50s - %-50s\n", cp,
// java.util.Arrays.toString(distancias));
/* Se extrae u de la cola de prioridad (u tiene la distancia mínima)*/
Par par = cp.remove();
int d = par.getDistancia(); u = par.getVertice();
/* ... (di,u) ... (dj,u) ... */
/* ¿d es menor que la distancia actual hasta u? */
if (d <= distancias[u]) {
for (v = 1; v <= n; v++) {
if (matriz[u][v] != 0) {
/* total = distancia hasta u + peso */
int peso = matriz[u][v];
int total = distancias[u] + peso;
/* ¿total es menor que la distancia actual hasta v? */
if (total < distancias[v]) {
distancias[v] = total; // Actualiza la distancia de v
cp.add(new Par(total, v));
}
}
}
}
}
for (v = 1; v <= n; v++)
 System.out.printf("Mínima distancia desde %d hasta %d = %d\n", verticeInicial,
v, distancias[v]);
}
/* Despliega la matriz de adyacencias */
public void verGrafo() {
System.out.print(" ");
for (int j = 1; j <= n; j++)
System.out.format(" %3d ",j);
System.out.println();
for (int i = 1; i <= n; i++) {
System.out.print(i + " ");
for (int j = 1; j <= n; j++)
System.out.format("[%3d]", matriz[i][j]);
System.out.println();
}
System.out.println();
}
}

