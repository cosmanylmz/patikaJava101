public class FindingRepetitiveEvenNumbers {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] list={1,1,2,2,2,3,4,4,4,6,6,8,8,8,8,5,5,55};
        int [] duplicate=new int[list.length];
        int startIndex=0;
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list.length;j++){
                if( (list[i]%2==0) &&(i != j) && (list[i]==list[j])){
                 if (!isFind(duplicate,list[i])){
                     duplicate[startIndex++]=list[i];
                 }
                 break;
                }
            }
        }
        for (int value : duplicate){
            if (value!=0){
                System.out.print(value+" ");
            }
        }
    }
}
