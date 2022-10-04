package data;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class RegisterJsonReader {
    public String firstName, lastName, email, password;

    public void jsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir")+"/src/test/java/data/registerData.json";
        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray JsonArray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObj : JsonArray){

            JSONObject person = (JSONObject) jsonObj;
            firstName = (String) person.get("firstName");
            lastName = (String) person.get("lastName");
            email = (String) person.get("email");
            password = (String) person.get("password");




        }
    }
}
