
package com.kpjavaspringboot.kprestproxyclient;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

@RestController
@Slf4j
public class KPRESTProxyClientController {

    public KPRESTProxyClientController() {
        // TODO Auto-generated constructor stub
    }

    @PostMapping(value = "/getKPRESTProxyClientData"
            ,produces = { "application/json" }
            ,consumes = { "application/json" }
    )
    public ResponseEntity<HashMap> getMessage(){
        HashMap resp = new HashMap();
        //resp.put("message","KP : Hi KPRESTProxyClientController");

        String token = getBearerToken();
        String respData = getRespData(token);
        //String respData = getRespData();

        resp.put("message","KP : Hi KPRESTProxyClientController");
        resp.put("response", respData.toString());

        return ResponseEntity.ok(resp);
    }

    public static String getRespData(String token) {


        String wsURL = "https://eu2qaasp02cynch.azurewebsites.net/api/user-details";
        URL url = null;
        URLConnection connection = null;
        HttpURLConnection httpConn = null;
        String responseString = null;
        String outputString = "";
        ByteArrayOutputStream bout = null;
        OutputStream out = null;
        InputStreamReader isr = null;
        BufferedReader in = null;

        try {
            url = new URL(wsURL);
            connection = url.openConnection();
            httpConn =  (HttpURLConnection) connection;

            String tokenBearer = "Bearer " + token;
            //httpConn.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWFkZXIiOnsidXNlcklkIjoiOTg5MGNhZDAtYmQ2My0xMWViLTgwODAtYzk0ZmMzNThlOGQwIiwibG9naW5JZCI6MzgxfSwiaWF0IjoxNjUwODkzMTM3LCJleHAiOjE2NTA5Nzk1Mzd9.72wHm_lpg-O1d87wLWsCw17Ur-iQOFJqeok3OxI8AYw"	);
            httpConn.setRequestProperty("Authorization", tokenBearer);
            httpConn.setRequestProperty("Accept", "*/*");
            //httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            httpConn.setRequestProperty("Connection", "keep-alive");
            httpConn.setRequestMethod("GET");
            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);

            //Read the response and write it to the Standard I/O
            isr = new InputStreamReader(httpConn.getInputStream());
            in = new BufferedReader(isr);
            while((responseString = in.readLine()) != null) {
                outputString = outputString + responseString;
            }
            System.out.println("");
            System.out.println("KP : KPRESTProxyClientController Response : \n" + outputString.toString());
            System.out.println("");


        }
        catch(Exception ex) {ex.printStackTrace();}

