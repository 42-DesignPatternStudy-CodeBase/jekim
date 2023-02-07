JARFILE_NAME = template_project.jar

SOURCE_PATH = src
TARGET_PATH = target

GRAPH_RENDERER_PATH = ./graph_renderer
GRAPH_RENDERER_SRC = graph_renderer.py
all :
	@$(MAKE) compile
	@$(MAKE) run

compile : 
	@mvn package

run :
	@java -jar $(TARGET_PATH)/$(JARFILE_NAME) >> result.txt
	python3 $(GRAPH_RENDERER_PATH)/$(GRAPH_RENDERER_SRC) result.txt
	rm result.txt

clean :
	@mvn clean