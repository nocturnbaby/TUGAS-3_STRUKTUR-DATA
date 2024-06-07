public class BinarySearch {
    public static void main(String[] args) {
        
        int data[] = {1, 2, 3, 4, 5};
        int n = 5;

        int position = binarySearch(data, n);

        if (position == -1)
            System.out.println("Angka " + n + " tidak ditemukan");
        else 
            System.out.println("Angka " + n + " dapat ditemukan di posisi" + (position + 1));
    }

    static int binarySearch(int[] data, int n) {
        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (data[mid] == n)
                return mid;
            else if(data[mid] < n)
                low = mid + 1;
            else
                high = mid -1;
        }
        return -1;
    }
}