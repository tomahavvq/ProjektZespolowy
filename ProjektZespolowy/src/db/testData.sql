-- cwiczenia
INSERT INTO zesp.exercise(exercise_name,description,body_part) values ("KLATA" , "KLATA" , "KLATKA");
INSERT INTO zesp.exercise(exercise_name,description,body_part) values ("KLATA2" , "KLATA2" , "KLATKA");
INSERT INTO zesp.exercise(exercise_name,description,body_part) values ("PLECY" , "PLECY" , "PLECY");
INSERT INTO zesp.exercise(exercise_name,description,body_part) values ("BICEPS" , "BICEPS" , "BICEPS");
-- produkty do diety
INSERT INTO zesp.product(product_name,carbohydrates,fat,protein,kcal) values ("SER" , 10 , 10 , 10 , 100);
INSERT INTO zesp.product(product_name,carbohydrates,fat,protein,kcal) values ("SER1" , 10 , 10 , 10 , 100);
INSERT INTO zesp.product(product_name,carbohydrates,fat,protein,kcal) values ("SER2" , 10 , 10 , 10 , 100);
-- treningi
INSERT INTO zesp.training(is_done, is_strength, training_date) values (FALSE , TRUE , STR_TO_DATE('2004/01/04', '%Y/%m/%d'));
INSERT INTO zesp.training(is_done, is_strength, training_date) values (FALSE , TRUE , STR_TO_DATE('2004/01/05', '%Y/%m/%d'));
INSERT INTO zesp.training(is_done, is_strength, training_date) values (FALSE , TRUE , STR_TO_DATE('2004/01/06', '%Y/%m/%d'));
-- cwiczenia do treningow
INSERT INTO zesp.exercise_details(is_done , repeatation, series , weight , exercise_id , training_id)
values( FALSE , 10 , 10 , 10 , 1 , 1);
INSERT INTO zesp.exercise_details(is_done , repeatation, series , weight , exercise_id , training_id)
values( FALSE , 10 , 10 , 10 , 2 , 1);
INSERT INTO zesp.exercise_details(is_done , repeatation, series , weight , exercise_id , training_id)
values( FALSE , 10 , 10 , 10 , 2 , 2);
INSERT INTO zesp.exercise_details(is_done , repeatation, series , weight , exercise_id , training_id)
values( FALSE , 10 , 10 , 10 , 1 , 2);
--