package Homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class JsonDocument extends InformationText implements SaveAble {

	public JsonDocument(Map<String, Double> mapPerson) {
		super(mapPerson);
	}

	@Override
	public void saveAs(Map<String, Double> map, String fileName) throws IOException {
		StringBuilder stringBuilder = new StringBuilder("{");
		PrintWriter pw = new PrintWriter(fileName);
		int count = map.size();
		for (Map.Entry<String, Double> item : map.entrySet()) {
			stringBuilder.append("\"");
			stringBuilder.append(item.getKey());
			stringBuilder.append(" : ");
			stringBuilder.append(item.getValue());
			stringBuilder.append("\"");
			stringBuilder.append(",");
		}
		stringBuilder.deleteCharAt(stringBuilder.length()-1);
		stringBuilder.append("}\n");
		pw.println(stringBuilder);
		pw.close();
	}
}
