
public class ArrayCheck {

    public static void main(String args[]) {
        int num[] = {1,7,5,2,8,3 };
        int sum = 0, half, lhalf, start = 0, len,end=0;
        len = num.length;
        System.out.println("length of the Array : " + num.length);
        lhalf = len / 2;
        System.out.println("Half length of the Array : " + lhalf);
        for (int i = 0; i < len; i++) {
            sum = sum + num[i];
        }
        System.out.println("Total Sum of the Array : " + sum);
        half = sum / 2;
        System.out.println("Half Sum of the Array : " + half);
        for (int i = 0; i < len; i++) {  
             start = start + num[i];
            if (start == half) {               
                System.out.println("Start Array of sum is Equal : " + start);
                break;
            } else {
                System.out.println("Start Array Element is Not Equal");
            }
        }
        //
        for (int i = 0; i<len; --len) {             
            end = end + num[len-1];
            if (end == half) {
                System.out.println(" End Array of sum is Equal : " + end);
                break;
            } else {
                System.out.println(" End Array Element is Not Equal");
            }
        }
    }
}
