package Tools;

import org.apache.commons.io.FileDeleteStrategy;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Tools {

    private static void searchForTheseFiles(String workSpace) {
        FileUtils.listFiles(new File(workSpace), new WildcardFileFilter("*.story"), TrueFileFilter.INSTANCE)
                .forEach(System.out::println);
        //               .forEach(a -> System.out.println(a.getName()));
    }

    private static Long getDateOnly(String fileName) {

        String onlyDigitPartOfFileName = fileName.replaceAll("[^0-9]", "");
        if (onlyDigitPartOfFileName.length() > 7) return Long.parseLong(onlyDigitPartOfFileName.substring(0, 8));
        else return 99999999L;

    }

    private static void filterForGivenRegex(String workSpace, String regex){
        FileUtils.listFilesAndDirs(new File(workSpace), new WildcardFileFilter("*"), TrueFileFilter.INSTANCE) // workspace param
                .parallelStream()
                .filter(a -> (a.isDirectory() && a.getName().matches(regex))) // regex param
                .forEach(b -> {
                    Arrays.stream(Objects.requireNonNull(b.listFiles(x -> (getDateOnly(x.getName()) < Long.parseLong(LocalDate.now().minusMonths(2).format(DateTimeFormatter.ofPattern("yyyyMMdd")))
                    ))))
                            .forEach(c -> {
                                try {
                                    System.out.println(c);
                                    throw new IOException("Don't Worry!")
; //                                   FileDeleteStrategy.FORCE.delete(c);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Deleted :: " + c.getAbsolutePath());
                            });
                });
    }

    private static void findTextInThisWorkSpace(String workSpace, String textToFind) {

        List<File> l = (List<File>) FileUtils.listFiles(new File(workSpace), new String[]{"java", "properties", "xml"}, true);
        l.parallelStream().filter(a -> {
            String allData = "";
            try {
//                allData = Files.readString(a.toPath());
            	throw new IOException("");
            } catch (IOException e) {
                System.err.println("Error Here : " + a.getAbsolutePath());
            }
            return allData.toLowerCase().contains(textToFind.toLowerCase());
        }).forEach(x -> System.out.println(x.getAbsolutePath()));
    }

    public static void main(String[] args) {

//        filterForGivenRegex("D:\\", "Excel");
        findTextInThisWorkSpace("F:\\ABD", "winium");
    }
}
