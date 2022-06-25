# ipp_dawid_bozek_2022
Indywidualny projekt programistyczny - Dawid Bożek

## Podsumowanie
Co udało się zrobić - działająca aplikacja mobilna, która łączy się z internetem, pozwala na zalogowanie, rejestracje, wykorzystanie modulu tworzenia postaci, odtwarzacz wideo, zakładka z eventami, prymitywny kalendarz.
Co nie udało się zrobić - animacje, część networkingu, baza danych nie jest podpięta do ostatniej wersji na githubie, menu główne dalej nie jest w pełni funkcjonalne, brakuje jeszcze kilku pomniejszych funkcjonalności
Osobiście uważam, że pomimo tylu problemów organizacyjnych udało mi się od zera stworzyć bazę do projektu który od teraz będę tylko bardziej rozwijał, zwłaszcza że dalej uczę się Javy i zasad Androida.

## Zamysł projektu
Pomysłem przewodnim mojego projektu będzie stworzenie aplikacji mobilnej na system Android, która ma na celu być wygodnym i szybkim sposobem do dostarczania ważnych informacji dla graczy "Genshin Impact". Będzie to zarówno baza postaci, możliwych do wyekwipowania broni czy optymalnych artefaktów w zależności od podejmowanego wyzwania. Projekt w domyśle ma nie być skomplikowany w obsłudze, aby experience użytkownika był jak najlepszy i bezproblemowy. Aplikacja będzie informować nas o istniejących i nadchodzących eventach w grze, pozwoli nastawić budzik, aby nie przegapić kluczowych godzin danego dnia oraz zasugeruje nam na podstawie posiadanych postaci jaką kompozycję druzyny powinniśmy rozwijać. Produkt głównie skupiony na designie i dostarczeniu trudnych do zapamiętania oraz zmieniających się informacji. 

## Technologie
Do przygotowania mojego projektu wykorzystam Kotlina, który pozwala na wykorzystanie potencjału JVM bez uczenia się nowych składni. Jest to język bezpośredni kompatybilny z Javą, dlatego będę wykorzystywał te technologie naprzemiennie. Spróbuję przynajmniej oprzeć cały front i end aplikacji na Kotlinie, jednak mogą dojść do tego nowe technologie. Skupię się na wykorzystaniu "Ktor'a" jako głownego frameworka na którym zamierzam oprzeć webową część aplikacji. Wykorzystam najprawdopodobniej również emulator androida w celu sprawdzania poszczególnych buildów.
Środowisko w którym napiszę większość kodu będzie IntelliJ IDEA od JetBrains.
Bazę danych zapewnie shostuję na Firebasie lub Jetstaxie, który pozwala na postawienie maszyny w bezproblemowy sposób i bez większej wiedzy w tym zakresie, której nie posiadam.

## Harmonogram

# Faza pierwsza - Backend
- Nauka Kotlina w celu stworzenia pierwszego prototypu (10-24.03) - zrobione w terminie
- Struktura aplikacji, pierwszy uruchomiony build (31.03) - zrobione w terminie
- Tworzenie konta, rejestracja (7.04) - opóźnienie
- Skrypt tworzenia kompozycji postaci (14.04) - opóźnienie
# Faza druga - Frontend
- Praca nad grafikami, skończenie designu (21.04) - nie doszło do skutku
- Tworzenie poszczególnych funkcjonalności od strony użytkownika (28.04) - skonczone
- Animacje i połączenie aplikacji backendowych z frontendowymi (5.05) - nie było możliwości
# Faza trzecia - Networking
- Konfiguracja serwera, tworzenie bazy danych, praca z frameworkiem (19.06)
- Konfiguracja relacji aplikacja-chmura (koniec czerwca)




## Zamysł designu
![genshin companion 2](https://user-images.githubusercontent.com/80948162/158742456-4e614ac1-738c-4a67-a46a-24754981521c.png)
![genshin companion 3](https://user-images.githubusercontent.com/80948162/158742459-a80d1d36-f2eb-483d-ad45-e27008a18e98.png)
![genshin companion 7](https://user-images.githubusercontent.com/80948162/158742464-fda5b991-5159-4eea-b786-0d2bbc199895.png)
![genshin companion 4](https://user-images.githubusercontent.com/80948162/158742465-2138da5a-118b-4238-80c5-feac018ef27e.png)
![genshin companion 5](https://user-images.githubusercontent.com/80948162/158742467-fded71a2-4509-4abe-83ba-ff1b55c3f947.png)
![genshin companion 6](https://user-images.githubusercontent.com/80948162/158742468-1287b9b1-be7d-4fe5-ad32-103c2792c4a4.png)
