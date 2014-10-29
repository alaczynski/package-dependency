package org.alaczynski;

import jdepend.framework.DependencyConstraint;
import jdepend.framework.JDepend;
import jdepend.framework.JavaPackage;
import org.junit.Test;

import java.io.IOException;

public class JDependTest {

    @Test
    public void sandbox() throws IOException {
        DependencyConstraint constraint = new DependencyConstraint();
        JavaPackage domain = constraint.addPackage("org.alaczynski.domain");
        JavaPackage application = constraint.addPackage("org.alaczynski.application");
        JavaPackage util = constraint.addPackage("org.alaczynski.util");
        application.dependsUpon(domain);
        application.dependsUpon(util);
        JDepend jdepend = new JDepend();
        jdepend.addDirectory("target/classes");
        jdepend.analyze();

        jdepend.dependencyMatch(constraint);
    }
}
