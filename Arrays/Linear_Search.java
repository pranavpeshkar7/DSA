public class Linear_Search {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int Search(String menu[], String menu_key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == menu_key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Number not found!");
        // } else{
        //     System.out.println(index);
        // }
        String menu[] = {"dosa", "samosa", "burger", "pizza", "waffle", "icecream"};
        String menu_key = "waffle";
        int string_index = Search(menu, menu_key);
        if(string_index == -1){
            System.out.println("Number not found!");
        } else{
            System.out.println(string_index);
        }
    }
}