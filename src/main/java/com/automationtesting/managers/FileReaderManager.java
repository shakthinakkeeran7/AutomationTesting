package com.automationtesting.managers;

import com.automationtesting.cucumber.ScenarioContext;
import com.automationtesting.dataProvider.*;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;

	public FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

	public JsonDataReader getJsonReader() {
		return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
	}

}
