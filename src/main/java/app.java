public class app {

    public static String sqr(String num)  {
        String data = "{ \"operation \":"+"exp, \"input \":"+num+",\"output \":"+Math.sqrt(Double.parseDouble(num))+"}";
        return data;
    }
}
