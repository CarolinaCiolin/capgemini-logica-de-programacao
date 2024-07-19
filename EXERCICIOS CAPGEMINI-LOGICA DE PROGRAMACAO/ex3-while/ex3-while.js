//ESTUDO DE IDADES
// - informar a pessoa mais velha
// - informar a pessoa mais nova
// - porcentagem de menor de 18 anos
// - porcentagem de maior de 18 anos
// - media das idades

let entrevistados = 0
let maisNovo = 150
let maisVelho = 0
let somaIdades = 0
let menor = 0
let maior = 0

while(entrevistados < 5){
    let idadeInformada = prompt("Digite sua idade")
    console.log(idadeInformada)
        if(idadeInformada > maisVelho){
            maisVelho = idadeInformada
        }
        if(idadeInformada < maisNovo){
            maisNovo = idadeInformada
        }
        if(idadeInformada < 18){
            menor++
        }
        if(idadeInformada >= 18){
            maior++
        }

    idadeInformada = Number(idadeInformada)
    somaIdades += idadeInformada
    idadeInformada = String(idadeInformada)

    entrevistados++
}

console.log("A pessoa mais velha tem " + maisVelho + " ano(s)")
console.log("A pessoa mais nova tem " + maisNovo + " ano(s)")
console.log("A média de idades é: " + (somaIdades / entrevistados))
console.log("A porcentagem de menores de 18 é: " + (menor / entrevistados * 100) + "%")
console.log("A porcentagem de maiores de 18 é: " + (maior / entrevistados * 100) + "%")

//nao esta funcionando 100% ainda, pois nao sei como transformar string em numero quando tem mais de 2 digitos e tambem nao sei converter o decimal para porcentagem, mas a lógica esta de acordo com a resolucao do exercicio
