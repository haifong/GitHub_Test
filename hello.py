import os
import datetime

current_path = os.getcwd()

current_time = datetime.datetime.now().strftime("%H%M%S")

file_name = os.path.join(current_path, f"{current_time}.txt")

with open(file_name, 'w') as file:
    file.write("This file is created based on the current time.")

print(f"File '{file_name}' created successfully in the directory {current_path}.")



print("Hello!!!")
#exit(1)
