CREATE TABLE TBL_TOON (
    toonName    VARCHAR2(50)    NOT NULL,
    toonGenre   VARCHAR2(30)    NOT NULL,
    toonFin     NUMBER          NOT NULL,
    toonImg     VARCHAR(200)    NULL,
    toonDes     VARCHAR(500)    NULL,
    toonDate    DATE            DEFAULT SYSDATE,
    PRIMARY KEY(TOONNAME)  
);