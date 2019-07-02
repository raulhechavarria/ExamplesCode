package foreach;

import java.util.Collections;

public class NullGuard {

	public NullGuard() {
		// TODO Auto-generated constructor stub
	}
	
	static public <T extends Iterable> T nullGuard(T item) {
		  if (item == null) {
		    return (T) Collections.emptyList();
		  } else {
		    return item;
		  }
		}

}
