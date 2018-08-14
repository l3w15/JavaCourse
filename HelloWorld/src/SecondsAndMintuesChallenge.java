public class SecondsAndMintuesChallenge {

    private static final String ERROR_MSG = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(430, 45));
        System.out.println(getDurationString(3765));
        System.out.println(getDurationString(86410));
        System.out.println(getDurationString(-3600));
        System.out.println(getDurationString(-230, 45));
        System.out.println(getDurationString(230, -45));
    }

    private static String getDurationString(int mins, int secs) {
        if (mins < 0 || (secs < 0 || secs > 59)) {
            return ERROR_MSG;
        }

        int remainingMins = mins % 60;
        int hrs = mins / 60;
        String hrString = stringBuilder(hrs, "h ");
        String minString = stringBuilder(remainingMins, "m ");
        String secString = stringBuilder(secs,"s");
        return hrString + minString + secString;
    }

    private static String getDurationString(int secs) {
        if (secs < 0) {
            return ERROR_MSG;
        }
        int remainingSecs = secs % 60;
        int mins = secs / 60;
        return getDurationString(mins, remainingSecs);
    }

    private static String stringBuilder(int time, String unit) {
        String string = time + unit;
        string = time < 10 ? "0" + string: string;
        return string;
    }
}
