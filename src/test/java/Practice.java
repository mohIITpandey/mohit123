
public class Practice {

	public static void main(String[] args) {
    String s="supermanspidermanbatman";
    boolean[] bs=new boolean[s.length()];
    for(int i=0;i<s.length();i++) {
    	char ch=s.charAt(i);
    	int count=0;
    	if(bs[i]==false) {
    		for(int j=i;j<s.length();j++) {
    			char ch1=s.charAt(j);
    			if(ch==ch1) {
    				count++;
    				bs[j]=true;}
    		}
    	}
    	if(count>0)
    	System.out.println(ch+"---->"+count);
    }
	}

}
