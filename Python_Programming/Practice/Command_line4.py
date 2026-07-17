import sys

def main():
    print("Number of commandline arguments are :",len(sys.argv))
    
    print("List of commandline argument are:")

    #loop
    for i in sys.argv:
        print(i)
        


if __name__ == "__main__":    
    main()