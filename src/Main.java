import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        double voto = 54;
//        double vxemay = 38;
//        double time = 2.25;
//        double soto = voto * time;
//        double sxemay = vxemay * time;
//        double stong = soto + sxemay;
//        System.out.println("quang duong la: " +stong);
//
//        double timeWalk = 2.5;
//        double vWalk = 4.2;
//        double sAb = timeWalk * vWalk;
//        double vBycicle = vWalk * 2.5;
//        double timeBycicle = sAb / vBycicle;
//        System.out.println("thoi gian di bang xe dap la:" +timeBycicle);
//    }

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDateTime lcdt = LocalDateTime.now().plusDays(3);
        System.out.println("thời gian của ba ngày sau là: " +lcdt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập thời gian theo định dạng (yyyy-MM-dd): ");
        String dateTime = scanner.nextLine();

        LocalDateTime lcd = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println(lcd);

    }
}



