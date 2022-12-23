public class Test1{
	public static void main (String[] args){
		int [] myArr = {7,5,4,8,1,2};
		int []flag_arr = new int [myArr.length];
		int flag_count = 1;
	
		int max = 1;
		int min = 10;
		int sum = 0;
		float avg;
		for (int i=0; i<myArr.length; i++){
			if (myArr[i] > max)
				max = myArr[i];
			if (myArr[i]<min)
				min = myArr[i];
			sum +=myArr[i];
		}
		avg = (float)sum/myArr.length;
		
		//======================================================================
		int med=0;
		for (int i=0;i<4;i++){
			int flag_min=1000;
			int flag_min_index=0;
			for (int j=0;j<myArr.length;j++){
				if(myArr[j]< flag_min&&flag[j]==0){
					flag_min=myArr[j];
					flag_min_index = j;
				}
			}
			flag[flag_min_index] = flag_count;
			flag_count++;
			med = myArr[flag_min_index];
		}
		System.out.println ("max:"+max);
		System.out.println ("min:"+min);
		System.out.println ("med:"+med);
		System.out.println ("avg:"+avg);
		for(int i=0;i<flag.length;i++){
		System.out.println("flag:"+flag[i]);
		}
	}
}
