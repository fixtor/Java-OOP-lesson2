package Homework;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<String, Double> map = new LinkedHashMap<>();
		map.put("Иванов Иван", 4.6);
		map.put("Мария Кузнецова", 5.0);
		map.put("Степан Кузьмин", 3.8);
		map.put("Сергеев Виктор", 4.0);

		InformationText informationText = new InformationText(map);
		System.out.println(informationText.getMapPerson());

		SaveAble jsonSaveAble = new JsonDocument(informationText.getMapPerson());
		SaveAble txtSaveAble = new TxtDocument(informationText.getMapPerson());
		SaveAble xmlSaveAble = new XmlDocument(informationText.getMapPerson());
		jsonSaveAble.saveAs(informationText.getMapPerson(), "I:\\\\Maven_Projects\\\\Lesson 7\\\\Homework\\\\json.json");
		txtSaveAble.saveAs(informationText.getMapPerson(), "I:\\Maven_Projects\\Lesson 7\\Homework\\text.txt");
		xmlSaveAble.saveAs(informationText.getMapPerson(), "I:\\Maven_Projects\\Lesson 7\\Homework\\xml.xml");
	}
}
