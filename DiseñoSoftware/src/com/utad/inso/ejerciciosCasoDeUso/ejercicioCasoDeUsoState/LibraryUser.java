package com.utad.inso.ejerciciosCasoDeUso.ejercicioCasoDeUsoState;

                    //decimos que es un usuario que va a consumir notficaciones
public class LibraryUser implements ModelPullPushObserver{
    private String name;
    private String address;
    private UserType userType;
    private Boolean activeAccount;

    public LibraryUser(String name, String address, UserType userType, Boolean activeAccount){
        super();
        this.name=name;
        this.address=address;
        this.userType=userType;
        this.activeAccount=activeAccount;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setUserType(UserType userType){
        this.userType=userType;
    }
    public UserType getUserType(){
        return this.userType;
    }

    public void setActiveAccount(Boolean activeAccount){
        this.activeAccount=activeAccount;
    }
    public Boolean getActiveAccount(){
        return this.activeAccount;
    }

    @Override
    public void update(ModelPullPushObservable pullPushObservable, Object o) {

        if(o instanceof LibraryLoanNotification){
            LibraryLoanNotification notification = (LibraryLoanNotification)o;
            System.out.println("Notification to user: " + notification.getMessage());
        }
    }
}
