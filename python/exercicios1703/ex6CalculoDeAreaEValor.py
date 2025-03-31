"""
    6. Cálculo de área e valor.
        (a) Peça ao usuário que informe comprimento e largura
        de um terreno retangular.

        Informe a área total do terreno.

        (b) Peça ao usuário que informe o preço total do terreno.
        Calcule e mostre qual o preço por metro quadrado.
"""

# Solicitar os dados do terreno
print("Digite o comprimento e a largura do terreno retangular:");
largura = float(input("Digite a largura (em metros): "));
comprimento = float(input("Digite o comprimento (em metros): "));

# Calcular a área total do terreno
areaTotalDoTerreno = largura * comprimento;
print(f"A área total do terreno é: {areaTotalDoTerreno} m²");

# Solicitar o preço total do terreno
precoTotalDoTerreno = float(input("Digite o valor total do terreno (em reais): "));

# Calcular o preço por metro quadrado
precoPorMetroQuadrado = precoTotalDoTerreno / areaTotalDoTerreno;
print(f"O preço por metro quadrado é: R$ {precoPorMetroQuadrado:.2f}");
