

public class PassedFailedClassmates {
    public static void main(String[] args) {
        int[] calificaciones = {90, 80, 70, 86, 54, 78};
        int pass=0;
        int fail=0;

        for (int i : calificaciones) {
            if (i >= 70) {
                pass++;

            } else {
                fail++;
            }
        }
        System.out.println(pass + " Passed");
        System.out.println(fail + " Failed");
    }
}
