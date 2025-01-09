package org.json;

import java.util.ArrayList;
import java.util.List;
public class ParseJson {
    public List<Object> getValues(JSONObject json, String key){
        List<Object> values = new ArrayList<>();
        getValuesHelper(json, key, values);
        return values;
    }

    private void getValuesHelper(JSONObject json, String key, List<Object> values) {
        boolean exists = json.has(key);
        if(!exists){
            for(String nextKey: json.keySet()){
                try{
                    if(json.get(nextKey) instanceof JSONObject){
                        getValuesHelper(json.getJSONObject(nextKey), key, values);
                    }else if (json.get(nextKey) instanceof JSONArray){
                        JSONArray innerJson = json.getJSONArray(nextKey);
                        for (int i = 0; i < innerJson.length(); i++) {
                            JSONObject innerObject =innerJson.getJSONObject(i);
                            getValuesHelper(innerObject, key, values);
                        }
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }else {
            values.add(json.get(key));
        }
    }
}
