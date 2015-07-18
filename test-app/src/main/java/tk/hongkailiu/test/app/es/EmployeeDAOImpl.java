package tk.hongkailiu.test.app.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.stereotype.Repository;

/**
 * Created by hongkailiu on 2015-07-18.
 */
@Repository("EmployeeDAOImpl")
public class EmployeeDAOImpl implements EmployDAO {

    private static final String INDEX = "testcorp";
    private static final String TYPE = "employee";

    @Autowired private ElasticsearchTemplate elasticsearchTemplate;

    @Override public String put(Employee employee) {
        IndexQuery indexQuery = new IndexQueryBuilder().withIndexName(INDEX).withType(TYPE).withSource(employee.toJson()).build();
        return elasticsearchTemplate.index(indexQuery);
    }
}
