import datetime;

# Definindo data e horário padrão
data_atual = datetime.datetime.now();

# Definindo data e horário padrão Brasil
data_atual_brasil = data_atual.strftime("%d/" "%m/" "%Y");
horario_brasil = data_atual.strftime("%H:" "%M:" "%S");

print(f"\nData: {data_atual_brasil}");
print(f"Horas {horario_brasil}\n");