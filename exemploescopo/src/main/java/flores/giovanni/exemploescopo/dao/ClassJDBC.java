package flores.giovanni.exemploescopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 12/06/2020
 */

@Component
//1 maneira
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//2 maneira
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");

    }
}
