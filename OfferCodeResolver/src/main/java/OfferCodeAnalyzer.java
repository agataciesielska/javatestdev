import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

public class OfferCodeAnalyzer {
    //Pełen kod oferty podany przez użytkownika.
    public String offerCode = "";

    //Lotnisko wylotu, PKW dla wycieczki samochodowej lub SKI dla wyjazdu na narty.
    public String departurePlace;

    //Kod destynacji.
    public String destinationPlace;

    //Data i godzina wylotu lub wyjazdu.
    public String departureDate;

    //Data i godzina lotu powrotnego lub wyjazdu powrotnego.
    public Date destinationDate;

    //Data zakwaterowania w hotelu.
    public Date hotelStartDate;

    //Długość wycieczki.
    public Short tripDuration;

    //Kod hotelu.
    public String hotelCode;

    //Kod pokoju.
    public String roomCode;

    //Typ wyżywienia.
    public char boardType;

    //Ilość osób dorosłych biorących udział w wycieczce.
    public Short adultNumber;

    //Ilość dzieci biorących udział w wycieczce.
    public String childNumber;

    //Daty urodzeń dzieci biorących udział w wycieczce.
    public String childBirtday;

    public void setOfferCode(String offerCode) {
        this.offerCode = offerCode.trim();
    }

    public String getOfferCode() {
        return offerCode;
    }

    public String datesConvert(String dateGiven) {
        SimpleDateFormat formatter = new SimpleDateFormat();

        SimpleDateFormat fromUser = new SimpleDateFormat("yyyyMMddHHmm");
        SimpleDateFormat myFormat = new SimpleDateFormat("\"yyyy.MM.dd G 'at' HH:mm");
        try {
            Date dateFromUser = fromUser.parse(dateGiven);
            return myFormat.format(dateFromUser);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void offerCodeAnalyzer() {

        String regexForWSandWO = "(?<departurePlace>\\D{3})(?<destinationPlace>\\D{2,})(?<departureDate>\\d{12})(?<hotelStartDate>\\d{8})(?<destinationDate>\\d{12})(?<tripDuration>L\\d{2})(?<hotelCode>\\w{8})(?<roomCode>\\w{5})(?<adultsNumber>A\\d{2})(?<childsnumber>Ch\\d{2})?(?<childsBirtday>BD\\d{8,})?";
        String regexForCH = "(?<departurePlace>\\D{3})(?<departureDate>\\d{12})(?<carrier>ENT|LO|OR|QS)(?<flightClass>Y|P|C)(?<flightNumber>\\d{4})(?<destinationPlace>\\D{2,})(?<destinationDate>\\d{12})(?<carrier2>ENT|LO|OR|QS)(?<flightClass2>Y|P|C)(?<flightNumber2>\\d{4})(?<adultsNumber>A\\d{1,2})(?<childsBirthday>C\\d{8,})?";
        String[] regexesArray = {regexForWSandWO, regexForCH};



        for (int i = 0; i < regexesArray.length; i++) {
            Pattern pattern = Pattern.compile(regexesArray[i]);
            Matcher matcher = pattern.matcher(getOfferCode());

            if (matcher.find()) {
                for (int j = 0; j < matcher.groupCount(); j++) {
                    System.out.println(matcher.group(j));
                    /*                System.out.println(pattern.namedGroups());*/

                }
/*
            this.departurePlace = "Kod wylotu: " + matcher.group("departurePlace");
            this.destinationPlace = "Kod przylotu: " + matcher.group("destinationPlace");
            this.departureDate = "Data i godzina wylotu: " + datesConvert(matcher.group("departureDate"));
            System.out.println("Data zakwaterowania: " + matcher.group("hotelStartDate"));
            System.out.println("Data i godzina przylotu: " + matcher.group("destinationDate"));
            System.out.println("Długość wycieczki: " + matcher.group("tripDuration"));
            System.out.println("Kod hotelu: " + matcher.group("hotelCode"));
            System.out.println("Kod pokoju: " + matcher.group("roomCode"));
            System.out.println("Liczba dorosłych: " + matcher.group("adultNumber"));
            System.out.println("Liczba dzieci: " + matcher.group("childNumber"));
            System.out.println("Daty urodzeń dzieci: " + matcher.group("childsBirtday"));*/
            }

        }}}