
public class SingletonPlay {

	private static SingletonPlay instance;
	private final String fullName = "Shauna Linen";
	public String nickName;
	
	private SingletonPlay(){
		
		nickName = "Shaun";
	}
	
	
	public static SingletonPlay getInstance() {
				
		if (instance == null){
			instance = new SingletonPlay();
		} 

		return instance;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullName = SingletonPlay.getInstance().fullName;
		System.out.println("Printing the Full Name " + fullName);
		
		String fullName2 = SingletonPlay.getInstance().fullName;
		System.out.println("Printing the Full Name2 " + fullName2);
		
		String nickName = SingletonPlay.getInstance().nickName;
		System.out.println("Printing the NickName " + nickName);
	
	}

}
