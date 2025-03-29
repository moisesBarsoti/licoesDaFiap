# Pergunte a idade do usuário (em anos). Imprima uma mensagem especial se ele já viveu mais do que 10 mil dias.

# Recebendoa a idade do usuário
idade = int(input("Digite a sua idade: "));

# Calculando quantos dias já viveu
quantos_dias_ja_viveu = idade * 365;

if quantos_dias_ja_viveu > 10000:
    print(f"\nVocê já viveu mais de 10000 mil dias!");
    print(f"\nVocê viveu: {quantos_dias_ja_viveu} dias");
else:
    print(f"\nVocê viveu menos que 10000 mil dias!\n");
    print(f"Você viveu: {quantos_dias_ja_viveu} dias");