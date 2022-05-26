package cdu.edu.quiz.entity;

import lombok.Data;

@Data
public class AjaxResult {
    private boolean success;//是否成功

    public AjaxResult(boolean success) {
        this.success = success;
    }

    public AjaxResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
