package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

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
    
        //TODO Los usuarios no recibirán acceso a la biblioteca y a las notificaciones
        //estarán formadas por texto exclusivamente
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

        /*if(o != null){
            if(pullPushObservable instanceof LibraryLoanRequestContext){
                //Miramos si o es instancia de Book, si lo es nos imprimirá que se ha devuelto
                if((o instanceof Book)){
                    System.out.println("Notification to user: "+((LibraryLoanRequestContext)pullPushObservable).getLibraryUser().getName() + " library loan returned on " + ((LibraryLoanRequestContext)pullPushObservable).getCreatedDate() + ", " +o);
                }
                else{
                    System.out.println("Notification to user: " + o);
                }
            }
        }*/

        if(o instanceof LibraryLoanNotification){
            LibraryLoanNotification notification = (LibraryLoanNotification)o;
            if(notification.getIsBookReturn()){
                System.out.println("Notification to user: "+((LibraryLoanRequestContext)pullPushObservable).getLibraryUser().getName() + " library loan returned on " + ((LibraryLoanRequestContext)pullPushObservable).getCreatedDate() + ", " +notification.getMessage());
            }
            else{
                System.out.println("Notification to user: " + notification.getMessage());
            }
        }
    }
}
