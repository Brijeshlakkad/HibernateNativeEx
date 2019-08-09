# HibernateNativeEx

To setup connection with your database add configuration in **hibernate.conf.xml**.

If you are using database connection source other than MySQL, then you have to change one of dependencies in pom.xml file.

To run maven, use following corresponding command line:

**mvn clean**
- Invoking clean phase of Clean LifeCycle

**mvn compile**
- Invoking compile phase of Default Lifecycle

**mvn clean package**
- Invoking clean phase of Clean Lifecycle followed by package phase of Default Lifecycle.

**mvn clean install**
- Invoking clean phase of Clean Lifecycle followed by install phase of Default Lifecycle.

**mvn test**
- Invoking test phase of Default Lifecycle.

**mvn dependency:list**
- Invoking list goal of dependency plugin (a tool, not bound to any phase by default)

**mvn help:effective-pom**
- Invoking effective-pom goal of help plugin(tool)
