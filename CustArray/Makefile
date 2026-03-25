JC = javac
JARFILE = ../zoo/zoo.jar
SRC = CustArray.java TestArray.java Main.java

all: $(SRC)
	$(JC) -cp $(JARFILE) $(SRC)

run: all
	java -cp .:$(JARFILE) Main > CustArray_results.txt

clean:
	rm -f *.class

.PHONY: all run clean 