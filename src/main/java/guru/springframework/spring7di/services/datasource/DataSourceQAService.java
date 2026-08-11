package guru.springframework.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"QA"})
@Service("sfgdssvc")
public class DataSourceQAService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        System.out.println("QA service");
        return "jdbc:postgresql://sfg-qa:5432/sfgdatabase";

    }
}
