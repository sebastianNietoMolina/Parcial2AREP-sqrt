package app;

import static spark.Spark.*;
import spark.Request;

public class App {

    public static void main(String... args){
        port(getPort());
        get("/sqr", (req, res) -> sqrt(req));
    }

    public static String sqrt(Request req)  {
        String num = req.queryParams("value");
        String data = "{ \"operation \":"+"exp, \"input \":"+num+",\"output \":"+Math.sqrt(Double.parseDouble(num))+"}";
        return data;
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
}
