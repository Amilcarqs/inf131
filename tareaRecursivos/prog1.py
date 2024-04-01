def generarConjuntoPotencia(conjunto,n):
    nuevoConjunto = [[]]
    for i in range(n):
        nuevoConjunto.append([conjunto[i]])
        aux = nuevoConjunto
        for j in aux[1:-1]:
            nuevoConjunto.append(j+[conjunto[i]])
    return nuevoConjunto

def suma(vector):
    s = 0
    for i in range(len(vector)):
        s = s+vector[i]
    return s
tc=int(input())
for i in range(tc):
    num = input().split()
    num = list(map(int,num))
    n = num[0]
    t = num[1]
    ti = list(num[2:])
    nuevo = generarConjuntoPotencia(ti,t)
    aux = suma(nuevo[0])
    for i in nuevo:
        nuevaSuma = suma(i)
        if(nuevaSuma>aux and nuevaSuma<=n):
            aux = nuevaSuma
            salida = i
    for i in range(len(salida)):
        if(i==(len(salida)-1)):
            print(salida[i])
        else:
            print(salida[i],end=" ")
    
            
