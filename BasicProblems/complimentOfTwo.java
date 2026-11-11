public class complimentOfTwo {

    /*
    * Logic:
    * When we find 2's compliment, we are essentially first doing 1's compliment then adding 1 to it
    * Hence, ~num inverts all bits i.e. finds 1's compliment
    * Then +1 adds that 1 to the last bit
    * */

    public static int doComplimentOfTwo(int num){
        return ~num + 1;
    }
}
