public class Test1{
	public static void main (String[] args){
		int [] myArr = {7,5,4,8,1,2};
		int [] res = new int [myArr.length];
		
		for (int i = 0,j = res.length-1; i <myArr.length; i++,j--){
			res[j]=myArr[i];
		}
		for(int a =0; a<myArr.length;a++){
			System.out.println(res[a]);
		}
	}	
}
//將754812反轉成218457
//參考網站https://www.gushiciku.cn/pl/gfnf/zh-tw
