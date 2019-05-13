package degradation;

import java.util.Collection;
import java.util.Iterator;

final class StringUtils {
    public static String join(final String delimiter, final Collection<?> s) {
        StringBuilder builder = new StringBuilder();
        Iterator<?> iter = s.iterator();
        while (iter.hasNext()) {
            builder.append(iter.next());
            if (!iter.hasNext()) {
                break;
            }
            builder.append(delimiter);
        }
        return builder.toString();
    }

    private StringUtils() { }
}
