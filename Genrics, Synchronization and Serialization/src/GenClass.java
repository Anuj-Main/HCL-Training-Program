public class GenClass {
    public static<E> void printArray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer[] intArray={1,2,3,4,5,6,7,8,9,10};
        Character[] charArray={'A','B','C','D','E','F','G','H','I','J'};
        System.out.println("It will print Integer Array: ");
        printArray(intArray);
        System.out.println("It will print Integer Array: ");
        printArray(charArray);
    }
    
}
