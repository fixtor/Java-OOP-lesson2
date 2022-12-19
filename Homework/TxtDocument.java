package Homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class TxtDocument extends InformationText implements SaveAble {

	public TxtDocument(Map<String, Double> mapPerson) {
		super(mapPerson);
	}

	@Override
	public void saveAs(Map<String, Double> map, String fileName) throws IOException {
		PrintWriter pw = new PrintWriter(fileName);
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Double> item : map.entrySet()) {
			sb.append(item.getKey());
			sb.append(" = ");
			sb.append(item.getValue());
			sb.append("\n");
		}
		pw.println(sb);
		pw.close();
	}
}
