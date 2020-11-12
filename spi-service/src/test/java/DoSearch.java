
import core.factory.SpiExtensionFactory;
import spi.Search;

import java.util.Iterator;

/**
 * Created by WD on 2018/3/9.
 */
public class DoSearch {
    public static void main(String[] args) {
//        ServiceLoader<Search> sl = ServiceLoader.load(Search.class);  //原生配置路径META-INF/services
//        Iterator<Search> s = sl.iterator();
//        if (s.hasNext()) {
//            Search ss = s.next();
//            ss.search();
//        }
        SpiExtensionFactory spi = new SpiExtensionFactory();
        spi.execute("lookMovie","");
    }
}