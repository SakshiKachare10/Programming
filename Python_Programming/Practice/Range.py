def main():
    data = range(5)
    print(data)

    print(list(range(5)))  # 01234
    print(list(range(2,6))) # 2345
    print(list(range(2,10,2))) # 2468
    print(list(range(10,4,-1))) # 10 9 8 7 6 5
    print(list(range(20,5,-2))) # 20 18 16 14 12 10 8 6
    print(list(range(2,2)))  

if __name__ == "__main__":
    main()    