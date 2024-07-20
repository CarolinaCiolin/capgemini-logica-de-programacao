
let totalConta = 0
let opcaoMenu

do{
    opcaoMenu = prompt("1 - Troca de óleo; 2 - Balanceamento; 3 - Sair")
    console.log(opcaoMenu)

    if(opcaoMenu == "1"){
        totalConta += 100
    }else if(opcaoMenu == "2"){
        totalConta += 70
    }
}
else if (opcaoMenu !== "3") {
alert("Opção inválida. Por favor, escolha 1, 2 ou 3.");
}
}while(opcaoMenu !== "3")

console.log("Total da conta: R$" + totalConta)


let totalConta = 0
let opcaoMenu

do{
    opcaoMenu = prompt("1 - Troca de óleo; 2 - Balanceamento; 3 - Sair")
    console.log(opcaoMenu)

    if(opcaoMenu == "1"){
        totalConta += 100
    }else if(opcaoMenu == "2"){
        totalConta += 70
    }
    else if (opcaoMenu !== "3") {
    alert("Opção inválida. Por favor, escolha 1, 2 ou 3.");
    }
}while(opcaoMenu !== "3")

console.log("Total da conta: R$" + totalConta)