        return outputString;

    }

    public static String getRespData() {


        String wsURL = "https://eu2qaasp02cynch.azurewebsites.net/api/user-details";
        URL url = null;
        URLConnection connection = null;
        HttpURLConnection httpConn = null;
        String responseString = null;
        String outputString = "";
        ByteArrayOutputStream bout = null;
        OutputStream out = null;
        InputStreamReader isr = null;
        BufferedReader in = null;

        try {
            url = new URL(wsURL);
            connection = url.openConnection();
            httpConn =  (HttpURLConnection) connection;

            String tokenBearer = "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWFkZXIiOnsidXNlcklkIjoiOTg5MGNhZDAtYmQ2My0xMWViLTgwODAtYzk0ZmMzNThlOGQwIiwibG9naW5JZCI6MzgzfSwiaWF0IjoxNjUwOTEyNDE2LCJleHAiOjE2NTA5OTg4MTZ9.AGNEeh4FuGLFt2Ib-HG9QJR-YZ3edkuud6gXQxkqxgE";
            //httpConn.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWFkZXIiOnsidXNlcklkIjoiOTg5MGNhZDAtYmQ2My0xMWViLTgwODAtYzk0ZmMzNThlOGQwIiwibG9naW5JZCI6MzgxfSwiaWF0IjoxNjUwODkzMTM3LCJleHAiOjE2NTA5Nzk1Mzd9.72wHm_lpg-O1d87wLWsCw17Ur-iQOFJqeok3OxI8AYw"	);
            httpConn.setRequestProperty("Authorization", tokenBearer);
            httpConn.setRequestProperty("Accept", "*/*");
            //httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            httpConn.setRequestProperty("Connection", "keep-alive");
            httpConn.setRequestMethod("GET");
            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);

            //Read the response and write it to the Standard I/O
            isr = new InputStreamReader(httpConn.getInputStream());
            in = new BufferedReader(isr);
            while((responseString = in.readLine()) != null) {
                outputString = outputString + responseString;
            }
            System.out.println("");
            System.out.println("KP : KPRESTProxyClientController Response : \n" + outputString.toString());
            System.out.println("");


        }
        catch(Exception ex) {ex.printStackTrace();}

        return outputString;

    }



    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        String token = getBearerToken();
        //Thread.sleep(10000);
        //String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWFkZXIiOnsidXNlcklkIjoiOTg5MGNhZDAtYmQ2My0xMWViLTgwODAtYzk0ZmMzNThlOGQwIiwibG9naW5JZCI6MzgxfSwiaWF0IjoxNjUwODkzMTM3LCJleHAiOjE2NTA5Nzk1Mzd9.72wHm_lpg-O1d87wLWsCw17Ur-iQOFJqeok3OxI8AYw";
        System.out.println("KP : KPRESTProxyClientController Token : \n" + token.toString());
        System.out.println("");
        //Thread.sleep(3000);
        String respData = getRespData(token);
        //String respData = getRespData();

    }

    public static String getBearerToken() {

        String wsURL = "https://eu2qaasp02cynch.azurewebsites.net/api/auth/login";
        URL url = null;
        URLConnection connection = null;
        HttpURLConnection httpConn = null;
        String responseString = null;
        String outputString = "";
        ByteArrayOutputStream bout = null;
        OutputStream out = null;
        InputStreamReader isr = null;
        BufferedReader in = null;
        //String xmlInput = "";

        String xmlInput = "{"
                +" \"email\": \"User@email.com\", "
                +" \"password\": \"Password2bChanged\" "
                +"}";

        try {
            url = new URL(wsURL);
            connection = url.openConnection();
            httpConn = (HttpURLConnection) connection;

            byte[] buffer = new byte[xmlInput.length()];
            buffer = xmlInput.getBytes();

            httpConn.setRequestProperty("Content-Length", String.valueOf(buffer.length));
            httpConn.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
            httpConn.setRequestProperty("Accept", "*/*");
            //httpConn.setRequestProperty("Accept-Encoding", "gzip, deflate, br");
            httpConn.setRequestProperty("Connection", "keep-alive");
            httpConn.setRequestMethod("POST");

            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);
            out = httpConn.getOutputStream();
            out.write(buffer);
            System.out.println("KP : KPRESTProxyClientController Request : \n" + out.toString());
            out.close();

            //Read the response and write it to the Standard I/O
            isr = new InputStreamReader(httpConn.getInputStream());
            in = new BufferedReader(isr);
            while ((responseString = in.readLine()) != null) {
                outputString = outputString + responseString;
            }
            //outputString = "{  \"token\": \"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJoZWFkZXIiOnsidXNlcklkIjoiOTg5MGNhZDAtYmQ2My0xMWViLTgwODAtYzk0ZmMzNThlOGQwIiwibG9naW5JZCI6MzgyfSwiaWF0IjoxNjUwOTA4OTk4LCJleHAiOjE2NTA5OTUzOTh9.VnZN9Y37qdVND68YL3gWJ63SPguYtW7Hi59dGe0tzeQ\",  \"cartCount\": 1,  \"user\": {    \"header\": {      \"userId\": \"9890cad0-bd63-11eb-8080-c94fc358e8d0\",      \"loginId\": 382    },    \"body\": {      \"addresses\": [        {          \"addressId\": 1188,          \"street1\": \"15787 Northup Way NE\",          \"street2\": \"\",          \"city\": \"Bellevue\",          \"state\": \"WA\",          \"zipcode\": \"98007\",          \"description\": \"Registered Address\",          \"isPrimaryDeliveryAddress\": true,          \"longitude\": -122.142434,          \"latitude\": 47.602566,          \"isCoordsSuggested\": true        }      ],      \"paymentInformation\": [],      \"billingAddress\": [],      \"firstName\": \"Kailash\",      \"lastName\": \"Pasumarthy\",      \"phone\": \"6099221794\",      \"email\": \"kailash.pasumarthy@gmail.com\",      \"marketingOptIn\": true,      \"reminderInterval\": 0,      \"orderEmailNotificationOptIn\": false,      \"creditBalance\": null    }  }}";

            //Gson gson = new Gson();
            //String token = gson.getString("token");
            JSONObject json = new JSONObject(outputString);
            String token = json.getString("token");
            outputString = token;

            System.out.println("");
            System.out.println("KP : KPRESTProxyClientController Response : \n" + outputString.toString());
            System.out.println("");
            System.out.println("KP : KPRESTProxyClientController Token : \n" + token.toString());



        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return outputString;
    }
}
