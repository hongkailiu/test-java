package tk.hongkailiu.test.app.unirest;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Log4j public class UniRestIT {
    @Test public void testTrivial() {
        Assert.assertTrue(true);
    }

    // not done yet
    @Ignore
    @Test public void testGet() throws UnirestException {
        HttpResponse<JsonNode> jsonResponse = Unirest.get("http://httpbin.org/ip")
            .header("accept", "application/json").asJson();
        log.debug("jsonResponse: " + jsonResponse);
    }
}
