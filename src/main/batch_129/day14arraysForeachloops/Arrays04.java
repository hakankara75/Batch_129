package main.batch_129.day14arraysForeachloops;

public class Arrays04 {
    public Arrays04() {
    }

    public static void main(String[] args) {
        String[] colors = new String[]{"Red", "Orange", "Blue", "Yellow", "Green", "Brown"};
        String[] color = colors;
        int counter = colors.length;

        int i;
        for(i = 0; i < counter; ++i) {
            String w = color[i];
            if (w.equals("Yellow")) {
                break;
            }

            System.out.println(w);
        }

        color = new String[]{"Red", "Orange", "Blue", "Yellow", "Green", "Brown"};

        for(counter = color.length - 1; counter >= 0 && !color[counter].equals("Yellow"); --counter) {
            System.out.println(color[counter]);
        }

        counter = 0;
        String[] var8 = colors;
        int var9 = colors.length;

        for(int var6 = 0; var6 < var9; ++var6) {
            String w = var8[var6];
            if (w.equals("Yellow")) {
                break;
            }

            ++counter;
        }

        for(i = counter + 1; i < color.length; ++i) {
            System.out.println(color[i]);
        }

    }
}
