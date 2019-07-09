package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.Environment;

public class Jclips {
	private Environment clips ;
	private static final String TBClasses = "TBclasses.clp";
	private static final String TBInstances = "TBinstances.clp";
	private static final String TBRules = "TBrules.clp";

	
	Jclips() {
		clips = new Environment();
	}
	
	public void startClips() throws CLIPSException {
		clips.load(TBClasses);
		makeInstances(TBInstances);
		clips.load(TBRules);
		clips.run();
	}

	public void makeInstances(String fileName) throws CLIPSException {
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		    String line = br.readLine();

		    while (line != null) {
		    	clips.makeInstance(line);
		        line = br.readLine();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
