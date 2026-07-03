SRC = src/
TARGETS = $(SRC)main.java  $(SRC)*.java

all:
	java $(TARGETS)