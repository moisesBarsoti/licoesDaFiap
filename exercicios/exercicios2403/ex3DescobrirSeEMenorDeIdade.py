import datetime;

# Data atual padrão
data_atual = datetime.datetime.now();
ano_atual = data_atual.year;

# Recebendo o valor do ano que nasceu
ano_de_nascimento = int(input("Digite o ano que você nasceu: "));

# Calculando a idade do usuário
idade = ano_atual - ano_de_nascimento;

# Fazendo a verificação se é maior ou menor
if (idade < 18):
    print(f"\nVocê é menor de idade\n");
else:
    print(f"\nVocê é maior de idade\n");