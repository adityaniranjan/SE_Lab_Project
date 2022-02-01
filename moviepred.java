import java.util.*;



public class movieprediction {
	public double euclidean(int x1,int x2,int y1,int y2) {
		double X = Math.pow(x2-x1,2);
		double Y = Math.pow(y2-y1,2);
		double Z = Math.sqrt(X+Y);
		return Z;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		movieprediction mp = new movieprediction();
		int n_action,n_comedy;
		n_action = sc.nextInt();
		n_comedy = sc.nextInt();
		
		int action[] = {100,0,90,21};
		int comedy[] = {0,100,17,80};
		
		double min_result = mp.euclidean(n_action,action[0],n_comedy,comedy[0]);
		int a=0;
		int c =0;
		for(int i=1;i<4;i++) {
			double result =  mp.euclidean(n_action,action[i],n_comedy,comedy[i]);
			if(min_result >= result) {
				min_result = result;
				a = action[i];
				c = comedy[i];
			}
		}
		System.out.println(min_result);	
		if(a>c) {
			System.out.println("Action");
		}else if(a<c) {
			System.out.println("Comedy");
		}
	}
}