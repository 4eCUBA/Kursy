package script;

import org.json.JSONObject;
import org.json.JSONArray;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class HttpRequestExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        String url = "https://iconv.mono.st4g3.com/api/tran/supplement";
        long startId = 129433922;
        String date = "2024-02-01T10:55:03";
        String uid = "8DCCE7451D9BDADDE053050310AC34FB";
        String acc = "26200340267687";
        String clientId = "1000033715";


        for (int i = 0; i < 101; i++) {
            JSONObject data = new JSONObject();
            data.put("id", Long.toString(startId + i));
            data.put("acc", acc);
            data.put("clientId", clientId);
            data.put("dateTime", date);
            data.put("typeOper", "ONLINE");
            data.put("kind", "TOT");
            data.put("cardProduct", "2");

            JSONObject tranProc = new JSONObject();
            tranProc.put("AMOUNT", 81.00);
            tranProc.put("AMOUNTACCT", 81.00);
            tranProc.put("AMOUNTORIG", 81.00);
            tranProc.put("APPROVALCODE", "493115");
            tranProc.put("AUTHFIID", 3);
            tranProc.put("AUTHPSNAME", "FTB1");
            tranProc.put("AVAILBALANCE", 144.02);
            tranProc.put("AVAILBALANCE2", 4672.11);
            tranProc.put("BALANCECURRENCYACCT", 0);
            tranProc.put("CURRENCY", 980);
            tranProc.put("CURRENCYACCT", 840);
            tranProc.put("CURRENCYORIG", 980);
            tranProc.put("DRAFTCAPTURE", 1);
            tranProc.put("EXCHANGERATEACCT", 31.939394);
            tranProc.put("FEE", 0);
            tranProc.put("FROMACCT", "26203300224571");
            tranProc.put("FROMACCTDESCR", "BB=4682.65;BA=4672.11");
            tranProc.put("ID", 21045436);
            tranProc.put("INVOICENUM", "MDHVAW4GY0416");
            tranProc.put("ISSUERFEE", 0);
            tranProc.put("MESSAGE", 0);
            tranProc.put("ORIGTIME", date);
            tranProc.put("OVERDRAFTLIMIT", 0);
            tranProc.put("PAN", "537541******6301");
            tranProc.put("PHASE", 21);
            tranProc.put("POSCONDITION", 91);
            tranProc.put("POSENTRYMODE", 71);
            tranProc.put("RESPCODE", 1);
            tranProc.put("TERMCITY", "LVOV");
            tranProc.put("TERMCLASS", 2);
            tranProc.put("TERMCOUNTRY", 826);
            tranProc.put("TERMFIID", 11);
            tranProc.put("TERMINSTID", "006250");
            tranProc.put("TERMLOCATION", "LVOV");
            tranProc.put("TERMNAME", "S1LV0XTL");
            tranProc.put("TERMOWNER", "SiLPO");
            tranProc.put("TERMPSNAME", "MC");
            tranProc.put("TERMRETAILERNAME", "MAGAZINSLPO");
            tranProc.put("TERMSIC", 3114);
            tranProc.put("TIME", date);
            tranProc.put("TRANCODE", 110);
            tranProc.put("TRANNUMBER", "000178881429");
            tranProc.put("TYPE", 100);
            tranProc.put("stmConv_112trancode", 2866);
            tranProc.put("stmConv_main", 2152);
            tranProc.put("uuid", uid);

            data.put("tranProc", tranProc);

            // Добавляем данные crm
            JSONObject crm = new JSONObject();
            crm.put("111", "29.12");
            crm.put("156", "INTERNET");
            crm.put("113", "-1244.61");
            crm.put("18", "37660000_479609");
            crm.put("19", "Ryanair Head Office");
            crm.put("ID", "B00405");
            crm.put("160", "VISA");
            crm.put("20", "Dublin");
            crm.put("dc", "D");
            data.put("crm", crm);

            // Добавляем данные fterm
            JSONObject fterm = new JSONObject();
            fterm.put("lat", 49.808445);
            fterm.put("lon", 23.978577);
            fterm.put("icon", "silpo");
            fterm.put("retailer", "silpo");
            fterm.put("id", "001110_MAGAZINATB");
            JSONObject attrsByLang = new JSONObject();
            attrsByLang.put("UK", new JSONObject().put("name", "Silpo"));
            attrsByLang.put("RU", new JSONObject().put("name", "Silpo"));
            fterm.put("attrsByLang", attrsByLang);
            fterm.put("geolocation", true);
            data.put("fterm", fterm);

            // Добавляем пустые объекты tranProcB, partner, additionalInfo, bonus (если нужно)
            data.put("tranProcB", new JSONObject());
            data.put("partner", new JSONObject());
            data.put("additionalInfo", new JSONObject());
            JSONObject bonus = new JSONObject();
            bonus.put("bonusCategories", new JSONArray(Arrays.asList("25")));
            data.put("bonus", bonus);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("Accept", "application/json")
                    .header("sid", "240201cc6XXg5f5c01f15")
                    .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                    .build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println("Request " + (i + 1) + ", Response: " + response.statusCode());
                // Здесь можно добавить обработку ответа
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
