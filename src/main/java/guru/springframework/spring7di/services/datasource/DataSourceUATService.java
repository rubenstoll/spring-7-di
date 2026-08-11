package guru.springframework.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"UAT"})
@Service("sfgdssvc")
public class DataSourceUATService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        System.out.println("UAT service");
        return "jdbc:postgresql://sfg-uat:5432/sfgdatabase";

    }
}
