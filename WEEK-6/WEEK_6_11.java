public class WEEK_6_11 {
    public static void main(String[] args) {
        String str = "hello world";
        str = str.replaceAll("\\s", "");

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Print frequency
        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}
