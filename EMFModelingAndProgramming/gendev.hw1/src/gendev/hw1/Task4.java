package gendev.hw1;

import gendev.hw1.impl.BloodDonorImpl;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Task4 {
	public static void main(String[] args) {
		// implement task 4 here
		
		// create instance of CD in file task4_instance/instance.xmi
		Hw1Package.eINSTANCE.eClass();
		Hw1Factory factory= Hw1Factory.eINSTANCE;
		
		BloodBank bank=factory.createBloodBank();
		bank.setName("BloodBank1");
		bank.setAddress("Leicester");
		
		Users u=factory.createUsers();
		u.setAddress("Tibet");
		u.setAge(22);
		u.setBloodGroup("B+");
		u.setName("user1");
		u.setContact(1010101);
		
		//Another user for direct
		Users u1=factory.createUsers();
		u1.setAddress("Nigeria");
		u1.setAge(21);
		u1.setBloodGroup("AB+");
		u1.setName("user2");
		u1.setContact(2020202);
		
		//create onlinereg class
		OnlineRegistration regusers=factory.createOnlineRegistration();
		regusers.setUserId(u.getName());
		regusers.setUsename("Sittu");
		regusers.setRegisterDate(new Date());
		regusers.setUser(u);
		bank.getRegistrationusers().add(regusers);
		
		
		//create Direct reg class
		//create Direct reg class
				DirectRegistration directreg=factory.createDirectRegistration();
				directreg.setUsename("Sittukala");
				directreg.setRegisterDate(new Date());
				directreg.setRegId(u1.getName());
				directreg.setUser(u1);
				bank.getRegistrationusers().add(directreg);
				//create Users -Blood donor
				
		BloodDonor donor=factory.createBloodDonor();
		donor.setIsEligible(true);
		
		
		//create Users -Blood Receiver
		BloodReceiver recipient=factory.createBloodReceiver();
		recipient.setReceiverID("Reciever1");
		
		//create Stock
		
		Stock stock=factory.createStock();
		stock.setAvailableStockCount(10);
		stock.setIsEmptyStock(false);
		bank.getStocks().add(stock);
		
		
		//Hospital class
		Hospital hospital=factory.createHospital();
		hospital.setName("HosptalA");
		hospital.setAddress("LeicesterHospital");
		bank.getHospital().add(hospital);
		
		//Private hospital
		
		PrivateHospital privatehospital=factory.createPrivateHospital();
		privatehospital.setTrackLocation("ABC");
		privatehospital.setName("PrivateHosptalABC");
		privatehospital.setAddress("NunetonRoyalHospital");
		bank.getHospital().add(privatehospital);
		
		// As of here we preparing to save the model content
		// Register the XMI resource factory for the .websiteextension
		Resource.Factory.Registry reg= Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m= reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		// Obtain a new resource set
		System.out.println(m);
		ResourceSet resSet= new ResourceSetImpl();
		System.out.println("factory " + resSet.getPackageRegistry());
		System.out.println(resSet.getResourceFactoryRegistry());
		System.out.println(Resource.Factory.Registry.INSTANCE);
		System.out.println();
		// create a resource
		Resource resource= resSet.createResource(URI.createURI("task4_instance/instance.xmi"));
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(bank);
		resource.getContents().add(regusers);
		resource.getContents().add(directreg);
		resource.getContents().add(u);
		resource.getContents().add(u1);
		resource.getContents().add(hospital);
		resource.getContents().add(privatehospital);
		
		
		try{
			resource.save(Collections.EMPTY_MAP);
			} 
		catch(IOException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
