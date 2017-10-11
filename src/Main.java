
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = lengthOfSubString("shbhewfbh");
		System.out.println(x);
	}
	public static int lengthOfSubString(String s){ 
	    char[] array = s.toCharArray();
	    int start = 0, cur = 0, max = 0, end = 0;  
	    int[] map = new int[125];
	    for(int i=0;i<array.length;i++){  
	        char c = array[i];  
	        if(map[c]==0){  
	                map[c] = i+1;
	            cur ++; 
	            if(cur > max){  
	                max = cur;
	            }  
	        }else{  
	            end = map[c] -1;
	            for(int j=start;j<end;j++ ){
	                map[array[i]] = 0;
	            }  
	            start = end + 1;  
	            map[array[i]] = i+1;  
	            cur = i-end;  
	        }  
	    }   
	    return max;  
	}  
}
