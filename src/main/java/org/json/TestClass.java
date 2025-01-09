package org.json;

import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        String inputJson = "{\n" +
                "    \"myObjects\": [\n" +
                "        {\n" +
                "            \"code\": \"PQ\",\n" +
                "            \"another_objects\": [\n" +
                "                {\n" +
                "                    \"attr1\": \"123\",\n" +
                "                    \"attr2\": \"value2\",\n" +
                "                    \"attrN\": \"valueN\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"attr1\": \"value1\",\n" +
                "                    \"attr2\": \"value2\",\n" +
                "                    \"attrN\": [\n" +
                "                        {\n" +
                "                            \"test1\": \"value1\",\n" +
                "                            \"test3\": \"value2\",\n" +
                "                            \"test2\": [\n" +
                "                                1,\n" +
                "                                2,\n" +
                "                                3,\n" +
                "                                4,\n" +
                "                                5\n" +
                "                            ]\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"test1\": \"value1\",\n" +
                "                            \"test2\": \"value2\",\n" +
                "                            \"test3\": {\n" +
                "                                \"abc\": \"123\",\n" +
                "                                \"abc1\": \"value2\",\n" +
                "                                \"abc3\": \"valueN\"\n" +
                "                            }\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        JSONObject inputJSONObject = new JSONObject(inputJson);

        ParseJson json = new ParseJson();
        List<Object> outputData = json.getValues(inputJSONObject, "test3");
        System.out.println(outputData);
    }
}
