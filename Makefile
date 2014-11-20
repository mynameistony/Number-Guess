all: clean c cpp java python shell 

clean:
	rm ./execs/*

run:
	sh ./RunAll.sh

python:
	cp ./sources/numberGuess.py ./execs/Python.py

shell:
	cp ./sources/numberGuess.sh ./execs/ShellScript.sh

java:
	javac -d ./execs/ ./sources/numberGuess.java

c:
	gcc ./sources/numberGuess.c -o ./execs/C

cpp:
	g++ ./sources/numberGuess.cpp -o ./execs/C++

