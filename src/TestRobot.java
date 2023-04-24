import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestRobot {

    public static void main(String[] args) {
//        String test = "sfssdgsdfsda24324";
//        System.out.println(test);
//        System.out.println(test.length());
//        System.out.println(test.charAt(3));
//        int pos = (int) (Math.random() * test.length()-1);
//        System.out.println("position: " + pos + " character: " + test.charAt(pos));
//        Robot robot1 = new Robot();
//        System.out.println(robot1);
//        Robot robot2 = new Robot();
//        System.out.println(robot2);
//        System.out.println("Compare robot1 and robot2: " + robot1.compareTo(robot2));
//
        ArrayList<Robot> robots = generateListOfRobots(7);
        System.out.println(robots);
        Collections.sort(robots);
        System.out.println("Sorted list of robots:\n" + robots);
        Collections.reverse(robots);
        System.out.println("Reversed list of robots:\n" + robots);
        changeStatus(robots);
        Collections.sort(robots, new RobotBatteryComparator());
        System.out.println("Sorted list of robots by battery level:\n" + robots);
    }


    private static ArrayList<Robot> generateListOfRobots(int numRobots) {
        ArrayList<Robot> robots = new ArrayList<>(numRobots);
        for (int i = 0; i < numRobots; i++) {
            robots.add(new Robot());
        }
        return robots;
    }

    private static void changeStatus(ArrayList<Robot> robots) {
        for (Robot robot : robots) {
            robot.setStatus(true);
            robot.dischargeBattery();
        }
    }

    static class RobotBatteryComparator implements Comparator<Robot> {
        @Override
        public int compare(Robot o1, Robot o2) {
            if (o1.getBatteryLevel() > o2.getBatteryLevel())
                return 1;
            else if (o1.getBatteryLevel() < o2.getBatteryLevel())
                return -1;
            else {
                return 0;
            }
        }

    }
}

