package sjht.erp.common.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardVO {
    private int bno;
    private EmployeeVO empno;
    private String title;
    private LocalDateTime regdate;
    private String contents;
    private String boardtype;
    private int boardcount;
}
