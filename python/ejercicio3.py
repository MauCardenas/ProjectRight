#Desarrolar un programa que le pida al usuario su nombre, edad, precio de su carro calcular el precio de la tenencia


nombre = input("ingresa tu nombre")
edad = input("ingresa tu edad")
precio = input ("ingresa el precio de tu carro")

precio = float(precio)
tenencia = 0.013

pago = precio * tenencia

print("precio tenencia ", pago)
n1 = input("ingresa el primer numero")
n2 = input("ingresa el segundo numero")
n3 = input("ingresa el tercer numero")

n1 = float(n1)
n2 = float(n2)
n3 = float(n3)

if n1 > n2 and n1 > n3:
    print("el primer num es mayor")
if n2 > n1 and n2 > n3:
    print("el segundo num es mayor")
if n3 > n1 and n3 >  n2:
    print("el tercer num es mayor")
