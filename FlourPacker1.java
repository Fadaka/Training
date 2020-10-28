public class FlourPacker1 {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        bigCount *= 5;
        int total = bigCount + smallCount;
        for (int i = 0; i <= bigCount; i += 5) {
            for (int x = 0; x <= smallCount; x++) {
                int raw = x + i;
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


