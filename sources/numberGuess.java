import java.io.Console;

class numberGuess {

	public static void main(String args[]) {
		Console console = System.console();
		console.printf("Java Random Number Guess\n");

		int counter = 0;
		while(true){
			counter++;

			console.printf("Enter Guess: ");

			String guess = console.readLine();

			if(counter % 2 == 0)
				console.printf("Too High\n");
			else
				console.printf("Too Low\n");

			if(counter == 7){
				try {
					Thread.sleep(1000);
					console.printf("...");
                                        Thread.sleep(2000);
                                        console.printf("...");
                                        Thread.sleep(3000);
                                        console.printf("...");
                                        Thread.sleep(4000);
 					console.printf(" shit,");
					Thread.sleep(1000);
					console.printf(" I forgot the number...");
					Thread.sleep(1000);
					console.printf("...");
                                        Thread.sleep(2000);
                                        console.printf("...");
                                        Thread.sleep(3000);
                                        console.printf("Bye!\n");
                                        Thread.sleep(3000);
 
				}
				catch(InterruptedException ex){
					Thread.currentThread().interrupt();

				}
				return;
			}
		}

	}
}

