# Exercício "DOAÇÃO DE SANGUE", parte 1. Pergunte a idade da pessoa. (Teremos outras versões desse exercício, levando em conta mais requisitos para doar sangue.)
# Se a idade estiver no intervalo de 18 a 60 anos, diga "Pode doar sangue!"
# Se a idade for menor de 18, mas pelo menos 16, pergunte se tem autorização dos pais. 
# (Pode instruir a pessoa a digitar S ou N, por exemplo.) Imprima mensagens diferentes dependendo da resposta.

# Recebendo valores
nomeDoDoador = input("Digite o seu nome: ");
idadeDoDoador = int(input("Digite a sua idade: "));

# Condição para doar sangue
if idadeDoDoador >= 18 & idadeDoDoador <= 60:
    print(f"\n{nomeDoDoador} Pode doar sangue!\n");
elif idadeDoDoador >= 16 & idadeDoDoador < 18:
    print(f"\n{nomeDoDoador} tem autorização dos seus pais?\n");
else:
    print(f"\n{nomeDoDoador} não pode doar sangue!\n");