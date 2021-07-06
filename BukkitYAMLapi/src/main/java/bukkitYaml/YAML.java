package bukkitYaml;

import java.io.File;
import java.io.IOException;

import bukkitYaml.file.FileConfiguration;
import bukkitYaml.file.YamlConfiguration;

public class YAML {

	private final File file;
	private final FileConfiguration YAML;
	
	public YAML(File file) throws IOException, InvalidConfigurationException {
		
	    this.file = file;
	    
	    YAML = new YamlConfiguration();
	    	
	    if(!file.exists())
	        file.createNewFile();
	    
	    else YAML.load(file);
	}
	
	public FileConfiguration getYAML() {
		return YAML;
	}
	
	public void save() throws IOException {
		YAML.save(file);
	}
	
	public void reload() throws IOException, InvalidConfigurationException {
		
		if(file.exists()) {
			YAML.save(file);
			YAML.load(file);	
		} 
		
		else YAML.save(file);
	}
} 
