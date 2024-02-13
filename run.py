import os
import platform
java_files = [f for f in os.listdir() if f.endswith(".java")]
java_files.sort()

def center_text(text):
    terminal_width = os.get_terminal_size().columns
    padding = (terminal_width - len(text)) // 2    
    print(" " * padding + text)

def intro_text():
    if platform.system() == "Windows":
        os.system("cls")
    else:
        os.system("clear")
    print("\033[94m\n")
    center_text("Java Program Runner Script")
    center_text("--------------------------")
    print("\n\n\033[0m")


intro_text()


for index, f in enumerate(java_files):
        os.system(f"java {f}")
        if index < len(java_files) - 1:
            c = input("\n\n\033[93m(Python) Would you like to continue running the java programs? (\033[92mY or 'Enter'\033[93m/\033[91mN\033[93m)\033[0m").lower()
            if c not in ['', "yes", 'y', 'ye']:
                break
        else:
            print("\n\n\033[93m(Python) There comes the end of java files in the folder!!\033[0m")