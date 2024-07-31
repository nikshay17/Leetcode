In this question we initialised two pointers ,first one(LOW) with index 0 and second one(HIGH) with index array's length-1
We iterate mid through the array setting a condition that low<high
if arr[mid]=0 then we swap arr[mid] with arr[low] and increment both low and mid
id arr[mid]=1 then we just increment mid
if arr[mid]=2 then we swap arr[high] with arr[mid] and decrease high by 1
So what we are doing is we are just inserting 0 to the beginning and 2 to the end till all 0s are in beginning and all 2s are in end
the 1s automatically are in the middle


TIME COMPLEXITY-O(N)
SPACE COMPLEXITY-O(1)
