import java.util.Scanner;

public class Order {
public void order(int a){
	int num=6;
	int diff=22;
	for(int i=0;i<a;i++){
		for(int j=0;j<i;j++){
			System.out.println(num);
			num=num+diff;
			diff=diff+16;
		}	
	}
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of layers you want?");
		int a=in.nextInt();
		Order obj=new Order();
		obj.order(a);

	}

}
      