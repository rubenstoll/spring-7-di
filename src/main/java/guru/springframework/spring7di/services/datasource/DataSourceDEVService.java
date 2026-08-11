package guru.springframework.spring7di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service("sfgdssvc")
public class DataSourceDEVService implements DataSourceService {
    @Override
    public String getDataSourceName() {
        System.out.println("DEV service");
        return "jdbc:postgresql://sfg-dev:5432/sfgdatabase";
    }
}
