import sys

def main():
    print("Number of commandline arguments are :",len(sys.argv))
    print("Datatype of argv is:",type(sys.argv))
    print("First command line arument is :",sys.argv[0])
    print("Second command line arument is :",sys.argv[1])
    print("Third command line arument is :",sys.argv[2])
    print("Forth command line arument is :",sys.argv[3])


if __name__ == "__main__":    
    main()