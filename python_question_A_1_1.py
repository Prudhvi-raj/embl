# importing the required module using python 2
import random 

# using the sample() method on a sequence of numbers 
n = 10
UpdatedList = random.sample(range(1, n+1), n) 

# displaying random selections without repetition 
print UpdatedList
