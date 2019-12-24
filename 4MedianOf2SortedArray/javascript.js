

var findMedianSortedArrays = function(nums1, nums2) {
    let newArr = [];
    let nums1Ptr = 0, nums2Ptr = 0;
    while (nums1Ptr < nums1.length || nums2Ptr < nums2.length){
        if (nums1Ptr === nums1.length){
            newArr.push(nums2[nums2Ptr++]);
        } else if (nums2Ptr === nums2.length){
            newArr.push(nums1[nums1Ptr++])
        }else if (nums1[nums1Ptr] < nums2[nums2Ptr]){
            newArr.push(nums1[nums1Ptr++])
        } else {
            newArr.push(nums2[nums2Ptr++]);
        }
    }
    let sumLength = nums1.length+ nums2.length;
    let midPoint = Math.floor(sumLength/2)
    // even
    return sumLength %2 === 0 ? (newArr[midPoint-1]+newArr[midPoint])/2 : newArr[midPoint];
}


console.log(findMedianSortedArrays([1, 2], [3]));
console.log(findMedianSortedArrays([1, 2], [3, 4])); // (2 + 3)/2=2.5
console.log(findMedianSortedArrays([1, 3], [2, 4])); // (2 + 3)/2=2.5
console.log(findMedianSortedArrays([1], [2]));