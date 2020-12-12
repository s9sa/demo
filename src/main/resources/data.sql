//DROP TABLE visitor;
//CREATE TABLE visitor(VISITORID int(11),NAME VARCHAR, VISIT_DATE date, VISIT_TIME time);
//INSERT INTO visitor VALUES(1,'Ashraf', PARSEDATETIME('29/04/2020', 'dd/MM/yyyy'), PARSEDATETIME('13:00', 'HH:mm')), (2,'Ali', PARSEDATETIME('02/04/2020', 'dd/MM/yyyy'), PARSEDATETIME('14:00', 'HH:mm'));

INSERT INTO visitor(name,visit_date,visit_time) VALUES('Ashraf', PARSEDATETIME('29/04/2020', 'dd/MM/yyyy'), PARSEDATETIME('13:00', 'HH:mm'));
INSERT INTO visitor(name,visit_date,visit_time) VALUES('Ali', PARSEDATETIME('01/04/2020', 'dd/MM/yyyy'), PARSEDATETIME('14:00', 'HH:mm'));
COMMIT;