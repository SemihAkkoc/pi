import math,random

value = int(input('Enter value:'))
in_circle=0
total=0

for i in range(value):
    x = random.uniform(0,1)
    y = random.uniform(0,1)

    distance = math.sqrt(x**2+y**2)
    if distance <= 1:
        in_circle += 1
    total +=1

pi_est = 4*in_circle/total
print(pi_est)
