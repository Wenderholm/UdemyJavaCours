package com.company.interfejsy;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> saveValues);
}
