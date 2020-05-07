.PHONY: antlr
antlr:
	java -jar ./antlr4.jar $(GRAMMAR_FILE) -o generated