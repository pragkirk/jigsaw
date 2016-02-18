Note that module-info.java in the calc module must require the math and loan module since it references those classes through reflection. Otherwise, a runtime error occurs.

We fix this problem using ServiceLoader.