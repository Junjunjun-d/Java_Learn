
public class GetTime {
	public void getTime(){
		long startTime = System.currentTimeMillis();
		for(int i=1;i<10000;i++){
			System.out.print("������"+i+"\n");
		}
		long endTime = System.currentTimeMillis();
		System.out.print("ʱ����: "+ (endTime - startTime));
	}
}
