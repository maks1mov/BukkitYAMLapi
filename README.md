# BukkitYAMLapi
BukkitYAML api from Bukkit API

This is a simple API for working with YAML files from Bukkit.

Maven:

		<dependency>
			<groupId>BukkitYAMLapi</groupId>
			<artifactId>BukkitYAMLapi</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
    
How to use (example):

		YAML config = new YAML(new File("test.yml"));
		
		config.getYAML().set("Test", "Hello");
		config.getYAML().set("Test2", true);
		config.getYAML().set("Test3", 3);
		config.getYAML().set("Test.test", "hi");
		
		config.save();
		config.reload();
