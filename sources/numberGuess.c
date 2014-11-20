#include <stdio.h>
#include <stdlib.h> 

int main(){

	printf("C Random Number Guess\n");

	int guess = 0;

	srand(time(NULL));

	int random = rand() % 100;

	while(guess != random){

		printf("Enter Guess: ");

		scanf("%d", &guess);

		if(guess < random)
			printf("Too Low\n");

		if(guess > random)
			printf("Too High\n");

	}

	printf("You got it!\n\n");

	return 0;
}
