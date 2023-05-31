package Basics;

//Interface example for a File Storage service
interface FileStorage {
 boolean storeFile(String filePath, byte[] fileData);
 byte[] retrieveFile(String filePath);
 boolean deleteFile(String filePath);
}

//Implementation of FileStorage interface for a Cloud Storage service
class CloudStorage implements FileStorage {
 @Override
 public boolean storeFile(String filePath, byte[] fileData) {
     // Implementation specific to storing a file in a cloud storage service
     System.out.println("Storing file in the cloud: " + filePath);
     return true;
 }
 @Override
 public byte[] retrieveFile(String filePath) {
     // Implementation specific to retrieving a file from a cloud storage service
     System.out.println("Retrieving file from the cloud: " + filePath);
     return new byte[0];
 }
 @Override
 public boolean deleteFile(String filePath) {
     // Implementation specific to deleting a file from a cloud storage service
     System.out.println("Deleting file from the cloud: " + filePath);
     return true;
 }
}

//Implementation of FileStorage interface for a Local Disk Storage service
class LocalDiskStorage implements FileStorage {
 @Override
 public boolean storeFile(String filePath, byte[] fileData) {
     // Implementation specific to storing a file on a local disk
     System.out.println("Storing file on local disk: " + filePath);
     return true;
 }

 @Override
 public byte[] retrieveFile(String filePath) {
     // Implementation specific to retrieving a file from a local disk
     System.out.println("Retrieving file from local disk: " + filePath);
     return new byte[0];
 }

 @Override
 public boolean deleteFile(String filePath) {
     // Implementation specific to deleting a file from a local disk
     System.out.println("Deleting file from local disk: " + filePath);
     return true;
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     FileStorage cloudStorage = new CloudStorage();
     cloudStorage.storeFile("documents/report.pdf", new byte[]{/* File data */});
     cloudStorage.retrieveFile("images/photo.jpg");
     cloudStorage.deleteFile("documents/report.pdf");

     FileStorage localDiskStorage = new LocalDiskStorage();
     localDiskStorage.storeFile("documents/report.pdf", new byte[]{/* File data */});
     localDiskStorage.retrieveFile("images/photo.jpg");
     localDiskStorage.deleteFile("documents/report.pdf");
 }
}

interface InterfaceA {
    default void myMethod() {
        System.out.println("Default implementation of myMethod() in InterfaceA");
    }
}
interface InterfaceB {
    default void myMethod() {
        System.out.println("Default implementation of myMethod() in InterfaceB");
    }
}
class MyClass implements InterfaceA, InterfaceB {
    @Override//if not override we get compilation issue
    public void myMethod() {
        // Resolve the conflict by providing a custom implementation
        System.out.println("Custom implementation of myMethod() in MyClass");
    }
}
