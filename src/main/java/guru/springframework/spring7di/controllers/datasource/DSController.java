package guru.springframework.spring7di.controllers.datasource;

import guru.springframework.spring7di.services.datasource.DataSourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DSController {

    private final DataSourceService dataSourceService;

    public DSController(@Qualifier("sfgdssvc") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }


    public String getDataSource() {
        System.out.println("guru.springframework.spring7di.controllers.datasource.DataSourceController.getDataSource()");
        return dataSourceService.getDataSourceName();
    }


}
