INSERT INTO place(number, occupited, reservation_id, row, room_id) VALUES (1,0,0,1,1),(2,0,0,1,1),(3,0,0,1,1),(4,0,0,1,1),(5,0,0,1,1),(1,0,0,1,2),(2,0,0,1,2),(3,0,0,1,2),(1,0,0,1,3),(2,0,0,1,3),(3,0,0,1,3);
INSERT INTO room(name) VALUES ('Sala 1'),('Sala 2'),('Sala 3');
INSERT INTO showing(date, movie_id, price, room_id) VALUES("2019-03-22 10:30:00",1,"23,50", 1),("2019-03-22 20:30:00",1,"23,50", 2),("2019-03-22 10:00:00",2,"23,50", 2),("2019-03-22 21:30:00",2,"23,50", 1),("2019-03-22 10:00:00",3,"23,50", 3),("2019-03-22 16:30:00",3,"23,50", 1),("2019-03-22 22:00:00",3,"23,50", 3);
INSERT INTO movie( age_category, cast, direction, duration, dyscryption, premiere, scenario,type) VALUES ("3+","Michael Semanick, Doc Kane","Brian Fee, Waldemar Modestowicz",109,"Samochód wyścigowy Zygzak McQueen z pomocą młodej trenerki staje do rywalizacji w kolejnym wyścigu.","2017-06-15","Kiel Murray, Bob Peterson","Animacja/Komedia"),
("18+","Mads Mikkelsen, Vanessa Hudgens, Katheryn Winnick", "Jonas Akerlund",120,"Gdy emerytowany zabójca zdaje sobie sprawę, że tym razem to on jest celem, wraca do gry i stawia czoła armii młodszych adeptów morderczego fachu.","2019-01-25","Jayson Rothwell","Akcja"),
("16+","Lupita Nyong'o, Elisabeth Moss , Winston Duke","Jordan Peele",129,"Adelaide wraca do domu. Kiedy nastaje zmrok, Wilsonowie widzą na podjeździe domu cztery trzymające się za ręce postacie. Wkrótce przyjdzie im zmierzyć się z niesamowitym przeciwnikiem – sobowtórami samych siebie","2019-03-19","","Horror")
