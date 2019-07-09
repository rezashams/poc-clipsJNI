package app;

import net.sf.clipsrules.jni.CLIPSException;
import net.sf.clipsrules.jni.CLIPSLoadException;

public class App {

	public static void main(String[] args) {
		 Jclips jclipse = new Jclips();
	     try {
			jclipse.startClips();
		} catch (CLIPSLoadException e) {
			e.printStackTrace();
		} catch (CLIPSException e) {
			e.printStackTrace();
		}
	        System.out.println("Finish!!!");

	}

}
