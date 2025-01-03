double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int total_size = nums1Size + nums2Size;
    int arr[total_size];
    int j=0,k=0,i=0;
    while(j < nums1Size && k < nums2Size) {
        if(nums1[j]<nums2[k]) {
            arr[i] = nums1[j];
            j++;
        }else {
            arr[i] = nums2[k];
            k++;
        }
        i++;
    }

    while(j < nums1Size) {
        arr[i] = nums1[j];
        j++;
        i++;
    }
    while(k < nums2Size) {
        arr[i] = nums2[k];
        k++;
        i++;
    }

    double mid;
    if(total_size % 2 == 0 ) {
       int m = total_size / 2;
       int n = m - 1;
       mid = (arr[m] + arr[n])/2.0; 
    }else {
        mid = arr[total_size/2];
    }
    return mid;
}