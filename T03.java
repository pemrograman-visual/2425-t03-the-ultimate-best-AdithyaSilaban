// 12S24029-ADITHYA SILABAN
// 12S24048-OLIVIA TAMBUNAN

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, fBE, grade, kategori, kategoribuku;
        int tT, stok;
        double hP, mM, rating, diskon;

        do {
            iSBN = input.nextLine();
            if (iSBN.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tT = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                fBE = input.nextLine();
                hP = Double.parseDouble(input.nextLine());
                mM = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                diskon = mM / hP * -1 * 100;
                if (diskon >= 40) {
                    kategori = "Once in a lifetime";
                } else {
                    if (diskon > 20) {
                        kategori = "Never come twice";
                    } else {
                        if (diskon > 0) {
                            kategori = "No regret";
                        } else {
                            kategori = "---";
                        }
                    }
                }
                if (rating >= 4.7) {
                    grade = "Best Pick";
                } else {
                    if (rating >= 4.5 && rating < 4.7) {
                        grade = "Must Read";
                    } else {
                        if (rating >= 4.0 && rating < 4.5) {
                            grade = "Recommended";
                        } else {
                            if (rating >= 3.0 && rating < 4.0) {
                                grade = "Average";
                            } else {
                                if (rating < 3.0) {
                                    grade = "Low";
                                } else {
                                    grade = "---";
                                }
                            }
                        }
                    }
                }
                if (rating >= 4.7 && diskon > 40) {
                    kategoribuku = "The ultimate best";
                } else {
                    kategoribuku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tT + "|" + penerbit + "|" + fBE + "|" + hP + "|" + mM + "|" + stok + "|" + rating + "|" + grade + "|" + kategori + "|" + kategoribuku);
            }
        } while (!iSBN.equals("---"));
    }
}
