public class IntegerCacheExample {

    public static void main(String[] args){
        Integer i1=126;
        Integer i2=126;
        //this is true since it is inside the range -128 to 127
        System.out.println("is same? "+(i1==i2));

        Integer i3=128;
        Integer i4=128;
        System.out.println("is same? "+(i3==i4));//this is false since it is outside the range -128 to 127

    }
}
