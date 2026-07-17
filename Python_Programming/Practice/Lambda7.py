def Power(X,Y):
    Result = 1
    
    for i in range(Y):
        Result = Result * X
    return Result 

ret = Power(10,7)

print("Result is :",ret)