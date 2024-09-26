public class main{
  public static void main(String[] args){
    int[] arr={4,5,0,1,9,0,5,0};
    int n=arr.length;
    int count=0;

  for(int i=0;i<n;i++){
    if(arr[i] == 0){
      count++;
    }
  }
    int[] result=new int[n];
    int index=0;

  for(int i=0;i<n;i++){
    if(arr[i] != 0){
      result[index++] = arr[i];
    }
  }
    while(count > 0){
      result[index++] = 0;
      count--;
    }
    for(int i=0;i<n;i++){
      System.out.print(result[i]+" ");
    }
  }
}
