# Uruchamianie projektu

Aby uruchomić projekt należy trzeba mieć zainstalowany w systemie Maven. Kolejne kroki:
* Przejdź do katalogu projektu
* Wpisz: mvn clean package
* Pojawi się plik: target/pl.knpj.s13302.war
* Powyższy plik należy przekopiować do katalogu webapps serwera Tomcat
* Uruchomić serwer
* W przeglądarce wpisać: http://adres_serwera:port/pl.knpj.s13302/
