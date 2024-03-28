package com.utad.inso.ejerciciosCasoDeUso.ejemploState;

public class LibraryLoanNotification {
    private String message;
    private Boolean isBookReturn;

    public LibraryLoanNotification(String message, Boolean isBookReturn){
        this.message=message;
        this.isBookReturn=isBookReturn;
    }

    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }

    public void setIsBookReturn(Boolean isBookReturn){
        this.isBookReturn=isBookReturn;
    }
    public Boolean getIsBookReturn(){
        return this.isBookReturn;
    }
}
