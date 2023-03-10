nombre = input ("ingresa tu nombre:")
apellido = input ("ingresa tu apellido:")
edad = input ("ingresa tu edad:")
edad = int(edad)


if(edad >=18 and edad <=69):
    ingresos = input("ingresa tus ingresos:")
    ingresos = float(ingresos)

    if(ingresos <=10000):
        print("usted no es candidato para tramitar un credito con nosotros. Adios bizcocho")
    if(ingresos >10000 and ingresos <=25000):
        print("usted es candidato para nuestra segmentacion clásica. Adios")
    if(ingresos >25000 and ingresos<=35000):
        print("usted es candidato para nuestra segmentacion oro. Adios")
    if(ingresos >35000):
        print("usted es candidato para nuestra segmentacion clásica. Adios.")
else:
    print("no puede solicitar el credito bancario, debe tener entre 18 y 69 años")
