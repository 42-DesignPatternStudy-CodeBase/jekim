import sys

file_path = sys.argv[1]

def check_duplicates(filename):
    with open(filename, 'r') as file:
        numbers = file.read().split()
        numbers = [int(number) for number in numbers]
        if len(numbers) != len(set(numbers)):
            print("There are duplicated numbers in the list.")
        else:
            print("There are no duplicated numbers in the list.")

def main():
    print(f"file_path: {file_path}")
    check_duplicates(file_path)

if __name__ == "__main__":
    main()