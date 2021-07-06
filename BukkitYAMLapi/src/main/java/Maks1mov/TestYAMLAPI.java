package Maks1mov;

import java.io.File;
import java.io.IOException;

import bukkitYaml.InvalidConfigurationException;
import bukkitYaml.YAML;

public class TestYAMLAPI {

	public static void main(String args[]) throws IOException, InvalidConfigurationException {
		
		YAML config = new YAML(new File("test.yml"));
		
		config.getYAML().set("Test", "Hello");
		config.getYAML().set("Test2", true);
		config.getYAML().set("Test3", 3);
		config.getYAML().set("Test.test", "hi");
		
		config.save();
		config.reload();
	}
}
