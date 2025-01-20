package ex;

public class StringPerformanceTest {

    public static void main(String[] args) {
        // Số lần thực hiện phép cộng chuỗi
        int iterations = 100000;

        // Thời gian thực hiện phép cộng chuỗi với String
        long startTime = System.nanoTime();
        String resultString = "";
        for (int i = 0; i < iterations; i++) {
            resultString += "a";
        }
        long endTime = System.nanoTime();
        long durationString = endTime - startTime;
        System.out.println("Thời gian với String: " + durationString + " nanoseconds");

        // Thời gian thực hiện phép cộng chuỗi với StringBuffer
        startTime = System.nanoTime();
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            resultStringBuffer.append("a");
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Thời gian với StringBuffer: " + durationStringBuffer + " nanoseconds");

        // So sánh thời gian
        if (durationString > durationStringBuffer) {
            System.out.println("StringBuffer nhanh hơn String.");
        } else if (durationString < durationStringBuffer) {
            System.out.println("String nhanh hơn StringBuffer.");
        } else {
            System.out.println("Thời gian thực hiện là như nhau.");
        }
    }
}
