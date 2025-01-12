# import pandas
import pandas

# Read the CSV file and store it into a DataFrame
dataframe = pandas.read_csv('login_credientials.csv')

# Print the full data
print("Full Data: ")
print(dataframe)

print("Usernames:")
print(dataframe["Usernames"])

print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("Data sorted in ascending Usernames: ")
print(dataframe.sort_values("Usernames"))


print("Data sorted in descending Passwords: ")
print(dataframe.sort_values("Passwords", ascending=False))