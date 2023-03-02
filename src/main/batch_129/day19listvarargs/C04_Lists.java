package main.batch_129.day19listvarargs;

import java.util.ArrayList;
import java.util.List;

public class C04_Lists {
    public C04_Lists() {
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println("liste :" + nums);

        for(int i = 0; i < nums.size(); ++i) {
            if ((Integer)nums.get(i) == 8) {
                nums.set(i, (Integer)nums.get(i) * 2);
                break;
            }

            nums.set(i, (Integer)nums.get(i) * 2);
        }

        System.out.print("Degistirilimis List: " + nums);
    }
}