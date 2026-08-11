package guru.springframework.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PRD")
@Service("sfgdssvc")
//@Service
public class DataSourcePRDService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        System.out.println("PRD service");
        return "jdbc:postgresql://sfg-prd:5432/sfgdatabase";

    }
}
