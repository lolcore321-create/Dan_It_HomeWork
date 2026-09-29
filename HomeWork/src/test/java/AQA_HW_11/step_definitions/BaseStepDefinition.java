package AQA_HW_11.step_definitions;

import java.util.HashMap;
import java.util.Map;

public class BaseStepDefinition {
    protected static Map<String, String> dataContainer = new HashMap<>();
    protected static  String selectedProductName;

    protected String getValueFronMapByKey(String key) {
        return dataContainer.get(key);
    }

    protected void putValueToMapByKay(String key, String value) {
        dataContainer.put(key, value);
    }
}
