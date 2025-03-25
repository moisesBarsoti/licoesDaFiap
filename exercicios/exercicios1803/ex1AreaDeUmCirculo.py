"""
1) Calcular área de um círculo: Peça ao usuário por input o raio de um círculo. Calcule e mostre sua área.
"""

# Recebendo valores - Adicionando valores
raio = float(input("Digite o raio do circulo: "));
pi = 3.14;

# Calculando a área
calculoDaArea = pi * (raio ** 2);

# Exibindo o resultado
print(f"A área do círculo com o raio: {raio} é: {calculoDaArea:.2f}");