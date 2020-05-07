.PHONY: antlr
antlr:
	java -jar ./antlr4.jar $(GRAMMAR_FILE) -o generated

.PHONY: compile
compile:
	[ -d "./target/" ] && rm -v -f ./target/* || mkdir ./target/
	echo "Compiling..."
	javac -verbose -d ./target/ -cp ./antlr4.jar generated/*.java
