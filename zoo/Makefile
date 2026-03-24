JC =javac
JAR = jar
SRC = zoo/Animal.java zoo/AnimalTest.java
CLASSES = zoo/Animal.class zoo/AnimalTest.class
JARFILE = zoo.jar

all: $(JARFILE)

$(CLASSES): $(SRC)
	$(JC) $(SRC)

$(JARFILE): $(CLASSES)
	$(JC) $(SRC)
	$(JAR) cf $(JARFILE) $(CLASSES)

clean:
	rm -f $(CLASSES) $(JARFILE)

.PHONY: all run clean
