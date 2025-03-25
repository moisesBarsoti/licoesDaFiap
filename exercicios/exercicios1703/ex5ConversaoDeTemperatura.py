"""
5. Conversão de temperatura.
    (a) Pergunte a temperatura em Fahrenheit;
        Mostre o valor da temperatura em Celsius
    (b) Pergunte a temperatura em Celsius;
        Mostre o valor a temperatura em Fahrenheit.
"""

# Fahrenheit - Celsius
temperaturaEmFahrenheit = float(input("Digite a temperatura em Fahrenheit: "));
fahrenheitParaCelsius = int((temperaturaEmFahrenheit - 32) / 1.8);
print(f"Fahrenheit para celsius: {fahrenheitParaCelsius}ºC \n");


# Celsius - Fahrenheit
temperaturaEmCelsius = float(input("Digite a temperatura em Celsius: "));
CelsiusParaFahrenheit = int(temperaturaEmCelsius * 1.8 + 32);
print(f"Celsius para fahrenheit: {CelsiusParaFahrenheit}ºF");
