package Homework;

import java.beans.XMLEncoder;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class XmlDocument extends InformationText implements SaveAble{
	public XmlDocument(Map<String, Double> mapPerson) {
		super(mapPerson);
	}

	@Override
	public void saveAs(Map<String, Double> map, String fileName) throws IOException {
		PrintWriter pw = new PrintWriter(fileName);
		StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
		sb.append("<students>");
		for (Map.Entry<String, Double> item : map.entrySet()) {
			sb.append("\t<student>\n");
			sb.append("\t\t<name>");
			sb.append(item.getKey());
			sb.append("</name>\n");
			sb.append("\t\t<grade>");
			sb.append(item.getValue());
			sb.append("</grade>\n");
			sb.append("\t</student>\n");
		}
		sb.append("</students>");
		pw.println(sb);
		pw.close();
	}
}
