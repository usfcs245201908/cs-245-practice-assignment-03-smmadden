public class LinearSearch implements Practice03Search{

    public int search(int[] array, int target){
        for(int i=0; i < array.length; i++){
            if (target == array[i])
                return i;
        }
        return -1;
    }

    public String searchName(){
        return "Linear search";
    }

}
