"""
3. Conversão de anos em meses e dias.
Peça ao usuário que digite uma quantidade de anos.
(Pode ser a idade do usuário, se quiser)
    (a) Mostre esse tempo em meses
    (b) Mostre esse tempo em dias
"""

# Selecionando o ano
digiteUmAno = int(input("Digite um ano: "));

# Mostrar em meses
mostrarEmMeses = digiteUmAno * 12;
print(f"A quantidade em meses: {mostrarEmMeses}");

# Mostrar em dias
mostrarEmDias = digiteUmAno * 365;
print(f"A quantidade em dias: {mostrarEmDias}");