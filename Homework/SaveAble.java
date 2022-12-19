package Homework;

import java.io.IOException;
import java.util.Map;

public interface SaveAble {
	void saveAs(Map<String, Double> map, String fileName) throws IOException;
}
