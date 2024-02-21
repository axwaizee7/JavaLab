"""
This file is for running all the java files in the directory together one by one.
After the first '.java' file is executed it will prompt you to run the next file.
You can press 'Enter' or 'Y', 'yes' to continue with next '.java' file or Exit with input of anything else.
"""

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
        print(f"\n\033[93m(Script) Executing: \033[94m{f}\033[0m\n\n")
        os.system(f"java {f}")
        if index < len(java_files) - 1:
            c = input("\n\n\033[93m(Script) Would you like to continue running the java programs? (\033[92mY or 'Enter'\033[93m/\033[91mN\033[93m)\033[0m").lower()
            if c not in ['', "yes", 'y', 'ye']:
                print("\n\033[93m(Script) Terminating the script...\033[0m")
                break
        else:
            print("\n\n\033[93m(Script) There comes the end of java files in the folder!!\033[0m")