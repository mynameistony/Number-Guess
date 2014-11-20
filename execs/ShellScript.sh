#!/bin/bash

echo "Shell Script Number Guess"

rand=$(($RANDOM % 100))

guess=0

while [ $guess -ne $rand ]
do
	echo -n "Enter Guess: "
	read guess
	if [ $guess -gt $rand ]
	then
		echo "Too High"
	fi

	if [ $guess -lt $rand ]
	then
		echo "Too Low"
	fi
done

echo -e "You Got It!\n"

exit 0
