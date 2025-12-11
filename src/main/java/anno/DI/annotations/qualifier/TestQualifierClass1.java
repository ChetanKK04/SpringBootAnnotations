package anno.DI.annotations.qualifier;

import org.springframework.stereotype.Service;

@Service("TestQualifierClass1")
public class TestQualifierClass1 implements TestQualifier {
    @Override
    public String qualifierMethod() {
        return "TestQualifierClass1";
    }
}
