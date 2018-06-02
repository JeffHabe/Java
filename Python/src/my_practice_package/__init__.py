

a, b = 0, 1
while b < 1000:
    #print('b = ', b, end=',')
    print('a = ' + str(a))
    a, b = b, a + b
    print("因為 a+b,所以 b=",b)
    
