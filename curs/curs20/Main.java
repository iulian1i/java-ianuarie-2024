package curs.curs20;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> numeCursanti = new ArrayList<>();

        Contract contract = new Contract("1", "ContractNume1", StareContractEnum.LEGAL);

        String stareSemnatString = StareContractEnum.SEMNAT.name();

        if (StareContractEnum.LEGAL.equals(contract.stare)) {
            System.out.println("Contract legal!");
        }

    }

}
