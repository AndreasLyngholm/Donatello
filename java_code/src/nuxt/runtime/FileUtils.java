package nuxt.runtime;

import java.io.File;

import jolie.runtime.JavaService;
import jolie.runtime.Value;

public class FileUtils extends JavaService {
	public Value getLastModified(String filename) {
		Value retValue = Value.create();

		File file = new File(filename);

		retValue.setValue(file.lastModified());
		return retValue;
	}
}