# Pergunte a temperatura em Fahrenheit. Imprima "está calor" se a temperatura equivale a mais de 25 graus Celsius.

# Recebendo o valor da temperatura em Fahrenheit
temperatura_fahrenheit = float(input("Digite a temperatura em Fahrenheit: "));

# Fahrenheit - Celsius
temperatura_fahrenheit_para_celsius = int((temperatura_fahrenheit - 32) / 1.8);
print(f"\nA temperatura em celsius: {temperatura_fahrenheit_para_celsius}ºC ");

if temperatura_fahrenheit_para_celsius > 25: 
    print(f"Está calor!\n");