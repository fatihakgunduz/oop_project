import java.util.ArrayList;

public class BotUser extends User {

	public BotUser(long id, String userName, String password, ArrayList<Long> datasetIds) {
		super(id, userName, password, datasetIds);
		// TODO Auto-generated constructor stub
	}

	public BotUser(String userName, long id, String password, ArrayList<Dataset> dataset) {
		super(userName, id, password, dataset);
		// TODO Auto-generated constructor stub
	}

	public BotUser() {
		super();
		// TODO Auto-generated constructor stub
	}

}
