package anno;

import anno.DI.annotations.TestAutoWire;
import anno.DI.annotations.TestInjectAnnoClass;
import anno.DI.annotations.primary.TestPrimaryComponate;
import anno.DI.annotations.qualifier.TestQualifierComponent;
import anno.sterotype.annotations.TestComponentClass;
import anno.sterotype.annotations.TestControllerAnno;
import anno.sterotype.annotations.TestRepositoryAnno;
import anno.sterotype.annotations.TestServicesAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import anno.core.annotations.AdditionalServices;
import anno.core.annotations.TestConfigrationsBeanServices;
import anno.core.annotations.TestValueAnno;

import javax.inject.Inject;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	@Autowired
	TestConfigrationsBeanServices testConfigrationsBeanServices;

	@Autowired
	TestValueAnno testValueAnno;

	@Autowired
	AdditionalServices additionalServices;

	@Autowired
	TestAutoWire testAutoWire;

	@Autowired
	TestQualifierComponent testQualifierComponent;

	@Autowired
	TestPrimaryComponate testPrimaryComponate;

	@Inject
	TestInjectAnnoClass testInjectAnnoClass;

	@Autowired
	TestComponentClass testComponentClass;

	@Autowired
	TestServicesAnno testServicesAnno;

	@Autowired
	TestRepositoryAnno testRepositoryAnno;

	@Autowired
	TestControllerAnno testControllerAnno;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		System.out.println("All Spring Boot Annotations");


	}

	@Override
	public void run(String... args) throws Exception {

		testConfigrationsBeanServices.m2();

		System.out.println("Properties fron application : "+testValueAnno.getAppid());

		additionalServices.userAndPass();

		System.out.println(testAutoWire.m2());

		System.out.println("_________Qualifier_________");

		testQualifierComponent.checkWhichServicesCalled();

		System.out.println("_________Primary_________");

		System.out.println(testPrimaryComponate.checkwhichIsPrimaryClass());

		testInjectAnnoClass.testInjectAnnoClass();

		System.out.println("------------Stereo Type---------------");

		testComponentClass.testComponentClass();

		testServicesAnno.testServicesAnno();

		testRepositoryAnno.testRepositoryAnno();

		testControllerAnno.testControllerAnno();
	}
}
