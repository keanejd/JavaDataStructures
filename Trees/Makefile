JC = javac
JARFILE = ../zoo/zoo.jar
SRC = TreeNode.java 

all: $(SRC)
	$(JC) -cp $(JARFILE) $(SRC)

run: all
	java -cp .:$(JARFILE) Main > Linear_results.txt

clean:
	rm -f *.class

.PHONY: all run clean 