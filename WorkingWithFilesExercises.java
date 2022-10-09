import java.util.*;
import java.io.*;

public class WorkingWithFilesExercises {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#1"));
        boyGirl(input1);
        System.out.println();

        Scanner input2 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#2"));
        evenNumbers(input2);
        System.out.println();

        Scanner input3 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#3"));
        negativeSum(input3);
        System.out.println();

        Scanner input4 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#4"));
        countCoins(input4);
        System.out.println();

        Scanner input5 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#5"));
        collapseSpaces(input5);
        System.out.println();

        Scanner input6 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#6"));
        readEntireFile(input6);
        System.out.println();

        Scanner input7 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#7"));
        flipLines(input7);
        System.out.println();

        Scanner input8 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#8_input"));
        PrintStream output8 = new PrintStream(
                new File(
                        "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#8_output"));
        doubleSpace(input8, output8);
        System.out.println();

        Scanner input9 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#9"));
        wordWrap(input9);
        System.out.println();

        Scanner input10 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#10"));
        modifyWordWrap(input10);
        System.out.println();

        Scanner input11 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#11"));
        wordWrapWhole(input11);
        System.out.println();

        Scanner input12 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#12"));
        stripHtmlTags(input12);
        System.out.println();

        Scanner input13 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#13"));
        stripComments(input13);
        System.out.println();

        Scanner input14 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#14"));
        printDuplicates(input14);
        System.out.println();

        Scanner input15 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#15"));
        coinFlip(input15);
        System.out.println();

        Scanner input16 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#16"));
        mostCommonNames(input16);
        System.out.println();

        Scanner input17 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#17"));
        inputStats(input17);
        System.out.println();

        Scanner input18 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#18"));
        plusScores(input18);
        System.out.println();

