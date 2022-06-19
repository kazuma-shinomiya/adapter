package exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileProperties implements FIleIO {
    Properties properties = new Properties();

    @Override
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileReader(fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileWriter(fileName), "written");
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
