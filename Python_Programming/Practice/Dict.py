# dict 
# syntax = {key:value}
# Hetero
# ordered
# indexed(not numaric)
# key duplicate allowed but old gets overwritten
# value duplicate allowed
# data mutable(value)

data = {"Name":"Let us c","Author":"Y kanitkar","Price":340,"Publication":"BPB Publication"}
print("Datatype is:",type(data))
print("Length is:",len(data))
print(data)
print(data["Author"])
data["Price"]=400
print(data)