        Scanner input19 = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#19_input"));
        PrintStream output19 = new PrintStream(
                new File(
                        "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#19_output"));
        leetSpeak(input19, output19);
        System.out.println();
    }

    // boyGirl accepts a Scanner that is reading its input from a file
    // containing a series of names followed by integers. The names alternate
    // between boys’ names and girls’ names. The method compute the
    // absolute difference between the sum of the boys’ integers and the sum of the
    // girls’ integers. The input could end with either a boy or girl; don't
    // assume that it contains an even number of names.
    public static void boyGirl(Scanner input) {
        int countBoy = 0;
        int countGirl = 0;
        int sumBoy = 0;
        int sumGirl = 0;
        int count = 1;
        while (input.hasNext()) {
            if (count % 2 != 0) {
                String boy = input.next();
                countBoy++;
                sumBoy += input.nextInt();
                count++;
            } else if (count % 2 == 0) {
                String girl = input.next();
                countGirl++;
                sumGirl += input.nextInt();
                count++;
            }
        }
        System.out.println("Exercise #1: boyGirl");
        System.out.println(countBoy + " boys, " + countGirl + " girls\nDifference between boys' and girls' sum: "
                + (Math.abs(sumBoy - sumGirl)));
    }

    // evenNumbers accepts a Scanner reading input from a file with a series of
    // integers, and report various statistics about the integers to the console.
    // Report the total number of numbers, the sum of the numbers, the count of even
    // numbers and the percent of even numbers
    public static void evenNumbers(Scanner input) {
        int total = 0;
        int even = 0;
        int sum = 0;
        while (input.hasNextInt()) {
            int num = input.nextInt();
            total++;
            sum += num;
            if (num % 2 == 0)
                even++;
        }
        System.out.println("Exercise #2: evenNumbers\n" + total + " numbers, sum = " + sum + "\n" + even + " evens ("
                + (double) even / total * 100 + "%)");
    }

    // negativeSum accepts a Scanner reading input from a file containing a
    // series of integers, and print a message to the console indicating whether the
    // sum starting from the first number is ever negative. Return
    // true if a negative sum can be reached and false if not.
    public static boolean negativeSum(Scanner input) {
        int count = 0;
        int sum = 0;
        while (input.hasNext()) {
            sum += input.nextInt();
            count++;
            if (sum < 0) {
                System.out.println("Exercise #3: negativeSum\nsum of " + sum + " after " + count + " steps");
                return true;
            }
        }
        System.out.println("Exercise #3: negativeSum\nno negative sum");
        return false;
    }

    // cointCoins accepts a Scanner representing an input file whose data is a
    // series of pairs of tokens, where each pair begins with an integer and is
    // followed by the type of coin, which will be “pennies” (1 cent each),
    // “nickels” (5 cents each), “dimes” (10 cents each), or “quarters” (25 cents
    // each), case-insensitively. Add up the cash values of all the coins and print
    // the total money
    public static void countCoins(Scanner input) {
        int sum = 0;
        int quantity;
        while (input.hasNext()) {
            quantity = input.nextInt();
            String name = input.next();
            if (name.toLowerCase().equals("pennies"))
                sum += quantity;
            else if (name.toLowerCase().equals("nickels"))
                sum += quantity * 5;
            else if (name.toLowerCase().equals("dimes"))
                sum += quantity * 10;
            else if (name.toLowerCase().equals("quarters"))
                sum += quantity * 25;
        }
        System.out.println("Exercise #4: countCoins\nTotal money: $" + (double) sum / 100);
    }

    // collapseSpaces accepts a Scanner representing an input file as its
    // parameter, then reads that file and outputs it with all its tokens separated
    // by single spaces, collapsing any sequences of multiple spaces into single
    // spaces.
    public static void collapseSpaces(Scanner input) {
        System.out.println("Exercise #5: collapseSpaces");
        while (input.hasNextLine())
            helperCollapseSpaces(input, input.nextLine());
    }

    private static void helperCollapseSpaces(Scanner input, String text) {
        Scanner data = new Scanner(text);
        if (data.hasNext())
            System.out.print(data.next());
        while (data.hasNext()) {
            System.out.print(" " + data.next());
        }
        System.out.println();
    }

    // readEntireFile accepts a Scanner representing an input file as its
    // parameter, then reads that file and returns its entire text contents as a
    // String.
    public static void readEntireFile(Scanner input) {
        System.out.println("Exercise #6: readEntireFile");
        while (input.hasNextLine())
            System.out.println(input.nextLine());
    }

    // flipLines accepts a Scanner for an input file and writes to the console
    // the same file’s contents with each pair of lines reversed in order. If the
    // file contains an odd number of lines, leave the last line unmodified
    public static void flipLines(Scanner input) {
        int count = 0;
        String text1 = "";
        String text2 = "";
        System.out.println("Exercise #7: flipLines");
        while (input.hasNextLine()) {
            count++;
            if (count % 2 != 0)
                text1 = input.nextLine();
            else if (count % 2 == 0) {
                text2 = input.nextLine();
                System.out.println(text2);
                System.out.println(text1);
                text1 = "";
            }
        }
        if (!text1.equals(""))
            System.out.println(text1);
    }

    // /doubleSpace accepts a Scanner for an input file and a PrintStream for
    // an output file as its parameters, writing into the output file a
    // double-spaced version of the text in the input file.
    public static void doubleSpace(Scanner input, PrintStream output) {
        System.out.println("Exercise #8: doubleSpace(create a file and output)");
        while (input.hasNextLine()) {
            output.println(input.nextLine());
            output.println();
        }
    }

    // wordWrap accepts a Scanner representing an input file as its parameter
    // and outputs each line of the file to the console, word-wrapping all lines
    // that are longer than 60 characters
    public static void wordWrap(Scanner input) {
        int time = 0;
        int i = 1;
        System.out.println("Exercise #9: wordWrap");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            time = text.length() / 60;
            for (i = 1; i <= time; i++)
                System.out.println(text.substring((i - 1) * 60, 60 * i));
            System.out.println(text.substring((i - 1) * 60));
        }
    }

    // Modify the preceding wordWrap method so that it outputs the newly wrapped
    // text back into the original file. (Be careful—don’t output into a file while
    // you are reading it!) Also, modify it to use a class constant for the maximum
    // line length rather than hard-coding 60.
    public static void modifyWordWrap(Scanner input) throws FileNotFoundException {
        String str = "";
        int time = 0;
        int i = 1;
        final int length = 60;
        System.out.println("Exercise #10: modifyWordWrap");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            time = text.length() / length;
            for (i = 1; i <= time; i++) {
                System.out.println(text.substring((i - 1) * length, length * i));
                str += text.substring((i - 1) * length, length * i) + "\n";
            }
            System.out.println(text.substring((i - 1) * length));
            str += text.substring((i - 1) * length) + "\n";
        }
        PrintStream output = new PrintStream(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#10"));
        output.print(str);
    }

    // Modify the preceding wordWrap method so that it only wraps whole words, never
    // chopping a word in half. Assume that a word is any whitespace-separated token
    // and that all words are under 60 characters in length
    public static void wordWrapWhole(Scanner input) throws FileNotFoundException {
        int charCount = 0;
        String s = "";
        final int length = 60;
        System.out.println("Exercise #11: wordWrapWhole");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            Scanner data = new Scanner(text);
            while (data.hasNext()) {
                String word = data.next();
                if (charCount > 60 || (charCount + word.length()) > length) {
                    System.out.println();
                    charCount = 0;
                    s += "\n";
                }
                charCount += word.length();
                System.out.print(word + " ");
                s += word + " ";
            }
            System.out.println();
            s += "\n";
        }
        PrintStream output = new PrintStream(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#11"));
        output.print(s);
    }

    // stripHtmlTags accepts a Scanner representing an input file containing an
    // HTML web page as its parameter, then reads that file and prints the file’s
    // text with all HTML tags removed. A tag is any text between the characters <
    // and >
    public static void stripHtmlTags(Scanner input) {
        System.out.println("Exercise #12: stripHtmlTags");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '<') {
                    while (i < line.length() && line.charAt(i) != '>')
                        i++;
                    continue;
                }
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }

    // stripComments accepts a Scanner representing an input file containing a
    // Java program as its parameter, reads that file, and then prints the file’s
    // text with all comments removed. A comment is any text on a line from // to
    // the end of the line, and any text between /* and */ characters.
    public static void stripComments(Scanner input) {
        String s = "";
        String line = "";
        boolean isComment = false;
        System.out.println("Exercise #13: stripComments");
        while (input.hasNextLine()) {
            line = input.nextLine();
            Scanner data = new Scanner(line);
            while (data.hasNext()) {
                s = data.next();
                if (s.equals("/*") || isComment == true) {
                    isComment = true;
                    while (!s.equals("*/") && data.hasNext())
                        s = data.next();
                    if (s.equals("*/")) {
                        s = "";
                        isComment = false;
                        System.out.print(" ");
                    }
                    continue;
                } else if (s.equals("//"))
                    break;
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    // printDuplicates takes as a parameter a Scanner containing a series of
    // lines. Method examines each line looking for consecutive
    // occurrences of the same token on the same line and print each duplicated
    // token, along with the number of times that it appears consecutively.
    // Nonrepeated tokens are not printed. Ignore the case of repetition
    // across multiple lines (such as if a line ends with a given token and the next
    // line starts with the same token). Assume that each line of the file
    // contains at least 1 token of input.
    public static void printDuplicates(Scanner input) {
        String last = "";
        String current = "";
        int currentCount = 0;
        System.out.println("Exercise #14: printDuplicates");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            Scanner data = new Scanner(text);
            if (data.hasNext()) {
                last = data.next();
                currentCount = 1;
            }

            while (data.hasNext()) {
                current = data.next();
                if (!current.equals(last)) {
                    if (currentCount > 1)
                        System.out.print(last + "*" + currentCount + " ");
                    currentCount = 1;
                    last = current;
                } else if (current.equals(last))
                    currentCount++;
            }
            if (currentCount > 1)
                System.out.println(last + "*" + currentCount);
            else
                System.out.println();
        }

    }

    // coinFlip accepts a Scanner representing an input file of coin flips that
    // are heads (H) or tails (T). Consider each line to be a separate set of coin
    // flips and output the number and percentage of heads in that line. If it is
    // more than 50%, print “You win!”.
    public static void coinFlip(Scanner input) {
        int countHead = 0;
        int total = 0;
        System.out.println("Exercise #15: coinFlip");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            Scanner data = new Scanner(text);
            while (data.hasNext()) {
                String s = data.next();
                if (s.toLowerCase().equals("h"))
                    countHead++;
                total++;
            }
            System.out.println(countHead + " heads (" + (double) countHead / total * 100 + "%)");
            if ((double) countHead / total * 100 > 50)
                System.out.println("You win!");
            else
                System.out.println();
            System.out.println();
            total = 0;
            countHead = 0;
        }
    }

    // mostCommonNames accepts a Scanner representing an input file with names
    // on each line separated by spaces. Some names appear multiple times in a row
    // on the same line. For each line, print the most commonly occurring name. If
    // there’s a tie, use the first name that had that many occurrences; if all
    // names are unique, print the first name on the line
    public static void mostCommonNames(Scanner input) {
        int most = 0;
        String nameMost = "";
        int current = 0;
        String nameCurrent = "";
        String nameLast = "";
        System.out.println("Exercise #16: mostCommonNames");
        while (input.hasNextLine()) {
            String text = input.nextLine();
            Scanner data = new Scanner(text);
            while (data.hasNext()) {
                nameCurrent = data.next();
                if (nameCurrent.equals(nameLast))
                    current++;
                else if (!nameCurrent.equals(nameLast)) {
                    if (current > most) {
                        most = current;
                        nameMost = nameLast;
                    }
                    current = 1;
                    nameLast = nameCurrent;
                }
            }
            System.out.println("Most common: " + nameMost);
            nameMost = nameLast = "";
            most = current = 0;
        }
    }

    // inputStats accepts a Scanner representing an input file and reports the
    // number of lines, the longest line, the number of tokens on each line, and the
    // length of the longest token on each line
    public static void inputStats(Scanner input) {
        int longest = 0;
        int total = 0;
        int totalToken = 0;
        int lineNumber = 0;
        int longestTotalToken = 0;
        String longestLine = "";

        System.out.println("Exercise #17: inputStats");
        while (input.hasNextLine()) {
            lineNumber++;
            String line = input.nextLine();
            Scanner data = new Scanner(line);
            while (data.hasNext()) {
                total++;
                String token = data.next();
                totalToken += token.length();
                if (token.length() > longest)
                    longest = token.length();
            }
            if (totalToken > longestTotalToken) {
                longestLine = line;
                longestTotalToken = totalToken;
            }
            System.out.println("Line " + lineNumber + " has " + total + " tokens (longest = " + longest + ")");
            longest = total = totalToken = 0;
        }
        System.out.println("Longest line: " + longestLine);
    }

    // plusScores accepts a Scanner representing an input file containing a
    // series of lines that represent student records. Each student record takes up
    // two lines of input. The first line has the student’s name and the second line
    // has a series of plus and minus characters.
    public static void plusScores(Scanner input) {
        int count = 0;
        int plus = 0;
        String text = "";
        int total = 0;
        System.out.println("Exercise #18: plusScores");
        while (input.hasNextLine()) {
            count++;
            if (count % 2 != 0)
                System.out.print(input.nextLine() + ": ");
            else if (count % 2 == 0) {
                text = input.nextLine();
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == '+')
                        plus++;
                }
                total = text.length();
                System.out.println((double) plus / total * 100 + "% plus");
                plus = 0;
                count = 0;
            }
        }
    }

    // leetSpeak accepts two parameters: a Scanner representing an input file,
    // and a PrintStream representing an output file. Convert the input file’s text
    // to “leet speak,” where various letters are replaced by other letters/numbers,
    // and output the new text to the given output file. Replace "o" with "0", "l"
    // (lowercase “L”) with "1" (the number one), "e" with "3", "a" with "4", "t"
    // with "7", and an "s" at the end of a word with "Z". Preserve the original
    // line breaks from the input. Also wrap each word of input in parentheses.
    public static void leetSpeak(Scanner input, PrintStream output) throws FileNotFoundException {
        String str = "";
        String text = "";
        String word = "";
        System.out.println("Exercise #19: leetSpeak");
        while (input.hasNextLine()) {
            text = input.nextLine();
            Scanner data = new Scanner(text);
            while (data.hasNext()) {
                word = data.next();
                str += "(";
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == 'o')
                        str += 0;
                    else if (word.charAt(i) == 'l')
                        str += 1;
                    else if (word.charAt(i) == 'e')
                        str += 3;
                    else if (word.charAt(i) == 'a')
                        str += 4;
                    else if (word.charAt(i) == 't')
                        str += 7;
                    else if ((word.charAt(i) == 's' && i + 1 < word.length() && word.charAt(i + 1) == ' ') ||
                            (word.charAt(i) == 's' && i == word.length() - 1)) {
                        str += "Z ";
                        i++;
                    } else
                        str += word.charAt(i);
                }
                str += ") ";
            }
            str += "\n";
        }
        output.print(str);
        input = new Scanner(new File(
                "/Users/christinatrinh/Documents/Java Programming Projects/WorkingWithFilesProject/Chapter6_Exercise#19_output"));
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

    }
}
