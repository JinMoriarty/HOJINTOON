CREATE TABLE TBL_MEMBER (
    userId       VARCHAR2(50)     NOT NULL,
    userPass     VARCHAR2(100)    NOT NULL,
    userName     VARCHAR2(30)     NOT NULL,
    userPhone    VARCHAR2(30)     NOT NULL,
    userTag      NUMBER           DEFAULT 0,
    userPoint    NUMBER           NULL,
    regiDate     DATE             DEFAULT SYSDATE,
    verify       NUMBER           DEFAULT 0,
    PRIMARY KEY(USERID)
);