public class SequentialSearch {
    public static void main(String[] args) {

        int data[] = {1, 2, 3, 4, 5};
        int n = 3;

        int position = sequentialSearch(data, n);

        if (position == -1)
            System.out.println("Nomor " + n + "tidak ditemukan");
        else
            System.out.println("Nomor " + n + " dapat ditemukan di posisi " + (position + 1));
    }

    static int sequentialSearch(int[] data, int n) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == n)
                return i;
        }
        return -1;
    }
}