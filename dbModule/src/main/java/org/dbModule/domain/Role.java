package org.dbModule.domain;

import java.util.Arrays;
import java.util.List;

public enum Role {
    MANAGER,
    DEVELOPER;

    public static List<Role> list() {
	return Arrays.asList(values());
    }

}
