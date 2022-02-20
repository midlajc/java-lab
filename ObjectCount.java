//question 16
public class ObjectCount {
    static int count = 0;

    public ObjectCount(){
            count+=1;
        }

    public static void main(String[] args) {
        ObjectCount obj1 = new ObjectCount();
        ObjectCount obj2 = new ObjectCount();
        ObjectCount obj3 = new ObjectCount();
        ObjectCount obj4 = new ObjectCount();

        // display count
        System.out.println("Number of objects created : " + ObjectCount.count);
    }
}
