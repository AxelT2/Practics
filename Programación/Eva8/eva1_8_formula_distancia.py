# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

print("Introduzca la velocidad inicial")
inicial = float(input())
print("Introduzca la velocidad final")
final = float(input())
print("Introduzca el tiempo")
time = float(input())
acel = (inicial + final) / 2 * time
print(str(acel) + str(" metros"))
