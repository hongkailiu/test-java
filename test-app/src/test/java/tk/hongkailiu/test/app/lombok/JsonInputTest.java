package tk.hongkailiu.test.app.lombok;

import org.junit.Assert;
import org.junit.Test;


public class JsonInputTest {

    @Test public void testParse() throws Exception {
        String input = "{\n" + "    \"npcUpdates\": [\n"
            + "        \t\t{\t\"_comment_\": \"Single Product with multiple TRs - backward compatible\",\n"
            + "            \t\t\"TR_LIST\": \"TR00001, TR00002 & WW12345\",\n"
            + "            \t\t\"products\": [{\t\"PRODUCT_NUMBER\": \"PN1\",\n"
            + "                    \t\t\t\t\"R_STATE\": \"RS1\" }]\n" + "        \t\t},\n"
            + "        \t\t{\t \"_comment_\": \"Single Product with multiple TRs reusing TR list from commit - backward compatible\",\n"
            + "            \"TR_LIST\": \"\",\n"
            + "            \"Products\": [{  \"PRODUCT_NUMBER\": \"PN1\",\n"
            + "  \t           \"R_STATE\": \"RS1\" }]\n" + "},\n"
            + "        \t\t{            \"_comment_\": \"Single TR with multiple Products\",\n"
            + "             \"TR_LIST\": \"TR0004\",\n"
            + "            \"products\": [{  \"PRODUCT_NUMBER\": \"PN2\",\n"
            + "           \"R-STATE\": \"RS2\" },\n"
            + "                \t\t\t        {  \"PRODUCT_NUMBER\": \"PN3\",\n"
            + "           \"R_STATE\": \"RS3\"}]\n" + "},\n"
            + "        \t\t{\t\"_comment_\": \"Multiple TRs with multiple Products\",\n"
            + "            \"TR_LIST\": \"TR0001 and also TR0006\",\n"
            + "            \t\t\"products\": [{  \"PRODUCT_NUMBER\": \"PN3\",\n"
            + "                       \"R_STATE\": \"RS3\" },\n"
            + "        {  \"PRODUCT_NUMBER\": \"PN4\",\n" + "\t\"R_STATE\": \"RS4\" }]\n"
            + "        }\n" + " \t]}";

        JsonInput jsonInput = JsonInput.parse(input);
        Assert.assertNotNull(jsonInput);
        Assert.assertEquals(4, jsonInput.getNpcUpdates().size());
    }
}
