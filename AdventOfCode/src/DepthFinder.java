import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DepthFinder {

    public static void main(String[] args) throws IOException {

        String[] sonarReadings = getSonarReadings();
        int numberOfDepths = findDepth(sonarReadings);

        System.out.println(numberOfDepths);
    }

    private static String[] getSonarReadings() throws IOException {

        Path filename = Path.of("sonar.txt");
        String actual = Files.readString(filename);
        String[] array = actual.split("\n");
//        System.out.println(Arrays.toString(array));

        return array;

    }

    private static int findDepth(String[] sonarReadings){

        int numberOfGreaterElevations = 0;
        System.out.println("sonarReading has " + sonarReadings.length + " Elements");

        int var1 = Integer.parseInt(sonarReadings[0]);
        int var2 = Integer.parseInt(sonarReadings[1]);

        for( int i = 0; i <= (sonarReadings.length -1 ); i++) {
//            System.out.println(depth);
//            System.out.println(i);

            var1 = Integer.parseInt(sonarReadings[i]);

            if (i < sonarReadings.length - 1) {
                var2 = Integer.parseInt(sonarReadings[i + 1]);
            } else { var2 = var1; }
//            System.out.println(" Var1 is " + var1 + "and var2 is " + var2 );

            if ( var1 < var2  ) {
                numberOfGreaterElevations++;
//                System.out.println("Number is now greater");

            }

        }

        return numberOfGreaterElevations;
    }
}
