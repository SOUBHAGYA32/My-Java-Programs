#https://codewindow.in
#join our telegram channel

from itertools import permutations

r=int(input()) #length
n=input() #taking the input as a string

a = permutations(n, r)
#print(a)

y = [''.join(i) for i in a] # joining the digits to a y
  
y=sorted(y)

q=y.index(n) #finding the index of the input value from the list
#print(q)
print(y[q+1])

# Telegram @codewindow