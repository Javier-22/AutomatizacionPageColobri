package block_validation.model;

public class FormData {

    public String getStrRequired() {
        return strRequired;
    }

    public void setStrRequired(String strRequired) {
        this.strRequired = strRequired;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrConfirmPassword() {
        return strConfirmPassword;
    }

    public void setStrConfirmPassword(String strConfirmPassword) {
        this.strConfirmPassword = strConfirmPassword;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public String getStrUrl() {
        return strUrl;
    }

    public void setStrUrl(String strUrl) {
        this.strUrl = strUrl;
    }

    public String getStrDigitsOnly() {
        return strDigitsOnly;
    }

    public void setStrDigitsOnly(String strDigitsOnly) {
        this.strDigitsOnly = strDigitsOnly;
    }

    public String getStrRange() {
        return strRange;
    }

    public void setStrRange(String strRange) {
        this.strRange = strRange;
    }
    private String strRequired;
    private String strEmail;
    private String strPassword ;
    private String strConfirmPassword;
    private String strDate  ;
    private String strUrl ;
    private String strDigitsOnly;
    private String strRange;

    public String getStrValidate() {
        return strValidate;
    }

    public void setStrValidate(String strValidate) {
        this.strValidate = strValidate;
    }

    private String strValidate;
}
