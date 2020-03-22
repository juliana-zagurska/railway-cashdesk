package ua.testing.railwaycashdesk.domain.enums;

public enum ProcessStatusCode {
    P ("W"),
    H ("H"),
    C ("C");

    private String code;

    ProcessStatusCode (String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
