package gendev.hw1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SanityCheck {
	public static void main(String[] args) {
		task1();
		task2uc();
		task2ad();
		task3();
		task4();
	}

	private static void task1() {
		System.out.println("Task 1 Sanity Check");
		System.out.println("---");
		String fname = "task1_description/description.txt";
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("The file " + fname + " appears to be missing. WARNING: This results in 0 marks.");
			System.out.println();
			return;
		}
		System.out.println("Found file " + fname);
		String content = "";
		try {
			content = Files.readString(f.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int numWords = countWordsUsingSplit(content);
		System.out.println("It looks like your description contains " + numWords + " of max 150 words.");
		if (numWords < 100) {
			System.out.println("WARNING The number of words is a bit low.");
		}
		if (numWords > 165) {
			System.out.println("WARNING 10% over the wordlimit will incurr a penalty.");
		}
		System.out.println();
	}

	private static void task2ad() {
		System.out.println("Task 2 Acticity Sanity Check");
		System.out.println("---");
		String fname = "task2_activity/activity.xml";
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("The file " + fname + " appears to be missing. WARNING: This results in 0 marks.");
			System.out.println();
			return;
		}
		System.out.println("Found file " + fname);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(f);
		} catch (Exception e) {
			System.out.println("WARNING: Document parsing failed. This results in 0 marks.");
			return;
		}
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("mxCell");
		if (nList.getLength() == 0) {
			System.out.println(
					"WARNING: It looks like it is compressed for exporting. Export it uncompressed from draw.io. This results in 0 marks.");
			System.out.println();
			return;
		}
		int actions = 0;
		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			String style = "";
			try {
				style = n.getAttributes().getNamedItem("style").getNodeValue();
			} catch (Exception e) {
			}
			if (style.contains("rounded=1")) {
				actions++;
			}
		}

		System.out.println("It looks like you have " + actions + " actions in your activity diagram.");
		if (actions < 5) {
			System.out.println("WARNING the number of actions looks to low for full marks.");
		}
		System.out.println();
	}

	private static void task2uc() {
		System.out.println("Task 2 UseCase Sanity Check");
		System.out.println("---");
		String fname = "task2_usecase/usecase.xml";
		try {
			Files.write(Paths.get("build.properties"), ("#" + System.currentTimeMillis()).getBytes(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
		}
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("The file " + fname + " appears to be missing. WARNING: This results in 0 marks.");
			return;
		}
		System.out.println("Found file " + fname);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(f);
		} catch (Exception e) {
			System.out.println("WARNING: Document parsing failed. This results in 0 marks.");
			System.out.println();
			return;
		}
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("mxCell");
		if (nList.getLength() == 0) {
			System.out.println(
					"WARNING: It looks like it is compressed for exporting. Export it uncompressed from draw.io. This results in 0 marks.");
			System.out.println();
			return;
		}

		int usecases = 0;
		for (int i = 0; i < nList.getLength(); i++) {
			Node n = nList.item(i);
			String style = "";
			try {
				style = n.getAttributes().getNamedItem("style").getNodeValue();
			} catch (Exception e) {
			}
			if (style.contains("ellipse")) {
				usecases++;
			}
		}

		System.out.println("It looks like you have " + usecases + " usecases in your usecase diagram.");
		if (usecases < 5) {
			System.out.println("WARNING the number of usecases looks to low for full marks.");
		}
		System.out.println();
	}

	private static void task3() {
		System.out.println("Task 3 Sanity Check");
		System.out.println("---");
		String fname = "model/hw1.ecore";
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("The file " + fname + " appears to be missing. WARNING: This results in 0 marks.");
			return;
		}
		System.out.println("Found file " + fname);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(f);
		} catch (Exception e) {
			System.out.println("WARNING: Document parsing failed. This results in 0 marks.");
			return;
		}
		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("eClassifiers");
		int classes = nList.getLength();

		System.out.println("It looks like you have " + classes + " classes in your class diagram.");
		if (classes < 5) {
			System.out.println("WARNING the number of classes looks too low for full marks.");
		}
		System.out.println();
	}

	private static void task4() {
		System.out.println("Task 4 Sanity Check");
		System.out.println("---");
		String fname = "task4_instance/instance.xmi";
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println("The file " + fname + " appears to be missing. WARNING: This results in 0 marks.");
			return;
		}
		System.out.println("Found file " + fname);
	}

	public static int countWordsUsingSplit(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}

		String[] words = input.split("\\s+");
		return words.length;
	}
}
