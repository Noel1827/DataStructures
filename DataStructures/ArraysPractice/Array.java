public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        
        if(items.length == count){
            int[] newItems = new int[count*2];
            
            for(int i=0; i< count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++]= item;
    }

    public void removeAt(int index){
        if(index >= count || index <0)
        throw new IllegalArgumentException("Index out of bounds");

        for(int i= index; i < count; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        // if it finds the item, return index
        // otherwise, return -1
        for(int i=0; i<count; i++){
            if(items[i] == item)
            return i;
        }
        return -1;
    }

}
