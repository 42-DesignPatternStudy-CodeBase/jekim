JARFILE_NAME = template_project.jar

SOURCE_PATH = src
TARGET_PATH = target

CHECKER_PATH = ./checker
CHECKER_SRC = checker.py
all :
	@$(MAKE) compile
	@$(MAKE) run

compile : 
	@mvn package

run :
	@java -jar $(TARGET_PATH)/$(JARFILE_NAME) >> result.txt
	python3 $(CHECKER_PATH)/$(CHECKER_SRC) result.txt
	# rm result.txt

clean :
	@mvn clean