package tk.hongkailiu.test.webapp.proxy;

import tk.hongkailiu.test.webapp.response.json.TVSeriesJsonResult;

import java.util.List;

public interface TVSeriesService {

    public List<TVSeriesJsonResult> getAllTVSeries();
}
