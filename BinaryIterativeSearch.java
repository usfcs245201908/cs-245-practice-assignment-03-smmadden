public class BinaryIterativeSearch implements Practice03Search
{

    public int search(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(array[mid] == target)
                return mid;
            if(target > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public String searchName(){
        return "Binary Iterative Search";
    }



    }
