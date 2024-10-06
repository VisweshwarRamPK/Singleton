package com.example.jdbc.util;

import java.io.IOException;

public class JsonToXmlConverter {
    private static JsonToXmlConverter instance;


    private JsonToXmlConverter() {

    }


    public static JsonToXmlConverter getInstance() {
        if (instance == null) {
            instance = new JsonToXmlConverter();
        }
        return instance;
    }

    public String convertJsonToXml(String json) throws IOException {



        if (json == null || json.isEmpty()) {
            throw new IOException("Input JSON is empty or null");
        }


        return "<root>" + json + "</root>";
    }

    public String convertXmlToJson(String xml) throws IOException {



        if (xml == null || xml.isEmpty()) {
            throw new IOException("Input XML is empty or null");
        }

        return xml.replace("<root>", "").replace("</root>", ""); // Example: remove root element
    }
}
