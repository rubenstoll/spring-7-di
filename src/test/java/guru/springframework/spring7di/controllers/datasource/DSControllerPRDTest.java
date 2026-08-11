package guru.springframework.spring7di.controllers.datasource;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"PRD","EN"})
@SpringBootTest
class DSControllerPRDTest {

    @Autowired
    DSController controller;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getDataSource() {
        var result = controller.getDataSource();
        System.out.println(result);
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo("jdbc:postgresql://sfg-prd:5432/sfgdatabase");

    }

}