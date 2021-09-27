
INSERT INTO tb_associates(cpf,name) VALUES ('03887344006', 'Ana Gray'); -- 03887344006 - ABLE_TO_VOTE    -  01
INSERT INTO tb_associates(cpf,name) VALUES ('97611132059', 'Bob Green'); -- 97611132059 - ABLE_TO_VOTE    -  02
INSERT INTO tb_associates(cpf,name) VALUES ('95451506027', 'Carl Blue'); -- 95451506027 - ABLE_TO_VOTE    -  03
INSERT INTO tb_associates(cpf,name) VALUES ('37004001016', 'Debora Red'); -- 37004001016 - ABLE_TO_VOTE    -  04
INSERT INTO tb_associates(cpf,name) VALUES ('15538624064', 'Evan Yellow'); -- 15538624064 - ABLE_TO_VOTE    -  05
INSERT INTO tb_associates(cpf,name) VALUES ('24718949092', 'Fabiana Brown'); -- 24718949092 - UNABLE_TO_VOTE  -  06
INSERT INTO tb_associates(cpf,name) VALUES ('95451506027', 'George White'); -- 95451506027 - UNABLE_TO_VOTE  -  07
INSERT INTO tb_associates(cpf,name) VALUES ('16023022006', 'Holland Black'); -- 16023022006 - UNABLE_TO_VOTE  -  08
INSERT INTO tb_associates(cpf,name) VALUES ('64229261039', 'Iara Pink'); -- 64229261039 - UNABLE_TO_VOTE  -  09
INSERT INTO tb_associates(cpf,name) VALUES ('51387167006', 'Jack Purple'); -- 51387167006 - UNABLE_TO_VOTE  -  10

--DECLARE @NOW TIMESTAMP;
SET @NOW = CURRENT_TIMESTAMP();

INSERT INTO tb_agendas(description, session_time_minutes, start_of_session, end_of_session) VALUES ('La pergunta?', 1, @NOW, DATEADD('MINUTE', 1, @NOW));
INSERT INTO tb_agendas(description, session_time_minutes, start_of_session, end_of_session) VALUES ('Cuma?', 1, @NOW, DATEADD('MINUTE', 1, @NOW));

--INSERT INTO tb_voting_sessions(associate_id, agenda_id, vote, date_vote, is_closed) VALUES (1, 1, TRUE, @NOW, FALSE);
--INSERT INTO tb_voting_sessions(associate_id, agenda_id, vote, date_vote, is_closed) VALUES (1, 1, TRUE, @NOW, FALSE);