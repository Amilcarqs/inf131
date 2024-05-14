package DFSyBFS;

public class Par implements Comparable<Par> {
private int distancia;
private int vertice;
public Par(int distancia, int vertice){
this.distancia = distancia;
this.vertice = vertice;
}
public int getVertice() {
return this.vertice;
}
public int getDistancia() {
return this.distancia;
}
@Override
public int compareTo(Par o) {
if (this.distancia != o.distancia)
return this.distancia - o.distancia;
else
return this.vertice - o.vertice;
}
@Override
public String toString() {
return "(" + this.distancia + ", " + this.vertice + ")";
}
}