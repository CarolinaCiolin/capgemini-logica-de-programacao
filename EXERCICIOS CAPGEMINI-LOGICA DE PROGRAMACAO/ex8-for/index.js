//Decremento desejado dentro de um intervalo
let maiorNumero = parseInt(prompt("Digite o valor do maior número: "))
console.log("Maior número: " + maiorNumero)
    
let menorNumero = parseInt(prompt("Digite o valor do menor número: "))
console.log("Menor número: " + menorNumero)

let decremento = parseInt(prompt("Digite o valor do decremento desejado: "))
console.log("Decremento: " + decremento)

for(let i = maiorNumero; i >= menorNumero; i -=decremento){
        console.log(i)
    }