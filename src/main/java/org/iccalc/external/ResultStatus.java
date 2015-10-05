package org.iccalc.external;

public enum ResultStatus {
    SUCCESS("success"),
    FAIL("fail"),
    WARNING("warning");

    private String cssClass;

    private ResultStatus(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return this.cssClass;
    }
}
