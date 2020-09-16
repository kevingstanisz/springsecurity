package com.example.demo.security;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

public enum ApplicationUserRole {
    STUDENT(newHashSet()),
    ADMIN(newHashSet(ApplicationUserPermission.COURSE_READ, ApplicationUserPermission.COURSE_WRITE,
            ApplicationUserPermission.STUDENT_READ, ApplicationUserPermission.STUDENT_WRITE)),
    ADMINTRAIN(newHashSet(ApplicationUserPermission.COURSE_WRITE, ApplicationUserPermission.STUDENT_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
