package com.xworkz.temple.external;

import com.xworkz.temple.internal.ShellCase;

public class ShellRunner {

        public static void main(String[] args) {
            ShellCase shellCase = new ShellCase();
            shellCase.wrap();

            ShellInfo shellInfo = new ShellInfo();
            shellInfo.details();
        }
    }


