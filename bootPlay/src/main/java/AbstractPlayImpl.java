
public class AbstractPlayImpl extends AbstractPlay{

	@Override
	String getThoughts() {
		return "My Thoughts are this and that";
	}

	@Override
	String getFeelings() {
		return "My Feelings are this and that";
	}

	@Override
	String getActions() {
		return super.getActions();
	}
	
//don't need the concrete methods as they are retrieved from the parent class
	
	public static void main(String[] args) {
		
		AbstractPlayImpl testing = new AbstractPlayImpl();
		System.out.println(testing.getThoughts());
		System.out.println(testing.getFeelings());
		System.out.println(testing.getActions());
		System.out.println(testing.getMovements());

	}

}