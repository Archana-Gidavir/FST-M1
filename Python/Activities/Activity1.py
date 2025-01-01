name = input("Enter your name:")
age = input("Enter your age:")

print("Your name is " + name + " and age is " + age)

intAge = 100 - int(age)
year = 2025 + (intAge)

ageAfter = "you will be 100 years old in year {} that is after {} years "
print(ageAfter.format(year, intAge))