#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

int main(){
	int guess, random;

	srand(time(NULL));

	random = rand() % 100;

	cout << "C Plus Plus Random Number Guess" << endl;

	while(guess != random){
		cout << "Enter Guess: ";
		cin >> guess;

		if(guess > random)
			cout << "Too High" << endl;

		if(guess < random)
			cout << "Too Low" << endl;

	}

	cout << "You Got It!\n\n";

	return 0;

}
