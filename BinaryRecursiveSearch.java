public class BinaryRecursiveSearch implements Practice03Search
{

    public int search(int[] array, int target){
        return search(array, target, 0, array.length - 1);
    }

    private int search(int[] array, int target, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high) / 2;
        if(array[mid] == target)
            return mid;
        if(target > array[mid])
            return search(array, target, mid + 1, high);
        else
            return search(array, target, low, mid - 1);
    }

    public String searchName(){
        return "Binary Recursive Search";
    }

}
