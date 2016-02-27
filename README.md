# ProjektZespolowy

1.Wchodzimy do katalogu ProjektZespolowy-Vagrant.
2.Stawiamy wirtualkę komendą: vagrant up
3.Kawa
4.vagrant ssh
5.cd ProjektZespolowy
6. ./mavenRunDebug.sh (nie wiem czemu rzuca mi Permission Denied, alternatywnie w konsoli ręcznie wywolujemy linie z skryptu)

I.Wchodzimy do katalogu ProjektZespolowy
II. npm install (wczesniej trzeba zainstalować node.js)
III. bower install
IV. do IDE importujemy pom.xml
V. w IDE dodajemy Debug Configuration: Remote (http://stackoverflow.com/questions/21114066/attach-intellij-idea-debugger-to-a-running-java-process)
  ustawiamy hosta na 10.0.0.10:5005
VI.Budowa front endu: gulp build w konsoli lub w Idea PPM na gulpfile.js -> Show Gulp Tasks -> odpalamy 'z palca' build,
VII. uruchamiamy wcześniej utworzony debug configuration (równolegle musi być uruchomiony mavenRunDebug z pkt. 6)
VIII. cieszymy się aplikacją dostępną w przeglądarce pod adresem 10.0.0.10:8080 lub projektzespolowy.box:8080 (teoretycznie mamy tu hot swap javy, ale front trzeba chyba za każdym razem przebudowywać, w przyszłości mam nadzieję poprawić)

Odnośnie bazy danych:
  postawiłem mySQL, ale na razie nie potrafię się podłączyć (brakuje tuneli lub czegoś?), póki co baza H2 odpalana w pamięci.

TODO:
  podpięcie travisa
