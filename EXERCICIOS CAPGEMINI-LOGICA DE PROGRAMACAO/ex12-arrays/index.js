//Inverter ordem de um array

let vetor = []
let vetorReverso = []
// const aux = 9 pode ser utilizada no lugar de vetor.length

for(let i = 0; i < 10; i++){
    vetor[i] = i + 1
}

console.log(vetor)

for(let i = 0; i < 10; i++){
    vetorReverso[i] = vetor[vetor.length - i - 1]
}

console.log(vetorReverso)

console.log("-----")

//Calcular a soma de 2 arrays

let vetor1 = []
let vetor2 = []
let somaVetores = []

for(let i = 0; i < 10; i++){
    vetor1[i] = i + 1
}

console.log(vetor1)

for(let i = 0; i < 10; i ++){
    vetor2[i] = (i + 1) * 2
}

console.log(vetor2)

for(let i = 0; i < 10; i++){
    somaVetores[i] = vetor1[i] + vetor2[i]
}

console.log(somaVetores)

