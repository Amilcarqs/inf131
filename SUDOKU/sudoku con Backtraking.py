sudoku2= [
    [0,0,0,0,0,0,0,5,7],
    [0,0,0,0,0,6,0,0,0],
    [1,0,0,7,0,0,0,9,6],
    [6,0,0,0,0,0,4,0,0],
    [0,0,0,0,2,0,0,0,0],
    [0,4,3,0,0,0,0,0,0],
    [0,0,8,0,1,0,0,0,9],
    [0,9,0,2,0,7,8,0,0],
    [0,0,5,0,8,4,0,7,0]
    ]
sudoku= [
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0]
    ]
def mostrar(matriz):
    print("|----------.----------.----------|")
    for i in range(9):
        aux = matriz[i]
        print("|",end=" ")
        for j in range(9):
            print(aux[j]," ",end="")
            if(((j+1)%3)==0):
                print("|",end=" ")
        print()
        if(((i+1)%3)==0):
            print("|----------.----------.----------|")
                

#mostrar(sudoku)
def resolver(sudoku):
    for i in range(9):
        for j in range(9):
            if(sudoku[i][j]==0):
                for n in range(1,10):
                    #probamos de meter n
                    if(valido(sudoku,n,i,j)):
                        sudoku[i][j] = n
                        if resolver(sudoku):
                            return True
                        else:
                            sudoku[i][j] = 0
                #backtraking
                return False
    #solucionado
    return True

def valido(sudoku, n, i ,j ):
    fila = sudoku[i]
    col = [f[j] for f in sudoku]
    bloque = [sudoku[a][b]
              for a in range(9)
              for b in range(9)
              if i//3 == a//3
              and j//3 == b//3]
    
    return n not in fila and n not in col and n not in bloque

resolver(sudoku)
mostrar(sudoku)
