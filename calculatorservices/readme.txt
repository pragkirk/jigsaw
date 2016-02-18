Note that module-info.java in the calc module no longer requires the math and loan modules. Instead, it uses ServiceLoader to load the classes. 

Additionally, when we create the custom image, we need to be explicit in adding the math and loan modules since we’re no longer directly dependent upon them from within the calc module. In the previous example, the module-info.java for calc referenced those two modules.

Because of this, we no longer need Resource.properties.