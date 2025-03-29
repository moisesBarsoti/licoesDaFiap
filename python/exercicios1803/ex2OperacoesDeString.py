"""
2) Vamos usar esse exercício para aprender algumas operações de string. Peça um texto por input.

(a) Mostre esse texto em MAIÚSCULAS (método upper());

(b) Mostre esse texto trocando a letra 'a' por 'i' (método replace());

(c) Mostre o número de ocorrências da letra 'e'.
"""

# Mostre esse texto em MAIÚSCULAS (método upper());
nome = input("Digite o seu nome: ").upper();
print(f"\nO seu \033[33mnome\033[m é: \033[33m{nome}\033[m\n");

# Mostre esse texto trocando a letra 'a' por 'i' (método replace());
nome_trocado = nome.replace('A', 'I');

# Condição para caso não tenha a letra 'A'
if nome_trocado == nome_trocado:
    nome_trocado = nome.replace('E', 'O');

print(f"O nome original: {nome} agora com a troca: \033[33m{nome_trocado}\033[m\n");

# Mostre o número de ocorrências da letra 'e'.
quantidade_de_e = nome.count('E');
print(f"Quantidade de vezes que a letra \033[33m'E'\033[m aparece é: \033[33m{quantidade_de_e}\033[m\n");