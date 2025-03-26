"""
3) Calcular a distância de um ponto até a origem (coordenada (0, 0) do plano). Seu programa irá:

Ler as coordenadas x e y de um ponto (leia uma de cada vez, isto é, use inputs separados para o x e o y);

Calcular a distância de (x, y) até (0, 0), também chamado de "magnitude" desse ponto;

Mostrar a distância.

Lembre que essa distância é calculada como sendo a raiz quadradada de (x² + y²)

BÔNUS (a): calcular distância entre dois pontos distintos

BÔNUS (b): calcular distância entre dois pontos em 3D (isto é, pontos com coordenadas (x, y, z))
"""

# Recebendo Valores
ponto_de_partida_x = float(input("Digite o ponto de partida: "))
ponto_final_y = float(input("Digite o ponto final: "))

# Calculando a distância
if ponto_final_y > ponto_de_partida_x:
    magnitude = ponto_final_y - ponto_de_partida_x
else:
    magnitude = ponto_de_partida_x - ponto_final_y

# Exibindo o resultado
print(f"A magnitude da discrepância entre os pontos é {magnitude}")
