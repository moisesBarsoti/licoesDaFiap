# Use raiz quadrada (math.sqrt) para calcular distância
# de um ponto (x, y) até a origem do plano cartesiano

# Recebendo os valores de X e Y
ponto_x = float(input("Digite o valor de x: "));
ponto_y = float(input("Digite o valor de y: "));

# Calculando a distância
distancia = ponto_x**2 + ponto_y**2;
print(f"O valor da distância é de: {distancia}");