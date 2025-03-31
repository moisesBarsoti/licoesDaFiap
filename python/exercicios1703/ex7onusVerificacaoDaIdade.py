"""
7 - exercício bônus.
    Pergunte o ano em que o usuário nasceu.
    (a) Calcule e informe sua idade

    (b) (PRÓXIMA MATÉRIA! COMANDO "if")
    Se o usuário é menor de idade, imprima uma
    mensagem dizendo que é necessário obter autorização
    para usar o sistema.   
"""

# Selecionando Elementos
idade = int(input("Digite a sua idade"));

# Verificação da idade
if idade >= 18:
    print("Você é liberado para utilizar o sistema!");
else:
    print("É necessário obter uma autorização!");
