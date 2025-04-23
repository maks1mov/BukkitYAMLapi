package bukkitYaml;

import java.io.File;
import java.io.IOException;

import bukkitYaml.file.FileConfiguration;
import bukkitYaml.file.YamlConfiguration;

public class YAML {

	private File file;
	private FileConfiguration YAML;

	public YAML(File file) {

		try {
			this.file = file;

			YAML = new YamlConfiguration();

			if (!file.exists())
				file.createNewFile();

			else
				YAML.load(file);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public FileConfiguration getYAML() {
		return YAML;
	}

	public void save() {
		try {
			YAML.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void reload() {

		try {
			if (file.exists()) {
				YAML.save(file);
				YAML.load(file);
			}

			else
				YAML.save(file);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
