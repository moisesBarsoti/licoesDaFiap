# Peça para o usuário informar por input uma opção dentre as seguites: a, b, ou c.
# Se a opção for "a", imprima uma mensagem "bom dia"
# Se a opção for "b", imprima uma mensagem "boa tarde"
# Se a opção for "c", imprima uma mensagem "boa noite"
# Se for qualquer outra opção, imprima "opção inválida"

# Recebendo o nome do usuário
nomeDoUsuario = input("Digite o seu nome: ");

# Opção de escolha
print(f"\n--------------------------------------------------------\n");
print(f"{nomeDoUsuario} escolha uma das opções abaixo: \n");
print(f"a. Bom dia!");
print(f"b. Boa tarde!");
print(f"c. Boa noite!");
print(f"\n--------------------------------------------------------\n");

opcao = input(f"{nomeDoUsuario} digite sua opção (a b c): ").lower();

# Condição após a escolha
if opcao == 'a':
    print(f"\nBom dia!\n");
elif opcao == 'b':
    print(f"\nBoa tarde!\n");
else:
    print(f"\nBoa noite!\n");

