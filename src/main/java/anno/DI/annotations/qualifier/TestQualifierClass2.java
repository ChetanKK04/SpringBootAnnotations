package anno.DI.annotations.qualifier;

import org.springframework.stereotype.Service;

@Service("TestQualifierClass2")
public class TestQualifierClass2 implements TestQualifier {
    @Override
    public String qualifierMethod() {

        return "TestQualifierClass2";
    }
}
