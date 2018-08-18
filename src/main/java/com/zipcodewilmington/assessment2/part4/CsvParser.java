package com.zipcodewilmington.assessment2.part4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CsvParser {
    private static final Logger LOGGER = Logger.getLogger(CsvParser.class.getName());

    /**
     * Given a string with fields separated by commas.
     * The fields are id, first name, last name, and email.
     * Parse the string and create a user using those fields.
     *
     * @param row String with fields separated by commas
     * @return User with data from the string
     * @throws BadDataException when the first field is not an integer
     *                          or when there are missing fields
     */
    protected User parseRow(String row) throws BadDataException {
        String[] fields = row.split(",");
        User user = new User();
        try {
            user.setId(Integer.valueOf(fields[0].trim()));
        } catch (NumberFormatException e) {
            BadDataException badDataException = new BadDataException("Bad number format" + fields[0]);
            badDataException.initCause(e);
            throw badDataException;
        }
        user.setFirstName(fields[1].trim());
        user.setLastName(fields[2].trim());
        user.setEmail(fields[3].trim());

        return user;
    }

    /**
     * Given a string representing the content of a CSV file.
     * Each row is separated by "\n".
     * The first row is the header. Ignore this row.
     * Map each row to a user.
     * @param csv String content of the a CSV
     * @return List<User>
     */
    public List<User> parseCsvString(String csv) {
        String[] rows = csv.split("\n");
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < rows.length; i++) { String row = rows[i]; try { User user = parseRow(row);
                userList.add(user);
            } catch (BadDataException e) { LOGGER.warning("Bad data from csv" + row); }
        }
        return userList;
    }

    /**
     * Given a file path, read the content of the file, and parse it into a list of User.
     * @param filePath
     * @return List<User>
     * @throws IOException when file is not found or cannot read content
     */
    public List<User> parseFile(String filePath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<User> userList = null;

        try { StringBuilder builder = new StringBuilder(); String line = reader.readLine();

            while (line != null) { builder.append(line); builder.append("\n"); line = reader.readLine(); }
                String wholeFile = builder.toString(); userList = parseCsvString(wholeFile); }

                finally { reader.close(); } return userList; }
}
