Algoritmo "Matrizes"
// Descri��o   : Reserva de cinema
// Data atual  : 30/07/2024
Var

cinema: matriz[1..10, 1..10] de literal
i, j, fila, poltrona: inteiro
opcao: literal

Inicio

para i de 1 ate 10 faca
para j de 1 ate 10 faca
     cinema[i,j] = "O"
fimpara
fimpara

repita
      Escreval("1 - Reservar")
      Escreval("2 - Layout do Cinema")
      Escreval("3 - Sair")
      leia(opcao)
      
      escolha opcao
         caso "1"
              Escreval("Fila")
              leia(fila)
              Escreval("Poltrona")
              leia(poltrona)
              
              se cinema[fila, poltrona] = "O" entao
                 cinema[fila, poltrona] => "X"
              senao
                   Escreval("Poltrona j� ocupada")
              fimse
         caso "2"
              para i de 1 ate 10 faca
                   para j de 1 ate 10 faca
                        Escreva ("",cinema[i,j],"")
                   fimpara
                          Escreval("")
              fimpara
              
      fimescolha

ate opcao = "3"


Fimalgoritmo