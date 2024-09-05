//descubra a senha em 5 tentativas

const senha = "gatinho"
let numeroDeTentativas = 0
let senhaDigitada

do{
    senhaDigitada = prompt("Digite a senha")
    numeroDeTentativas++
    console.log(numeroDeTentativas + " " + senhaDigitada)
}while((senhaDigitada !== senha) && (numeroDeTentativas < 5))

