//Verificar se um nome ja consta cadastrado no sistema

let nomes = []
let cadastrado = false

for(let i = 0; i < 5; i++){
    nomes[i] = (prompt("Informe o nome a cadastrar"))
    console.log(nomes[i])
}

let pesquisa = prompt("Informe o nome a pesquisar")

for(let i = 0; i < 5; i++){
    if(nomes[i] === pesquisa){
        cadastrado = true
        break
    }
}

if (cadastrado === true){
    console.log("Cadastrado")
}else{
    console.log("Não cadastrado")
}