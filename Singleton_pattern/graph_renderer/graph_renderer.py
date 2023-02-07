import matplotlib.pyplot as plt
import sys

file_path = sys.argv[1]

def get_int_list_from_file(file_path):
    f = open(file_path, "r")
    int_lst = list(map(int, list(filter(lambda x: x != "", f.readlines()[0].split(" ")))))
    f.close()
    return int_lst

def main():
    print(f"file_path: {file_path}")
    plt.plot(get_int_list_from_file(file_path))
    plt.show()
    plt.pause(3)
    plt.close()

if __name__ == "__main__":
    main()