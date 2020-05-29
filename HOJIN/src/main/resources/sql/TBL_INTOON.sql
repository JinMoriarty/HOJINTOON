CREATE TABLE TBL_INTOON (
    INTOON_LIST     NUMBER          NOT NULL,
    INTOON_TITLE    VARCHAR2(50)    NULL,
    INTOON_NUM      NUMBER          NOT NULL,
    INTOON_IMG      VARCHAR2(50)    NULL,
    INTOON_GOOD     NUMBER          NOT NULL,
    INTOON_DAY      DATE            DEFAULT SYSDATE,
    INTOON_LOOK     NUMBER          NOT NULL,
    INTOON_CASH     NUMBER          NOT NULL,
    INTOON_CONTENT  VARCHAR2(50)    NULL,
    INTOON_EXPLAIN  VARCHAR2(50)    NULL,
    
    PRIMARY KEY(INTOON_LIST),
    FOREIGN KEY(INTOON_TITLE) REFERENCES TBL_TOON(TOONNAME)
);
