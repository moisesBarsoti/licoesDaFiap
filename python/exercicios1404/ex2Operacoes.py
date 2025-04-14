execucao = True;

while execucao:
    # Recebendo valores
    primeiro_valor = float(input("Digite o primeiro valor: "));
    segundo_valor = float(input("Digite o segundo valor: "));
    
    print("----------------------------------");
    print(f"\nA - Adição");
    print("S - Subtração");
    print("M - Multiplicação");
    print("D - Divisão");
    print(f"E - Encerrar programa \n");

    print(f"\n----------------------------------");

    # Recebendo a opção
    opcao = input("Selecione pela letra a operação que deseja ( A / S / M / D / E ): ").upper();

    # Condição
    if opcao == 'A':
        print(f"{primeiro_valor} + {segundo_valor} = {primeiro_valor + segundo_valor}");
    elif opcao == 'B':
        print(f"{primeiro_valor} - {segundo_valor} = {primeiro_valor - segundo_valor}");
    elif opcao == 'M':
        print(f"{primeiro_valor} * {segundo_valor} = {primeiro_valor * segundo_valor}");
    elif opcao == 'D':
        print(f"{primeiro_valor} / {segundo_valor} = {primeiro_valor / segundo_valor}");
    else:
        execucao = False;
print("Encerrado o programa!");