let vetor = []
let i
let j
let aux

for(let i = 0; i < 10; i++){
    vetor[i] = i + 1
}

console.log(vetor)

for(let i = 0; i < 10; i++){
    for(let j = 0; i < 10; i++){
        if(vetor[j] > vetor[i]){
            aux = vetor[i]
            vetor[i] = vetor[j]
            vetor[j] = aux
        }
    }
}