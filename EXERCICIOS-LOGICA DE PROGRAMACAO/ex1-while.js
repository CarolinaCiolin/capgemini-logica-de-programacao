// Com quantos anos Joao ficara mais alto que Marcelo?

let alturaMarcelo = 1.20
let alturaJoao = 1.05

let idade = 8

let crescimentoAnualMarcelo = 0.05
let crescimentoAnualJoao = 0.07

while(alturaMarcelo >= alturaJoao){
    alturaMarcelo += crescimentoAnualMarcelo
    alturaJoao += crescimentoAnualJoao
    idade++
}

console.log("Idade: " + idade)
console.log("Altura Marcelo: " + alturaMarcelo)
console.log("Altura João: " + alturaJoao)