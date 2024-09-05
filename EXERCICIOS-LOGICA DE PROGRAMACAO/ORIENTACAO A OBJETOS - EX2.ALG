Algoritmo "Orientacao a objetos - Ex2"

tipo
cadastroCliente = registro
                nome: caractere
                rg: caractere
                idade: inteiro
fimregistro

Var
clientes: vetor[1..3] de cadastroCliente
opcao: caractere
i: inteiro
rgPesquisa: caractere


Inicio

repita
      Escreval("1 - Cadastrar")
      Escreval("2 - Pesquisar")
      Escreval("3 - Sair")
      leia(opcao)
      
      se opcao = 1 entao
         para i de 1 ate 3 faca  //para nao preencher sempre a 1ª posicao, e sim a 1ª posicao vazia
              se clientes[i].nome = "" entao
                 Escreval("Nome: ")
                 leia(clientes[i].nome)
                 Escreval("RG: ")
                 leia(clientes[i].rg)
                 Escreval("Idade: ")
                 leia(clientes[i].idade)
              interrompa
              fimse
         fimpara
      senao
      se opcao = "2" entao
         Escreval("Digite o RG")
         leia(rgPesquisa)
                         para i de 1 a 3 faca
                              se clientes[i].rg = rgPesquisa entao
                                 Escreval(clientes[i).nome, " encontrado"
                                 interrompa
                              fimse
                         fimpara
      fimse
      fimse
ate opcao = "3"


Fimalgoritmo