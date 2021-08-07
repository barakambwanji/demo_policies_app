//Copyright (c) 2016-%CurrentYear% Swiss Agency for Development and Cooperation (SDC)
//
//The program users must agree to the following terms:
//
//Copyright notices
//This program is free software: you can redistribute it and/or modify it under the terms of the GNU AGPL v3 License as published by the 
//Free Software Foundation, version 3 of the License.
//This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of 
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU AGPL v3 License for more details www.gnu.org.
//
//Disclaimer of Warranty
//There is no warranty for the program, to the extent permitted by applicable law; except when otherwise stated in writing the copyright 
//holders and/or other parties provide the program "as is" without warranty of any kind, either expressed or implied, including, but not 
//limited to, the implied warranties of merchantability and fitness for a particular purpose. The entire risk as to the quality and 
//performance of the program is with you. Should the program prove defective, you assume the cost of all necessary servicing, repair or correction.
//
//Limitation of Liability 
//In no event unless required by applicable law or agreed to in writing will any copyright holder, or any other party who modifies and/or 
//conveys the program as permitted above, be liable to you for damages, including any general, special, incidental or consequential damages 
//arising out of the use or inability to use the program (including but not limited to loss of data or data being rendered inaccurate or losses 
//sustained by you or third parties or a failure of the program to operate with any other programs), even if such holder or other party has been 
//advised of the possibility of such damages.
//
//In case of dispute arising out or in relation to the use of the program, it is subject to the public law of Switzerland. The place of jurisdiction is Berne.

package org.openimis.imispolicies;

import org.openimis.imispolicies.R;

public class Escape {
    public int CheckInsuranceNumber(String InsuranceNumber){

        if (InsuranceNumber.length() == 0 || InsuranceNumber.length() < 12 || InsuranceNumber.length() > 12){
            return R.string.MissingInsuranceNumber;
        }

        if (!InsuranceNumber.matches("[0-9]*$") || !isValidInsuranceNumber(InsuranceNumber)){
            return R.string.InvalidInsuranceNumber;

        }

        return 0;
    }

    private boolean isValidInsuranceNumber(String InsuranceNumber){
        String temp1 = InsuranceNumber;
        //int[] guess1 = new int[temp1.length()];temp1.charAt(temp1.length() - 1)
        int last = Integer.parseInt(temp1.substring(temp1.length() - 1, temp1.length()));

        String temp2 = temp1.substring(0, temp1.length() - 1);

        double temp3 = Double.parseDouble(temp2);

        if((temp3%7) == last){
            return true;
        }
        return false;
    }

}
