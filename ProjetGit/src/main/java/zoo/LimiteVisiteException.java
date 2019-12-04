package zoo;

public class LimiteVisiteException extends Exception {

	public LimiteVisiteException() {
		super("le nombre limite de viditeurs est atteind!");
	}
}
