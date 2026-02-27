public static int large(int arr[]) {

    if(arr.length < 3)
        return -1;

    int large = arr[0];
    int seclarge = Integer.MIN_VALUE;
    int tlarge = Integer.MIN_VALUE;

    for(int i = 1; i < arr.length; i++) {

        if(arr[i] > large) {
            tlarge = seclarge;
            seclarge = large;
            large = arr[i];
        }
        else if(arr[i] < large && arr[i] > seclarge) {
            tlarge = seclarge;
            seclarge = arr[i];
        }
        else if(arr[i] < seclarge && arr[i] > tlarge) {
            tlarge = arr[i];
        }
    }

    if(tlarge == Integer.MIN_VALUE)
        return -1;

    return tlarge;
}