player1 = input("Palyer1 Please Enter Rock-Paper-Scissors: ").lower()
player2 = input("Palyer2 Please Enter Rock-Paper-Scissors: ").lower()

print("Player1 has entered - " + player1)
print("Player2 has entered - " + player2)

if player1 == player2:
    print("It's a tie..!! Both players enter the same input " + player1)
elif player1 == "rock":
    if player2 == "scissors":
        print("Rock wins")
    else:
        print("Paper wins")
elif player1 == "scissors":
    if player2 == "paper":
        print("Scissors wins")
    else:
        print("Rock wins")
elif player1 == "paper":
    if player2 == "rock":
        print("Paper wins")
    else:
        print("Scissors wins")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")