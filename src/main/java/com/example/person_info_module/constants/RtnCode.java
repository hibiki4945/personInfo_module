package com.example.person_info_module.constants;

public enum RtnCode {

    SUCCESSFUL("200", "successful!"),
    DATA_ERROR("400", "data error!"),
    NAME_BLANK_ERROR("400", "name blank error!"),
    NAME_KATAGANA_BLANK_ERROR("400", "name_katagana blank error!"),
    NAME_ROMA_BLANK_ERROR("400", "name_roma blank error!"),
    KOKUSEKI_BLANK_ERROR("400", "kokuseki blank error!"),
    GENDER_BLANK_ERROR("400", "gender blank error!"),
    BIRTHDAY_BLANK_ERROR("400", "birthday blank error!"),
    BIRTHDAY_FORMAT_ERROR("400", "birthday format error!"),
    COMPANY_IN_BLANK_ERROR("400", "company_in blank error!"),
    COMPANY_IN_FORMAT_ERROR("400", "company_in format error!"),
    COMPANY_OUT_BLANK_ERROR("400", "company_out blank error!"),
    COMPANY_OUT_FORMAT_ERROR("400", "company_out format error!"),
    PHONE_BLANK_ERROR("400", "phone blank error!"),
    CELL_PHONE_BLANK_ERROR("400", "cell_phone blank error!"),
    COMPANY_EMAIL_BLANK_ERROR("400", "company_email blank error!"),
    OTHER_EMAIL_BLANK_ERROR("400", "other_email blank error!"),
    POST_NUMBER_BLANK_ERROR("400", "post_number blank error!"),
    ADDRESS_BLANK_ERROR("400", "address blank error!"),
    PASSPORT_NUMBER_BLANK_ERROR("400", "passport_number blank error!"),
    PASSPORT_DEADLINE_BLANK_ERROR("400", "passport_deadline blank error!"),
    PASSPORT_DEADLINE_FORMAT_ERROR("400", "passport_deadline format error!"),
    STAY_CARD_NUMBER_BLANK_ERROR("400", "stay_card_number blank error!"),
    STAY_CARD_START_BLANK_ERROR("400", "stay_card_start blank error!"),
    STAY_CARD_START_FORMAT_ERROR("400", "stay_card_start format error!"),
    STAY_CARD_END_BLANK_ERROR("400", "stay_card_end blank error!"),
    STAY_CARD_END_FORMAT_ERROR("400", "stay_card_end format error!"),
    STAY_QUALIFICATION_BLANK_ERROR("400", "stay_qualification blank error!"),
    STAY_QUALIFICATION_FORMAT_ERROR("400", "stay_qualification format error!"),
    SECURITY_NUMBER_BLANK_ERROR("400", "security_number blank error!"),
    YEAR_MONEY_NUMBER_BLANK_ERROR("400", "year_money_number blank error!"),
    BANK_NAME_BLANK_ERROR("400", "bank_name blank error!"),
    BRANCH_NAME_BLANK_ERROR("400", "branch_name blank error!"),
    BANK_ACCOUNT_NAME_BLANK_ERROR("400", "bank_account_name blank error!");
    
    private String code;
    
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private RtnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
}