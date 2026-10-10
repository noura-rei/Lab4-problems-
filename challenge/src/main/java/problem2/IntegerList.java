package problem2;

public class IntegerList {
    private int[] list; //values in the list
    private int size ;
    public IntegerList(int size) {
        list = new int[size];
        this.size = size ;
    }

    //fill array with integers between 1 and 100, inclusive

    public void randomize() {
        for (int i=0; i<size; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }

    //print array elements with indices

    public void print()
    {
        for (int i=0; i<size; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    // method increase size
    public void increaseSize(){
        int[] newArray = new int[list.length*2];
        for(int i = 0;i<size;i++){
            newArray[i] = list[i];
        }
        list = newArray ;
    }
    // addElement:
    public void addElement(int newVal){
        if(size>=list.length){
            this.increaseSize() ;
        }
        list[size]= newVal ;
        size++;

    }
    //removeFirst
    public void removeFirst(int newVal){
        int idx = -1 ;
        for(int i =0;i<size;i++){
            if(list[i] == newVal){
                idx = i;
                break ;
            }
        }
        if(idx>=0){
            for(int i = idx ; i < size-1;i++){
                list[i] = list[i+1] ;
            }
            size-=1;
        }

    }
    public void removeAll(int newVal){
        int j = 0 ;
        for(int i=0;i<size;i++){
            if(list[i]!=newVal){
                list[j++] = list[i] ;
            }
        }
        size = j ;

    }
    //create a list of the given size


}