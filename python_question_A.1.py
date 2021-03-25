#importing random int generator
from random import randint

#foo function
def foo(length):
  #intializing a list
  list = []
  #declaring a boolean
  is_done = False

  #while loop with condition
  while (is_done == False):
    #generating a random number between 1 - 10
    r = randint(1,length)
    is_found = False

    #iterating the list
    for n in list:

      #condition to break the for loop to create non repeated values in list
      if (n==r):
        is_found = True
        break
    #appending the random values to list if its not in list
    if (is_found == False):
      list.append(r)

    #Check the no.of random values we've generated in the list if it matches with the input variable then done
    if (len(list) == length):
      is_done = True

  # returning the created list
  return list

#calling the above function and assigning it to a variable
x = foo(10)

#printing the list
print x