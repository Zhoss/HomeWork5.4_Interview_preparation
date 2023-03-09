import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[20];
        strings[0] = "депутат";
        strings[1] = "крест";
        strings[2] = "кровать";
        strings[3] = "природа";
        strings[4] = "концепция";
        strings[5] = "природа"; // повтор
        strings[6] = "кровать"; // повтор
        strings[7] = "оборудование";
        strings[8] = "план";
        strings[9] = "ученый";
        strings[10] = "рука";
        strings[11] = "еда";
        strings[12] = "окно";
        strings[13] = "природа"; // повтор
        strings[14] = "музей";
        strings[15] = "состояние";
        strings[16] = "план"; // повтор
        strings[17] = "действительность";
        strings[18] = "обеспечение";
        strings[19] = "план"; // повтор

        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(strings));
        StringBuilder sb = new StringBuilder();
        for (String str : stringSet) {
            sb.append(str).append("|");
        }
        System.out.println(sb);

        Stream<String> stream = Arrays.stream(strings);
        String result = stream.distinct()
                .collect(Collectors.joining("|"));
        System.out.println(result);
    }
}