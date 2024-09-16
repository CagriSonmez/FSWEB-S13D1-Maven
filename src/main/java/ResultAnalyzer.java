public class ResultAnalyzer {

    // Havlayan köpek :D
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        // Saat geçerli değilse false döndür
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // Köpek havlıyor ve saat geceyse true döndür
        if (isBarking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        // Diğer durumlarda false döndür
        return false;
    }

    // Yaş Araligi
    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) ||
                (age2 >= 13 && age2 <= 19) ||
                (age3 >= 13 && age3 <= 19);
    }

    // Oyuncu kedi
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    // Dikdörtgenin Alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    // Dairenin Alanı
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}