import java.util.Date;

public class InterfaceContractPlayImpl implements InterfaceContractPlay {

	public static void main(String[] args) {
		InterfaceContractPlayImpl play = new InterfaceContractPlayImpl();
		String test = play.customerAddress("ABC");
		System.out.println("Testing Address " + test);
		

	}

	@Override
	public String contractType(String contractType) {
		return contractType;
	}

	@Override
	public Date serviceDateTime(Date serviceDateTime) {
		return serviceDateTime;
	}

	@Override
	public Double costForServices(Double costsForServices) {
		return null;
	}

	@Override
	public String customerAddress(String customerAddress) {
		return "ABC Street";
	}

}
