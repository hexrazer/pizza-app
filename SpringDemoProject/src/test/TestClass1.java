package test;

class TestClass1
{
	public static void main(String[] args)
	{
		int[] arr = { 1,2,3,4,5};
		int key=2;
		int[] res = rotate(arr,key);
		for(int i : res)
			System.out.print(i+" ");	
	}
	
	public static int[] rotate(int[] arr,int key){
		int len = arr.length;
		key = key%len;
		int start=0,end=len-1-key;
		for(int i=0;i<len-1-key;i++){
			if(start<end && i<=len-1-key){
				swap(arr,start,end);
				
			}else {
				start=len-1-key+1;
				end=len-1;
				swap(arr,start,end);
			}
			start++;
			end--;
		}
		start=0;
		end=len-1;
		
		for(int i=0;i<len/2;i++) {
			
			swap(arr,start,end);
			start++;
			end--;
		}
		return arr;
	}
		
		public static void swap(int[] arr,int start,int end){
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	
}
