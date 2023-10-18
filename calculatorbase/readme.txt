Note that module-info.java in the calc module must require the math and
loan module since it references those classes through reflection.
Otherwise, a runtime error occurs.

We fix this problem using ServiceLoader.

NOTE: When running buildseparate.sh, notice that you cannot build these
modules independently because the module-info.java in the calc module
requires math and loan. This is because the CalculatorTextUI
instantiates these classes via reflection but that are module private
and cannot be accessed. The calculator service example fixes this
problem.

Steps
1.) ./build.sh
2.) ./package.sh
3.) ./run.sh
4.) Go delete math.jar