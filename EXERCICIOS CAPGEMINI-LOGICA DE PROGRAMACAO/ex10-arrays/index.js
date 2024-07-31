//cadastrar 5 usuarios com nome e idade
let CadastroNomes = []
let CadastroIdade = []

for(let i = 0; i < 5; i++){
    CadastroNomes.push(prompt("Digite seu nome"))
    CadastroIdade.push(prompt("Digite sua idade"))
    console.log(CadastroNomes[i] + ': ' + CadastroIdade[i] + ' anos')
}