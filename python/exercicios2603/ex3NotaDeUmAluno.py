# Pergunte a nota de um aluno em três atividades diferentes. Calcule a média entre as três.
# Imprima "aprovado" se a média for maior ou igual a 6, e "fará recuperação" caso contrário.

# Recebendo os dados
nome = input("Digite o seu nome: ");
atividade_1 = float(input("Digite a nota da primeira atividade: "));
atividade_2 = float(input("Digite a nota da segunda atividade: "));
atividade_3 = float(input("Digite a nota da terceira atividade: "));

# Calculando a média
media_das_atividades = (atividade_1 + atividade_2 + atividade_3) / 3;

# Condição se vai ser aprovado
if media_das_atividades >= 6:
    print(f"\nAprovado!");
    print(f"{nome} a sua média é: {int(media_das_atividades)}\n");
else:
    print(f"\nFará recuperação!");
    print(f"{nome} a sua média é: {int(media_das_atividades)}\n");