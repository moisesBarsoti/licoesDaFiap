# Recebendo os valores para as operações
primeiro_valor = float(input("Digite o primeiro valor: "));
segundo_valor = float(input("Digite o segundo valor: "));

# Menu
print("-------------------------------------------------");
print("1. Soma");
print(f"2. Potenciação\n");

opcao = int(input("Escolha uma das opções acima: "));

print(f"\n-------------------------------------------------");

if opcao == 1:
    resultado = primeiro_valor + segundo_valor;
    print(f"\n{primeiro_valor} + {segundo_valor} = {resultado}\n");
else:
    resultadoDoPrimeiroValor = primeiro_valor ** 2;
    resultadoDoSegundoValor = segundo_valor ** 2;
    print(f"\nPrimeiro valor: {primeiro_valor} ** 2 = {resultadoDoPrimeiroValor}\n");
    print(f"Segundo valor: {segundo_valor} ** 2 = {resultadoDoSegundoValor}\n");
