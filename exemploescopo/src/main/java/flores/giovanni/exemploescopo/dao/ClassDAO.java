package flores.giovanni.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Giovanni Flores
 * @since 12/06/2020
 */

//Lonbok
@Getter @Setter

//Spring
@Component
//1 maneira
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//2 maneira
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
