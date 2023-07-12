public class Computer {
    int storage;
    String printerModel;


// constructor method
    public Computer(int storage) {
        this.storage = storage;
        this.printerModel = "no printer connected";
    }

   int getStorage(){
        return this.storage;
    }

    public int addStorage(int addedStorage){
        return this.storage + addedStorage;
    }

//    sample answer this does not need to be returned so void is used
//    public void addStorage(int additionalStorage){
//        this.storage += additionalStorage
//    }

    String printMessage(){
        if(printerModel.equals("")){
        return "without";
        }
        else{
            return this.printerModel;
        }
    }





//    String getStorage(){
//        return this.storage;
//    }
//
//    void setStorage(String updateStorage){
//        this.storage = updateStorage;
//    }
}



