package tk.hongkailiu.test.webapp.proxy;

import tk.hongkailiu.test.webapp.response.json.TVSeriesJsonResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component public class DataProxy {

    @Resource(name = "tvSeriesServiceImpl") TVSeriesService tvSeriesService;

    public List<TVSeriesJsonResult> getAllTVSeries() {
        return tvSeriesService.getAllTVSeries();
    }
}
