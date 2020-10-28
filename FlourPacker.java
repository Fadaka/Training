public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(8, 6, 5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        int total = bigCount + smallCount;
        System.out.println("Big count is " + bigCount);
        System.out.println("small count is " + smallCount);
        System.out.println("The goal is " + goal);
        System.out.println("total is " + total);
        for (int i = 0; i <= bigCount; i += 5) {
            System.out.println("number for i is " + i);
            for (int x = 0; x <= smallCount; x++) {
                int raw = x + i;
                System.out.println("                       raw  =      " + raw);
                if ((raw == goal && goal >= 5) || (smallCount >= goal)) {
                    return true;
                }
            }
                if (goal < 5 && smallCount < goal && bigCount == 5) {
                    return false;
                }
            }
            return false;
        }
    }


