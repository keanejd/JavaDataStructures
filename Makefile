JC = javac
JARFILE = zoo/zoo.jar
SRC = CustArray.java TestArray.java Main.java

all: zoo $(SRC)
	$(JC) -cp $(JARFILE) $(SRC)

zoo:
	$(MAKE) -C zoo

run: all
	java -cp .:$(JARFILE) Main > CustArray_results.txt

clean:
	$(MAKE) -C zoo clean
	rm -f *.class

.PHONY: all run clean zoo