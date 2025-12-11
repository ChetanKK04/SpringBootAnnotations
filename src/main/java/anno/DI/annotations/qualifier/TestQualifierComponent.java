package anno.DI.annotations.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestQualifierComponent {

    private final TestQualifier testQualifier;


    public TestQualifierComponent(@Qualifier("TestQualifierClass2") TestQualifier testQualifier) {
        this.testQualifier = testQualifier;
    }

   public void checkWhichServicesCalled(){
       System.out.println(testQualifier.qualifierMethod());
    }
}
