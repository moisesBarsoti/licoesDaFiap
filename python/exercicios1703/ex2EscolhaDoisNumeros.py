"""
2. Programa "calculadora" (com operações fixas por enquanto).
Peça a entrada de dois números.
    (a) Mostre a soma entre os números fornecidos
    (b) Mostre outras três operações à sua escolha
"""

# Selecionando Elementos
print("Digite dois números ");
print("");
primeiroNumero = int(input("Digite o seu primeiro número: "));
segundoNumero = int(input("Digite o seu segundo número: "));

# Cálculo das 4 operações
somaDosNumeros = primeiroNumero + segundoNumero;
subtracoesDosNumeros = primeiroNumero - segundoNumero;
multiplicacaoDosNumeros = primeiroNumero * segundoNumero;
divisaoDosNumeros = primeiroNumero / segundoNumero;

# Exibindo os resultados
print("");
print(f"Os números escolhidos foram: {primeiroNumero} e {segundoNumero}");
print("");

print(f"A \033[33msoma\033[m dos números é: \033[33m{somaDosNumeros}\033[m");
print(f"A \033[33msubtração\033[m dos números é: \033[33m{subtracoesDosNumeros}\033[m");
print(f"A \033[33mmultiplicação\033[m dos números é: \033[33m{multiplicacaoDosNumeros}\033[m");
print(f"A \033[33mdivisão\033[m dos números é: \033[33m{divisaoDosNumeros}\033[m");