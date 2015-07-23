package tk.hongkailiu.test.app.gson;

import com.google.gson.Gson;
import org.apache.log4j.Logger;

public class TestGson {
    static Logger logger = Logger.getLogger(TestGson.class);

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        logger.debug(new Gson().toJson(new TestHandsonRow(3, "name3", "address6")));
    }

    private static void test2() {
        String jsonStr = "  ";
        logger.debug(new Gson().fromJson(jsonStr, TestHandsonRow.class));
        System.out.println();
        System.out.println(new Gson().fromJson(jsonStr, TestHandsonRow.class)==null);
        //jsonStr = "{";
        //logger.debug(new Gson().fromJson(jsonStr, TestHandsonRow.class));
    }
}
