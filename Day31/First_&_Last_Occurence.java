class GFG {
    ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = -1, last = -1;

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid + 1; 
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first == -1) {
            result.add(-1);
            result.add(-1);
        } else {
            result.add(first);
            result.add(last);
        }

        return result;
    }
}
