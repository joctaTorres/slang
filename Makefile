.PHONY: antlr
antlr:
	java -jar ./antlr4.jar $(GRAMMAR_FILE) -o generated

.PHONY: compile
compile:
	javac -cp ./antlr4.jar generated/*.java
