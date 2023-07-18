package de.telran.Viktoriia.Shustrova;

import java.io.File;

public class CreatePackage {
    public static void main(String[] args) {
        String packageName = "de.telran.Viktoriia.Shustrova";
        createPackageOnDesktop(packageName);
    }

    private static void createPackageOnDesktop(String packageName) {
        String desktopPath = System.getProperty("user.home") + File.separator + "Desktop";
        String packagePath = desktopPath + File.separator + packageName.replace('.', File.separatorChar);

        File packageDir = new File(packagePath);
        if (packageDir.mkdirs()) {
            System.out.println("Package created successfully at: " + packageDir.getAbsolutePath());
        } else {
            System.out.println("Failed to create package at: " + packageDir.getAbsolutePath());
        }
    }
}
