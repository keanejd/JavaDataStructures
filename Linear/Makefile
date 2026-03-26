JC = javac
JARFILE = ../zoo/zoo.jar
SRC = Queue.java Stack.java DoubleList.java DoubleNode.java Main.java

all: $(SRC)
	$(JC) -cp $(JARFILE) $(SRC)

run: all
	java -cp .:$(JARFILE) Main > DoubleList_results.txt

clean:
	rm -f *.class

.PHONY: all run clean 