package com.programs1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryDemo {

    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("USA", "USA", 10, "2"));
        countryList.add(new Country("USA", "USA", 10, "4"));
        countryList.add(new Country("USA", "USA", 10, "4"));
        countryList.add(new Country("USA", "USA", 10, "2"));
        countryList.add(new Country("USA", "USA", 10, "6"));

        countryList.add(new Country("APAR", "India", 5, "2"));
        countryList.add(new Country("APAR", "India", 5, "4"));
        countryList.add(new Country("APAR", "India", 10, "4"));
        countryList.add(new Country("APAR", "Signapore", 10, "2"));
        countryList.add(new Country("APAR", "Signapore", 10, "6"));

        countryList.add(new Country("EMEC", "italy", 10, "2"));
        countryList.add(new Country("EMEC", "italy", 10, "4"));
        countryList.add(new Country("EMEC", "italy", 10, "4"));
        countryList.add(new Country("EMEC", "iron", 10, "2"));
        countryList.add(new Country("EMEC", "iron", 10, "6"));

        countryList.add(new Country("EMEC", "iron", 10, "2"));
        countryList.add(new Country("EMEC", "iron", 10, "4"));
        countryList.add(new Country("EMEC", "irland", 10, "4"));
        countryList.add(new Country("EMEC", "irland", 10, "2"));
        countryList.add(new Country("EMEC", "irland", 10, "6"));

        List<CountryData> countryDataList = new ArrayList<>();

        Map<String, List<Country>> countryByCity =
                countryList.stream().collect(Collectors.groupingBy(Country::getReg));

        for (String key : countryByCity.keySet()) {
            List<Country> countries = countryByCity.get(key);

            Map<String, List<Country>> namesData =
                    countries.stream().collect(Collectors.groupingBy(Country::getCountry));

            // Group by name and slot, then aggregate the values
            Map<String, Map<String, Integer>> groupedData = countries.stream()
                    .collect(Collectors.groupingBy(
                            Country::getCountry, // Group by country name
                            Collectors.groupingBy(
                                    Country::getSlotTime, // Group by slot
                                    Collectors.summingInt(Country::getAmount) // Sum the values
                            )
                    ));

            // Output the grouped and aggregated result
            groupedData.forEach((countryName, slotMap) -> {
                System.out.println("Country: " + countryName);
                slotMap.forEach((slot, totalValue) -> {
                    System.out.println("  Slot: " + slot + ", Total Value: " + totalValue);
                });
            });
        }

    }

}

class CountryData {
    List<String> data;
    Map<String, Integer> report;

    public CountryData(List<String> data, Map<String, Integer> report) {
        this.data = data;
        this.report = report;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public Map<String, Integer> getReport() {
        return report;
    }

    public void setReport(Map<String, Integer> report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "CountryData{" +
                "data=" + data +
                ", report=" + report +
                '}';
    }
}


class Country {
    String reg;
    String country;
    int amount;
    String slotTime;

    public Country(String reg, String country, int amount, String slotTime) {
        this.reg = reg;
        this.country = country;
        this.amount = amount;
        this.slotTime = slotTime;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(String slotTime) {
        this.slotTime = slotTime;
    }
}



