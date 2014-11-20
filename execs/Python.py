import random
print "Python Random Number Guess"

random.seed()

rand = random.randint(0,100)

guess = 0

while(guess != rand):
	print "Enter Guess:",
	guess = input()

	if(guess > rand):
		print "Too High"
	if(guess < rand):
		print "Too Low"

print "You Got It!\n"

