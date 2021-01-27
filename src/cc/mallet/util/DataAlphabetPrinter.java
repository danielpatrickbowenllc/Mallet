package cc.mallet.util;

import cc.mallet.types.*;
import java.io.*;

public class DataAlphabetPrinter {

	public static void main(String[] args) throws Exception {
		InstanceList instances = InstanceList.load(new File(args[0]));
		instances.getDataAlphabet().dump();
	}

}
