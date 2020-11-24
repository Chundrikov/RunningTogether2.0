package com.run.baby.run.util;

import javassist.NotFoundException;

public class ValidationUtil {
    public static <T> T checkNotFoundWithId(T object, int id) throws NotFoundException {
        checkNotFoundWithId(object != null, id);
        return object;
    }

    public static void checkNotFoundWithId(boolean found, int id) throws NotFoundException {
        checkNotFound(found, "id=" + id);
    }
    public static <T> T checkNotFound(T object, String msg) throws NotFoundException {
        checkNotFound(object != null, msg);
        return object;
    }

    public static void checkNotFound(boolean found, String msg) throws NotFoundException {
        if (!found) {
            throw new NotFoundException("Not found entity with " + msg);
        }
    }
}
